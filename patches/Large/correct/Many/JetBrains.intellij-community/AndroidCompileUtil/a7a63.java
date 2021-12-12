diff --git a/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java b/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
index a95ad18..2c3b5a3 100644
--- a/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
+++ b/plugins/android/src/org/jetbrains/android/compiler/AndroidCompileUtil.java
@@ -420,7 +420,7 @@
     ApplicationManager.getApplication().runReadAction(new Runnable() {
       public void run() {
         if (project.isDisposed()) return;
-        CompilerTask task = new CompilerTask(project, "Android auto-generation", true, false);
+        CompilerTask task = new CompilerTask(project, "Android auto-generation", true, false, true);
         CompileScope scope = new ModuleCompileScope(module, false);
         contextWrapper[0] = new CompileContextImpl(project, task, scope, null, false, false);
       }
