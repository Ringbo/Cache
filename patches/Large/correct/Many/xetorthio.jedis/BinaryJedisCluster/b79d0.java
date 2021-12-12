diff --git a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
index cc12cca..62b1112 100644
--- a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
+++ b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
@@ -1598,7 +1598,7 @@
     new JedisClusterCommand<Integer>(connectionHandler, maxRedirections) {
       @Override
       public Integer execute(Jedis connection) {
-        connection.subscribe(jedisPubSub, patterns);
+        connection.psubscribe(jedisPubSub, patterns);
         return 0;
       }
     }.runWithAnyNode();
