diff --git a/redisson/src/main/java/org/redisson/RedissonLocalCachedMap.java b/redisson/src/main/java/org/redisson/RedissonLocalCachedMap.java
index 7496e02..c3abc3c 100644
--- a/redisson/src/main/java/org/redisson/RedissonLocalCachedMap.java
+++ b/redisson/src/main/java/org/redisson/RedissonLocalCachedMap.java
@@ -428,7 +428,7 @@
     @Override
     protected RFuture<V> putOperationAsync(K key, V value) {
         ByteBuf mapKey = encodeMapKey(key);
-        ByteBuf mapValue = encodeMapKey(value);
+        ByteBuf mapValue = encodeMapValue(value);
         CacheKey cacheKey = toCacheKey(mapKey);
         byte[] entryId = generateLogEntryId(cacheKey.getKeyHash());
         ByteBuf msg = createSyncMessage(mapKey, mapValue, cacheKey);
@@ -446,7 +446,7 @@
                 + "end;"
                 + "return v; ",
                 Arrays.<Object>asList(getName(), invalidationTopic.getChannelNames().get(0), getUpdatesLogName()), 
-                mapKey, encodeMapValue(value), msg, invalidateEntryOnChange, System.currentTimeMillis(), entryId);
+                mapKey, mapValue, msg, invalidateEntryOnChange, System.currentTimeMillis(), entryId);
     }
 
     protected ByteBuf createSyncMessage(ByteBuf mapKey, ByteBuf mapValue, CacheKey cacheKey) {
