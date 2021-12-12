diff --git a/python/src/com/jetbrains/python/packaging/setupPy/SetupTaskIntrospector.java b/python/src/com/jetbrains/python/packaging/setupPy/SetupTaskIntrospector.java
index fbb27b6..12972f3 100644
--- a/python/src/com/jetbrains/python/packaging/setupPy/SetupTaskIntrospector.java
+++ b/python/src/com/jetbrains/python/packaging/setupPy/SetupTaskIntrospector.java
@@ -57,7 +57,7 @@
     List<AnAction> result = new ArrayList<AnAction>();
     try {
       for (SetupTask task : getTaskList(module, usesSetuptools(setupPyFile))) {
-        result.add(new RunSetupTaskAction(task.name, task.description));
+        result.add(new RunSetupTaskAction(task.name, task.name.replace("_", "__") + " (" + task.description + ")"));
       }
     }
     catch (Exception e) {
@@ -106,7 +106,7 @@
         final String path = distutilsCommandDir.getVirtualFile().getPath();
         List<SetupTask> tasks = cache.get(path);
         if (tasks == null) {
-          tasks = collectTasks(distutilsCommandDir);
+          tasks = collectTasks(distutilsCommandDir, setuptools);
           cache.put(path, tasks);
         }
         return tasks;
@@ -117,26 +117,29 @@
 
   private static final Set<String> SKIP_NAMES = ImmutableSet.of(PyNames.INIT_DOT_PY, "alias.py", "setopt.py", "savecfg.py");
 
-  private static List<SetupTask> collectTasks(PsiDirectory dir) {
+  private static List<SetupTask> collectTasks(PsiDirectory dir, boolean setuptools) {
     List<SetupTask> result = new ArrayList<SetupTask>();
     for (PsiFile commandFile : dir.getFiles()) {
       if (commandFile instanceof PyFile && !SKIP_NAMES.contains(commandFile.getName())) {
         final String taskName = FileUtil.getNameWithoutExtension(commandFile.getName());
-        result.add(createTaskFromFile((PyFile)commandFile, taskName));
+        result.add(createTaskFromFile((PyFile)commandFile, taskName, setuptools));
       }
     }
     return result;
   }
 
-  private static SetupTask createTaskFromFile(PyFile file, String name) {
+  private static SetupTask createTaskFromFile(PyFile file, String name, boolean setuptools) {
     SetupTask task = new SetupTask(name);
-    final PyClass taskClass = file.findTopLevelClass(name);
+    // setuptools wraps the build_ext command class in a way that we cannot understand; use the distutils class which it delegates to
+    final PyClass taskClass = (name.equals("build_ext") && setuptools)
+                              ? PyClassNameIndex.findClass("distutils.command.build_ext.build_ext", file.getProject())
+                              : file.findTopLevelClass(name);
     if (taskClass != null) {
-      final PyTargetExpression description = taskClass.findClassAttribute("description", false);
+      final PyTargetExpression description = taskClass.findClassAttribute("description", true);
       if (description != null) {
         final String descriptionText = PyUtil.strValue(PyUtil.flattenParens(description.findAssignedValue()));
         if (descriptionText != null) {
-          task.description = StringUtil.capitalize(descriptionText);
+          task.description = descriptionText;
         }
       }
 
@@ -150,7 +153,7 @@
         }
       }
 
-      final PyTargetExpression negativeOpt = taskClass.findClassAttribute("negative_opt", false);
+      final PyTargetExpression negativeOpt = taskClass.findClassAttribute("negative_opt", true);
       final Map<String, String> negativeOptMap = negativeOpt == null
                                                  ? Collections.<String, String>emptyMap()
                                                  : parseNegativeOpt(negativeOpt.findAssignedValue());
@@ -169,7 +172,7 @@
 
   private static List<PyExpression> resolveSequenceValue(PyClass aClass, String name) {
     List<PyExpression> result = new ArrayList<PyExpression>();
-    collectSequenceElements(aClass.findClassAttribute(name, false), result);
+    collectSequenceElements(aClass.findClassAttribute(name, true), result);
     return result;
   }
 
