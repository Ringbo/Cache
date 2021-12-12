diff --git a/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java b/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
index f8bf43a..170552d 100644
--- a/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
+++ b/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
@@ -36,7 +36,7 @@
     private boolean isOpen = false;
     private Map<String, ReentrantLock> lockMap = new HashMap<String, ReentrantLock>();
 
-    public static DiskCache get(File diskCacheDir, int maxCacheSize) {
+    public static synchronized DiskCache get(File diskCacheDir, int maxCacheSize) {
         if (CACHE == null) {
             CACHE = new DiskCache(diskCacheDir, maxCacheSize);
         }
