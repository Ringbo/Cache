diff --git a/src/main/java/redis/clients/jedis/Jedis.java b/src/main/java/redis/clients/jedis/Jedis.java
index d5fd399..4780e6c 100644
--- a/src/main/java/redis/clients/jedis/Jedis.java
+++ b/src/main/java/redis/clients/jedis/Jedis.java
@@ -1365,7 +1365,7 @@
     
     public List<String> srandmember(final String key, final int count) {
 	checkIsInMulti();
-	client.srandmember(key);
+	client.srandmember(key, count);
 	return client.getMultiBulkReply();
     }
 
