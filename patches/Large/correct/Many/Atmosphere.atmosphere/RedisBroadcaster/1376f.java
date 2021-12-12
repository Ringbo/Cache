diff --git a/extras/redis/src/main/java/org/atmosphere/plugin/redis/RedisBroadcaster.java b/extras/redis/src/main/java/org/atmosphere/plugin/redis/RedisBroadcaster.java
index 275ea7e..4ecd3b5 100644
--- a/extras/redis/src/main/java/org/atmosphere/plugin/redis/RedisBroadcaster.java
+++ b/extras/redis/src/main/java/org/atmosphere/plugin/redis/RedisBroadcaster.java
@@ -99,7 +99,7 @@
         logger.info("{} shared connection pool {}", getClass().getName(), sharedPool);
 
         if (sharedPool) {
-            if (config.properties().get(REDIS_SHARED_POOL) == null) {
+            if (config.properties().get(REDIS_SHARED_POOL) != null) {
                 jedisPool = (JedisPool) config.properties().get(REDIS_SHARED_POOL);
             }
 
