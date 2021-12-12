diff --git a/python/src/com/jetbrains/python/packaging/PyPackageManager.java b/python/src/com/jetbrains/python/packaging/PyPackageManager.java
index 02acf4c..38cd937 100644
--- a/python/src/com/jetbrains/python/packaging/PyPackageManager.java
+++ b/python/src/com/jetbrains/python/packaging/PyPackageManager.java
@@ -257,7 +257,7 @@
   private void installManagement(String name) throws PyExternalProcessException {
     final File helperFile = PythonHelpersLocator.getHelperFile(name + ".tar.gz");
 
-    String helpersPath = getHelperPath(name);
+    final String helpersPath = getHelperPath(name);
 
     ProcessOutput output = getHelperOutput(PACKAGING_TOOL, Lists.newArrayList(UNTAR, helpersPath), false, helperFile.getParent());
 
@@ -271,7 +271,7 @@
     }
     final String fileName = dirName + name + File.separatorChar + "setup.py";
     try {
-      output = getProcessOutput(fileName, Collections.<String>singletonList(INSTALL), true, dirName);
+      output = getProcessOutput(fileName, Collections.<String>singletonList(INSTALL), true, dirName + name);
       final int retcode = output.getExitCode();
       if (output.isTimeout()) {
         throw new PyExternalProcessException(ERROR_TIMEOUT, fileName, Lists.newArrayList(INSTALL), "Timed out");
