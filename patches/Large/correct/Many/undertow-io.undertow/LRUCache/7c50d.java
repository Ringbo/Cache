diff --git a/core/src/main/java/io/undertow/server/handlers/cache/LRUCache.java b/core/src/main/java/io/undertow/server/handlers/cache/LRUCache.java
index 25c6c80..d930d89 100644
--- a/core/src/main/java/io/undertow/server/handlers/cache/LRUCache.java
+++ b/core/src/main/java/io/undertow/server/handlers/cache/LRUCache.java
@@ -60,7 +60,7 @@
         CacheEntry<K, V> value = cache.get(key);
         if (value == null) {
             long expires;
-            if(maxEntries == -1) {
+            if(maxAge == -1) {
                 expires = -1;
             } else {
                 expires = System.currentTimeMillis() + maxAge;
