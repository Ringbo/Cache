diff --git a/src/main/java/com/github/nkzawa/socketio/client/Socket.java b/src/main/java/com/github/nkzawa/socketio/client/Socket.java
index f2b4390..151e682 100644
--- a/src/main/java/com/github/nkzawa/socketio/client/Socket.java
+++ b/src/main/java/com/github/nkzawa/socketio/client/Socket.java
@@ -15,7 +15,7 @@
 
 public class Socket extends Emitter {
 
-    private static final Logger logger = Logger.getLogger("socket.io-client:socket");
+    private static final Logger logger = Logger.getLogger(Socket.class.getName());
 
     private static final Gson gson = new Gson();
 
@@ -108,7 +108,7 @@
         Packet packet = new Packet(Parser.EVENT, toJsonArray(_args));
 
         int ids = this.ids.getAndIncrement();
-        logger.info(String.format("emitting packet with ack id %d", ids));
+        logger.fine(String.format("emitting packet with ack id %d", ids));
         this.acks.put(ids, ack);
         packet.id = ids;
 
@@ -127,7 +127,7 @@
     }
 
     private void onopen() {
-        logger.info("transport is open - connecting");
+        logger.fine("transport is open - connecting");
 
         if (!"/".equals(this.nsp)) {
             this.packet(new Packet(Parser.CONNECT));
@@ -150,7 +150,7 @@
     }
 
     private void onclose(String reason) {
-        logger.info(String.format("close (%s)", reason));
+        logger.fine(String.format("close (%s)", reason));
         this.connected = false;
         this.disconnected = true;
         this.emit(EVENT_DISCONNECT, reason);
@@ -184,10 +184,10 @@
 
     private void onevent(Packet packet) {
         LinkedList<Object> args = new LinkedList<Object>(fromJsonArray(packet.data.getAsJsonArray()));
-        logger.info(String.format("emitting event %s", args));
+        logger.fine(String.format("emitting event %s", args));
 
         if (packet.id >= 0) {
-            logger.info("attaching ack callback to event");
+            logger.fine("attaching ack callback to event");
             args.offerLast(this.ack(packet.id));
         }
 
@@ -207,7 +207,7 @@
             public synchronized void call(Object... args) {
                 if (sent[0]) return;
                 sent[0] = true;
-                logger.info(String.format("sending ack %s", args));
+                logger.fine(String.format("sending ack %s", args));
                 Packet packet = new Packet(Parser.ACK, gson.toJsonTree(args));
                 packet.id = id;
                 self.packet(packet);
@@ -216,7 +216,7 @@
     }
 
     private void onack(Packet packet) {
-        logger.info(String.format("calling ack %s with %s", packet.id, packet.data));
+        logger.fine(String.format("calling ack %s with %s", packet.id, packet.data));
         Ack fn = this.acks.remove(packet.id);
         fn.call(fromJsonArray(packet.data.getAsJsonArray()).toArray());
     }
@@ -239,13 +239,13 @@
     }
 
     private void ondisconnect() {
-        logger.info(String.format("server disconnect (%s)", this.nsp));
+        logger.fine(String.format("server disconnect (%s)", this.nsp));
         this.destroy();
         this.onclose("io server disconnect");
     }
 
     private void destroy() {
-        logger.info(String.format("destroying socket (%s)", this.nsp));
+        logger.fine(String.format("destroying socket (%s)", this.nsp));
 
         for (On.Handle sub : this.subs) {
             sub.destroy();
@@ -257,7 +257,7 @@
     public Socket close() {
         if (!this.connected) return this;
 
-        logger.info(String.format("performing disconnect (%s)", this.nsp));
+        logger.fine(String.format("performing disconnect (%s)", this.nsp));
         this.packet(new Packet(Parser.DISCONNECT));
 
         this.destroy();
