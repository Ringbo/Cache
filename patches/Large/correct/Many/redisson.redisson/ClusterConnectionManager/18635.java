diff --git a/src/main/java/org/redisson/connection/ClusterConnectionManager.java b/src/main/java/org/redisson/connection/ClusterConnectionManager.java
index 7b5471f..84e0849 100644
--- a/src/main/java/org/redisson/connection/ClusterConnectionManager.java
+++ b/src/main/java/org/redisson/connection/ClusterConnectionManager.java
@@ -54,7 +54,7 @@
         init(config);
 
         for (URI addr : cfg.getNodeAddresses()) {
-            RedisClient client = createClient(addr.getHost(), addr.getPort());
+            RedisClient client = createClient(addr.getHost(), addr.getPort(), cfg.getTimeout());
             try {
                 RedisAsyncConnection<String, String> connection = client.connectAsync();
                 String nodesValue = get(connection.clusterNodes());
