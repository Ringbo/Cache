diff --git a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayJavaScriptPlugin.java b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayJavaScriptPlugin.java
index 8462f8b..cdd76d0 100644
--- a/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayJavaScriptPlugin.java
+++ b/subprojects/platform-play/src/main/java/org/gradle/play/plugins/PlayJavaScriptPlugin.java
@@ -77,7 +77,7 @@
         }
     }
 
-    void createJavaScriptMinifyTask(ModelMap<Task> tasks, final JavaScriptSourceSet javaScriptSourceSet, final PlayApplicationBinarySpecInternal binary, @Path("buildDir") final File buildDir) {
+    private void createJavaScriptMinifyTask(ModelMap<Task> tasks, final JavaScriptSourceSet javaScriptSourceSet, final PlayApplicationBinarySpecInternal binary, @Path("buildDir") final File buildDir) {
         final String minifyTaskName = binary.getTasks().taskName("minify", javaScriptSourceSet.getName());
         final File minifyOutputDirectory = new File(buildDir, String.format("%s/src/%s", binary.getProjectScopedName(), minifyTaskName));
         tasks.create(minifyTaskName, JavaScriptMinify.class, new Action<JavaScriptMinify>() {
