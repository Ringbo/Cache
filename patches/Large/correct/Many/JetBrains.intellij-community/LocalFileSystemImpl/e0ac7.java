diff --git a/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java b/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
index f710515..5dc5ebe 100644
--- a/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
+++ b/source/com/intellij/openapi/vfs/impl/local/LocalFileSystemImpl.java
@@ -491,7 +491,7 @@
       final VirtualFile existingFile = findFileByPathIfCached(rootPath);
       if (existingFile != null) {
         if (!isAlreadyWatched(result)) {
-          existingFile.refresh(false, toWatchRecursively);
+          existingFile.refresh(true, toWatchRecursively);
         }
       }
       myRootsToWatch.add(result);
