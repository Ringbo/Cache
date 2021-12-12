diff --git a/python/src/com/jetbrains/python/packaging/PyCondaPackageManagerImpl.java b/python/src/com/jetbrains/python/packaging/PyCondaPackageManagerImpl.java
index 8f1564b..fc39356 100644
--- a/python/src/com/jetbrains/python/packaging/PyCondaPackageManagerImpl.java
+++ b/python/src/com/jetbrains/python/packaging/PyCondaPackageManagerImpl.java
@@ -171,8 +171,8 @@
     final String condaExecutable = PyCondaPackageService.getSystemCondaExecutable();
     if (condaExecutable == null) throw new PyExecutionException("Cannot find conda", "Conda", Collections.<String>emptyList(), new ProcessOutput());
 
-    final ArrayList<String> parameters = Lists.newArrayList(condaExecutable, "create", "-p", destinationDir,
-                                                            "python=" + version, "-y");
+    final ArrayList<String> parameters = Lists.newArrayList(condaExecutable, "create", "-p", destinationDir, "-y",
+                                                            "python=" + version);
 
     final GeneralCommandLine commandLine = new GeneralCommandLine(parameters);
     final CapturingProcessHandler handler = new CapturingProcessHandler(commandLine);
