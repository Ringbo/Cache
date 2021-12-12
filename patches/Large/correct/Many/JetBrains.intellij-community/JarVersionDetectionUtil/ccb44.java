diff --git a/java/openapi/src/com/intellij/openapi/roots/libraries/JarVersionDetectionUtil.java b/java/openapi/src/com/intellij/openapi/roots/libraries/JarVersionDetectionUtil.java
index b555036..6467451 100644
--- a/java/openapi/src/com/intellij/openapi/roots/libraries/JarVersionDetectionUtil.java
+++ b/java/openapi/src/com/intellij/openapi/roots/libraries/JarVersionDetectionUtil.java
@@ -66,7 +66,7 @@
       for (OrderEntry library : ModuleRootManager.getInstance(module).getOrderEntries()) {
         if (library instanceof LibraryOrderEntry) {
           VirtualFile file = LibrariesHelper.getInstance().findJarByClass(((LibraryOrderEntry)library).getLibrary(), detectionClass);
-          if (file != null) {
+          if (file != null && file.getFileSystem() instanceof JarFileSystem) {
             return JarFileSystem.getInstance().getJarFile(file);
           }
         }
