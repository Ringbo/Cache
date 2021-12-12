diff --git a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
index c524b27..1b402d0 100644
--- a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
+++ b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
@@ -782,7 +782,7 @@
     try {
       // Apply all pending writes
       Runnable task;
-      while ((task = writeQueue().poll()) != null) {
+      while (buffersWrites() && (task = writeQueue().poll()) != null) {
         task.run();
       }
 
