diff --git a/python/src/com/jetbrains/python/debugger/PyRunCythonExtensionsFilter.java b/python/src/com/jetbrains/python/debugger/PyRunCythonExtensionsFilter.java
index 95551c7..0deb244 100644
--- a/python/src/com/jetbrains/python/debugger/PyRunCythonExtensionsFilter.java
+++ b/python/src/com/jetbrains/python/debugger/PyRunCythonExtensionsFilter.java
@@ -103,7 +103,7 @@
         PythonEnvUtil.setPythonDontWriteBytecode(environment);
         GeneralCommandLine commandLine = new GeneralCommandLine(cmdline).withEnvironment(environment);
 
-        final boolean canCreate = FileUtil.ensureCanCreateFile(new File(sdkPath));
+        final boolean canCreate = FileUtil.ensureCanCreateFile(new File(helpersPath));
         final boolean useSudo = !canCreate && !SystemInfo.isWindows;
         Process process;
         if (useSudo) {
