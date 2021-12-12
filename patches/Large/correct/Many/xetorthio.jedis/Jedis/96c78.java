diff --git a/src/main/java/redis/clients/jedis/Jedis.java b/src/main/java/redis/clients/jedis/Jedis.java
index 4780e6c..9aabda0 100644
--- a/src/main/java/redis/clients/jedis/Jedis.java
+++ b/src/main/java/redis/clients/jedis/Jedis.java
@@ -3072,7 +3072,7 @@
     public String clientSetname(final String name) {
     	checkIsInMulti();
     	client.clientSetname(name);
-    	return client.getBulkReply();
+    	return client.getStatusCodeReply();
     }
     
     public String migrate(final String host, final int port, final String key, final int destinationDb, final int timeout) {
