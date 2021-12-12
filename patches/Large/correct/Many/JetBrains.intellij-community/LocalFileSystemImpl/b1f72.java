diff --git a/platform/platform-impl/src/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java b/platform/platform-impl/src/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
index 91e4922..a6d2be4 100644
--- a/platform/platform-impl/src/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
@@ -337,7 +337,7 @@
       if (!alreadyWatched) {
         final VirtualFile existingFile = findFileByPathIfCached(rootPath);
         if (existingFile != null) {
-          final ModalityState modalityState = ModalityState.current();
+          final ModalityState modalityState = ModalityState.defaultModalityState();
           RefreshQueue.getInstance().refresh(true, toWatchRecursively, null, modalityState, existingFile);
           if (existingFile.isDirectory() && !toWatchRecursively && existingFile instanceof NewVirtualFile) {
             for (VirtualFile child : ((NewVirtualFile)existingFile).getCachedChildren()) {
