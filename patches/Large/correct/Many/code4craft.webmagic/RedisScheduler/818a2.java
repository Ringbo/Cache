diff --git a/webmagic-extension/src/main/java/us/codecraft/webmagic/scheduler/RedisScheduler.java b/webmagic-extension/src/main/java/us/codecraft/webmagic/scheduler/RedisScheduler.java
index 59f4b3f..ce1111f 100644
--- a/webmagic-extension/src/main/java/us/codecraft/webmagic/scheduler/RedisScheduler.java
+++ b/webmagic-extension/src/main/java/us/codecraft/webmagic/scheduler/RedisScheduler.java
@@ -48,7 +48,7 @@
     public boolean isDuplicate(Request request, Task task) {
         Jedis jedis = pool.getResource();
         try {
-            return jedis.sadd(getSetKey(task), request.getUrl()) > 0;
+            return jedis.sadd(getSetKey(task), request.getUrl()) == 0;
         } finally {
             pool.returnResource(jedis);
         }
