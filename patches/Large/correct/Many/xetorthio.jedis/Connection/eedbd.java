diff --git a/src/main/java/redis/clients/jedis/Connection.java b/src/main/java/redis/clients/jedis/Connection.java
index 4e2ddbb..39bb737 100644
--- a/src/main/java/redis/clients/jedis/Connection.java
+++ b/src/main/java/redis/clients/jedis/Connection.java
@@ -88,7 +88,7 @@
     return sendCommand(cmd, bargs);
   }
 
-  protected Connection sendCommand(final Command cmd, final byte[]... args) {
+  protected Connection sendCommand(final ProtocolCommand cmd, final byte[]... args) {
     try {
       connect();
       Protocol.sendCommand(outputStream, cmd, args);
