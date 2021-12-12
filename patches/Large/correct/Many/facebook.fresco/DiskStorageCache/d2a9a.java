diff --git a/imagepipeline-base/src/main/java/com/facebook/cache/disk/DiskStorageCache.java b/imagepipeline-base/src/main/java/com/facebook/cache/disk/DiskStorageCache.java
index 6f50c99..08b5340 100644
--- a/imagepipeline-base/src/main/java/com/facebook/cache/disk/DiskStorageCache.java
+++ b/imagepipeline-base/src/main/java/com/facebook/cache/disk/DiskStorageCache.java
@@ -294,7 +294,7 @@
       }
     } catch (IOException ioe) {
       mCacheEventListener.onWriteException();
-      FLog.d(TAG, "Failed inserting a file into the cache", ioe);
+      FLog.e(TAG, "Failed inserting a file into the cache", ioe);
       throw ioe;
     }
   }
