diff --git a/dubbo-registry/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java b/dubbo-registry/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java
index aa1f04e..5e4f899 100644
--- a/dubbo-registry/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java
+++ b/dubbo-registry/dubbo-registry-redis/src/main/java/org/apache/dubbo/registry/redis/RedisRegistry.java
@@ -564,7 +564,7 @@
                                     jedis = jedisPool.getResource();
                                     try {
                                         if (service.endsWith(Constants.ANY_VALUE)) {
-                                            if (!first) {
+                                            if (first) {
                                                 first = false;
                                                 Set<String> keys = jedis.keys(service);
                                                 if (CollectionUtils.isNotEmpty(keys)) {
@@ -576,7 +576,7 @@
                                             }
                                             jedis.psubscribe(new NotifySub(jedisPool), service); // blocking
                                         } else {
-                                            if (!first) {
+                                            if (first) {
                                                 first = false;
                                                 doNotify(jedis, service);
                                                 resetSkip();
