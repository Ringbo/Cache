diff --git a/core/client/src/main/java/alluxio/client/file/FileInStream.java b/core/client/src/main/java/alluxio/client/file/FileInStream.java
index b263009..5592db2 100644
--- a/core/client/src/main/java/alluxio/client/file/FileInStream.java
+++ b/core/client/src/main/java/alluxio/client/file/FileInStream.java
@@ -454,7 +454,7 @@
 
     // If this block is read from a remote worker but we don't have a local worker, don't cache
     if (mCurrentBlockInStream instanceof RemoteBlockInStream
-        && BlockStoreContext.INSTANCE.hasLocalWorker()) {
+        && !BlockStoreContext.INSTANCE.hasLocalWorker()) {
       return;
     }
 
