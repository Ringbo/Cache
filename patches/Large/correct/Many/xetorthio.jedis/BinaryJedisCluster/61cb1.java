diff --git a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
index 4cf2fb5..4244c76 100644
--- a/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
+++ b/src/main/java/redis/clients/jedis/BinaryJedisCluster.java
@@ -180,7 +180,7 @@
     return new JedisClusterCommand<Long>(connectionHandler, maxAttempts) {
       @Override
       public Long execute(Jedis connection) {
-        return connection.pexpire(key, millisecondsTimestamp);
+        return connection.pexpireAt(key, millisecondsTimestamp);
       }
     }.runBinary(key);
   }
