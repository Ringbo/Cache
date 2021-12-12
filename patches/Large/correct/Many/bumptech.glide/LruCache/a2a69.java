diff --git a/library/src/main/java/com/bumptech/glide/util/LruCache.java b/library/src/main/java/com/bumptech/glide/util/LruCache.java
index 74d989b..1311fa1 100644
--- a/library/src/main/java/com/bumptech/glide/util/LruCache.java
+++ b/library/src/main/java/com/bumptech/glide/util/LruCache.java
@@ -58,7 +58,7 @@
   /**
    * Returns the number of entries stored in cache.
    */
-  protected int getCount() {
+  protected synchronized int getCount() {
     return cache.size();
   }
 
