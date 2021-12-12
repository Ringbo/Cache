diff --git a/src/main/java/com/corundumstudio/socketio/ack/AckManager.java b/src/main/java/com/corundumstudio/socketio/ack/AckManager.java
index eb46556..9b227af 100644
--- a/src/main/java/com/corundumstudio/socketio/ack/AckManager.java
+++ b/src/main/java/com/corundumstudio/socketio/ack/AckManager.java
@@ -94,7 +94,7 @@
     }
 
     public void onAck(SocketIOClient client, Packet packet) {
-        SchedulerKey key = new SchedulerKey(Type.ACK_TIMEOUT, client.getSessionId());
+        AckSchedulerKey key = new AckSchedulerKey(Type.ACK_TIMEOUT, client.getSessionId(), packet.getAckId());
         scheduler.cancel(key);
 
         AckCallback callback = removeCallback(client.getSessionId(), packet.getAckId());
