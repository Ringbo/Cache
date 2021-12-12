diff --git a/src/main/java/com/github/nkzawa/socketio/client/Manager.java b/src/main/java/com/github/nkzawa/socketio/client/Manager.java
index be6f9be..284e856 100644
--- a/src/main/java/com/github/nkzawa/socketio/client/Manager.java
+++ b/src/main/java/com/github/nkzawa/socketio/client/Manager.java
@@ -13,7 +13,7 @@
 
 public class Manager extends Emitter {
 
-    private static final Logger logger = Logger.getLogger("socket.io-client:manager");
+    private static final Logger logger = Logger.getLogger(Manager.class.getName());
 
     /*package*/ static final int CLOSED = 0;
     /*package*/ static final int OPENING = 1;
@@ -153,12 +153,12 @@
 
         if (this._timeout >= 0) {
             final long timeout = this._timeout;
-            logger.info(String.format("connection attempt will timeout after %d", timeout));
+            logger.fine(String.format("connection attempt will timeout after %d", timeout));
 
             final Future timer = timeoutScheduler.schedule(new Runnable() {
                 @Override
                 public void run() {
-                    logger.info(String.format("connect attempt timed out after %d", timeout));
+                    logger.fine(String.format("connect attempt timed out after %d", timeout));
                     openSub.destroy();
                     socket.close();
                     socket.emit(Engine.EVENT_ERROR, new SocketIOException("timeout"));
@@ -244,7 +244,7 @@
     }
 
     /*package*/ void packet(Packet packet) {
-        logger.info(String.format("writing packet %s", packet));
+        logger.fine(String.format("writing packet %s", packet));
         this.engine.write(Parser.encode(packet));
     }
 
@@ -277,22 +277,22 @@
         } else {
             long delay = this.attempts.get() * this.reconnectionDelay();
             delay = Math.min(delay, this.reconnectionDelayMax());
-            logger.info(String.format("will wait %dms before reconnect attempt", delay));
+            logger.fine(String.format("will wait %dms before reconnect attempt", delay));
 
             this.reconnecting = true;
             final Future timer = this.reconnectScheduler.schedule(new Runnable() {
                 @Override
                 public void run() {
-                    logger.info("attempting reconnect");
+                    logger.fine("attempting reconnect");
                     self.open(new OpenCallback() {
                         @Override
                         public void call(Exception err) {
                             if (err != null) {
-                                logger.info("reconnect attempt error");
+                                logger.fine("reconnect attempt error");
                                 self.reconnect();
                                 self.emit(EVENT_RECONNECT_ERROR, err);
                             } else {
-                                logger.info("reconnect success");
+                                logger.fine("reconnect success");
                                 self.onreconnect();
                             }
                         }
