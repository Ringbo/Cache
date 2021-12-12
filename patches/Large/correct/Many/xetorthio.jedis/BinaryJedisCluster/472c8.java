diff --git a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
index d4141b5..706291f 100644
--- a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
+++ b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
@@ -1188,7 +1188,7 @@
     return new JedisClusterCommand<Set<byte[]>>(connectionHandler, maxRedirections) {
       @Override
       public Set<byte[]> execute(Jedis connection) {
-        return connection.zrangeByLex(key, max, min);
+        return connection.zrevrangeByLex(key, max, min);
       }
     }.runBinary(key);
   }
