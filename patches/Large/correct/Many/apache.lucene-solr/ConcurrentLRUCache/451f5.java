diff --git a/src/java/org/apache/solr/common/util/ConcurrentLRUCache.java b/src/java/org/apache/solr/common/util/ConcurrentLRUCache.java
index 3b3fa95..5ebdef8 100644
--- a/src/java/org/apache/solr/common/util/ConcurrentLRUCache.java
+++ b/src/java/org/apache/solr/common/util/ConcurrentLRUCache.java
@@ -83,7 +83,7 @@
     if (val == null) return null;
     CacheEntry e = new CacheEntry(key, val, stats.accessCounter.incrementAndGet());
     CacheEntry oldCacheEntry = map.put(key, e);
-    if (oldCacheEntry != null) {
+    if (oldCacheEntry == null) {
       stats.size.incrementAndGet();
     }
     if (islive) {
