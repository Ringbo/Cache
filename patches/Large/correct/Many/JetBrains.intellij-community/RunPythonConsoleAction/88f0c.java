diff --git a/python/src/com/jetbrains/python/console/RunPythonConsoleAction.java b/python/src/com/jetbrains/python/console/RunPythonConsoleAction.java
index a719b29..e008708 100644
--- a/python/src/com/jetbrains/python/console/RunPythonConsoleAction.java
+++ b/python/src/com/jetbrains/python/console/RunPythonConsoleAction.java
@@ -79,7 +79,7 @@
 
     String workingDir = PyConsoleOptionsProvider.getInstance(project).getPythonConsoleSettings().getWorkingDirectory();
     if (StringUtil.isEmpty(workingDir)) {
-      if (module != null) {
+      if (module != null && ModuleRootManager.getInstance(module).getContentRoots().length > 0) {
         workingDir = ModuleRootManager.getInstance(module).getContentRoots()[0].getPath();
       }
       else {
