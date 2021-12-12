diff --git a/db/redis/src/com/yahoo/ycsb/db/RedisClient.java b/db/redis/src/com/yahoo/ycsb/db/RedisClient.java
index 7e9b5f8..0d5c3ff 100644
--- a/db/redis/src/com/yahoo/ycsb/db/RedisClient.java
+++ b/db/redis/src/com/yahoo/ycsb/db/RedisClient.java
@@ -73,7 +73,7 @@
     public int read(String table, String key, Set<String> fields,
             HashMap<String, ByteIterator> result) {
         if (fields == null) {
-            StringByteIteartor.putAllAsByteIterators(result, jedis.hgetAll(key));
+            StringByteIterator.putAllAsByteIterators(result, jedis.hgetAll(key));
         }
         else {
             String[] fieldArray = (String[])fields.toArray(new String[fields.size()]);
