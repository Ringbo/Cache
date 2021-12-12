diff --git a/src/main/java/redis/clients/jedis/JedisCluster.java b/src/main/java/redis/clients/jedis/JedisCluster.java
index f6cb6fd..d39d43d 100644
--- a/src/main/java/redis/clients/jedis/JedisCluster.java
+++ b/src/main/java/redis/clients/jedis/JedisCluster.java
@@ -394,7 +394,7 @@
 		maxRedirections) {
 	    @Override
 	    public Long execute(Jedis connection) {
-		return connection.hdel(key);
+		return connection.hlen(key);
 	    }
 	}.run(key);
     }
