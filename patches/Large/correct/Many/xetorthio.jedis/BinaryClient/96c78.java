diff --git a/src/main/java/redis/clients/jedis/BinaryClient.java b/src/main/java/redis/clients/jedis/BinaryClient.java
index 72ae2d5..c07f693 100644
--- a/src/main/java/redis/clients/jedis/BinaryClient.java
+++ b/src/main/java/redis/clients/jedis/BinaryClient.java
@@ -924,19 +924,19 @@
     }
     
     public void clientKill(final byte[] client) {
-    	sendCommand(CLIENT_KILL, client);
+    	sendCommand(CLIENT, Keyword.KILL.raw, client);
     }
     
     public void clientGetname() {
-    	sendCommand(CLIENT_GETNAME);
+    	sendCommand(CLIENT, Keyword.GETNAME.raw);
     }
     
     public void clientList() {
-    	sendCommand(CLIENT_LIST);
+    	sendCommand(CLIENT, Keyword.LIST.raw);
     }
     
     public void clientSetname(final byte[] name) {
-    	sendCommand(CLIENT_SETNAME);
+    	sendCommand(CLIENT, Keyword.SETNAME.raw, name);
     }
     
     public void time() {
