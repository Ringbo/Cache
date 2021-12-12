diff --git a/src/java/org/apache/cassandra/service/CacheService.java b/src/java/org/apache/cassandra/service/CacheService.java
index f626e17..cf0db97 100644
--- a/src/java/org/apache/cassandra/service/CacheService.java
+++ b/src/java/org/apache/cassandra/service/CacheService.java
@@ -335,7 +335,7 @@
     {
         public void serialize(KeyCacheKey key, DataOutput out) throws IOException
         {
-            RowIndexEntry entry = CacheService.instance.keyCache.get(key);
+            RowIndexEntry entry = CacheService.instance.keyCache.getInternal(key);
             if (entry == null)
                 return;
             ByteBufferUtil.writeWithLength(key.key, out);
