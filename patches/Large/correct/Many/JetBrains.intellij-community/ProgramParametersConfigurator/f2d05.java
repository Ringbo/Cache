diff --git a/platform/lang-impl/src/com/intellij/execution/util/ProgramParametersConfigurator.java b/platform/lang-impl/src/com/intellij/execution/util/ProgramParametersConfigurator.java
index d65e4e0..9b8c16c 100644
--- a/platform/lang-impl/src/com/intellij/execution/util/ProgramParametersConfigurator.java
+++ b/platform/lang-impl/src/com/intellij/execution/util/ProgramParametersConfigurator.java
@@ -92,7 +92,7 @@
       }
     }
     workingDirectory = expandPath(workingDirectory, module, project);
-    if (!FileUtil.isAbsolute(workingDirectory) && defaultWorkingDir != null) {
+    if (!FileUtil.isAbsolutePlatformIndependent(workingDirectory) && defaultWorkingDir != null) {
       if (PathMacroUtil.DEPRECATED_MODULE_DIR.equals(workingDirectory)) {
         return defaultWorkingDir;
       }
