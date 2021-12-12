diff --git a/src/main/java/redis/clients/jedis/JedisCluster.java b/src/main/java/redis/clients/jedis/JedisCluster.java
index c83291a..8f2f1ee 100644
--- a/src/main/java/redis/clients/jedis/JedisCluster.java
+++ b/src/main/java/redis/clients/jedis/JedisCluster.java
@@ -588,7 +588,7 @@
 
   @Override
   public Set<String> spop(final String key, final long count) {
-    return new JedisClusterCommand<Set<String>>(connectionHandler, timeout, maxRedirections) {
+    return new JedisClusterCommand<Set<String>>(connectionHandler, maxRedirections) {
       @Override
       public Set<String> execute(Jedis connection) {
         return connection.spop(key, count);
