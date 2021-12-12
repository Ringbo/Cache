diff --git a/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java b/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
index 72be01f..6273e0e 100644
--- a/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
+++ b/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
@@ -171,7 +171,7 @@
               myFailedModulePaths.remove(modulePath);
             }
             catch (final IOException e) {
-              fireError(ProjectBundle.message("module.cannot.load.error", e.getMessage()), modulePath);
+              fireError(ProjectBundle.message("module.cannot.load.error", modulePath.getPath(), e.getMessage()), modulePath);
             }
             catch (JDOMException e) {
               fireError(ProjectBundle.message("module.corrupted.file.error", modulePath.getPath(), e.getMessage()), modulePath);
