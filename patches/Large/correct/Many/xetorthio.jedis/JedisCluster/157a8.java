diff --git a/src/main/java/redis/clients/jedis/JedisCluster.java b/src/main/java/redis/clients/jedis/JedisCluster.java
index f20c755..d0410c5 100644
--- a/src/main/java/redis/clients/jedis/JedisCluster.java
+++ b/src/main/java/redis/clients/jedis/JedisCluster.java
@@ -108,7 +108,7 @@
 
   @Override
   public Long persist(final String key) {
-    return new JedisClusterCommand<Long>(connectionHandler, timeout, maxRedirections) {
+    return new JedisClusterCommand<Long>(connectionHandler, maxRedirections) {
       @Override
       public Long execute(Jedis connection) {
         return connection.persist(key);
