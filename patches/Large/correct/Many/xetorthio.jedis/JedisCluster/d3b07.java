diff --git a/src/main/java/redis/clients/jedis/JedisCluster.java b/src/main/java/redis/clients/jedis/JedisCluster.java
index 7e9799f..7eed097 100644
--- a/src/main/java/redis/clients/jedis/JedisCluster.java
+++ b/src/main/java/redis/clients/jedis/JedisCluster.java
@@ -1553,7 +1553,7 @@
     new JedisClusterCommand<Integer>(connectionHandler, maxRedirections) {
       @Override
       public Integer execute(Jedis connection) {
-        connection.subscribe(jedisPubSub, patterns);
+        connection.psubscribe(jedisPubSub, patterns);
         return 0;
       }
     }.runWithAnyNode();
