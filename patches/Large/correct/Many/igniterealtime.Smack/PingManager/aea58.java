diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
index 7f5d1a6..7dc5061 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
@@ -164,7 +164,7 @@
      * by the entity.
      * 
      * @param jid The id of the entity the ping is being sent to
-     * @param pingTimeout The time to wait for a reply
+     * @param pingTimeout The time to wait for a reply in milliseconds
      * @return true if a reply was received from the entity, false otherwise.
      * @throws NoResponseException if there was no response from the jid.
      * @throws NotConnectedException 
@@ -172,7 +172,7 @@
     public boolean ping(String jid, long pingTimeout) throws NotConnectedException, NoResponseException {
         Ping ping = new Ping(jid);
         try {
-            connection().createPacketCollectorAndSend(ping).nextResultOrThrow();
+            connection().createPacketCollectorAndSend(ping).nextResultOrThrow(pingTimeout);
         }
         catch (XMPPException exc) {
             return jid.equals(connection().getServiceName());
