diff --git a/src/main/java/redis/clients/jedis/Connection.java b/src/main/java/redis/clients/jedis/Connection.java
index 7aadc7f..5a168a7 100644
--- a/src/main/java/redis/clients/jedis/Connection.java
+++ b/src/main/java/redis/clients/jedis/Connection.java
@@ -209,7 +209,7 @@
     public List<Long> getIntegerMultiBulkReply() {
         flush();
         pipelinedCommands--;
-        return (List<Long>) protocol.read(inputStream);
+        return (List<Long>) Protocol.read(inputStream);
     }
 
     public List<Object> getAll() {
