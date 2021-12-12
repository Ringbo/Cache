diff --git a/app/src/internalDebug/java/com/jakewharton/u2020/data/MockRequestHandler.java b/app/src/internalDebug/java/com/jakewharton/u2020/data/MockRequestHandler.java
index dc6d086..64f09f4 100644
--- a/app/src/internalDebug/java/com/jakewharton/u2020/data/MockRequestHandler.java
+++ b/app/src/internalDebug/java/com/jakewharton/u2020/data/MockRequestHandler.java
@@ -28,7 +28,7 @@
 
   /** Emulate the disk cache by storing the URLs in an LRU using its size as the value. */
   private final LruCache<String, Long> emulatedDiskCache =
-      new LruCache<String, Long>(((int) Math.max(DataModule.DISK_CACHE_SIZE, Integer.MAX_VALUE))) {
+      new LruCache<String, Long>(((int) Math.min(DataModule.DISK_CACHE_SIZE, Integer.MAX_VALUE))) {
         @Override protected int sizeOf(String key, Long value) {
           return (int) Math.min(value.longValue(), Integer.MAX_VALUE);
         }
