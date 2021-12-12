diff --git a/src/main/java/com/corundumstudio/socketio/handler/EncoderHandler.java b/src/main/java/com/corundumstudio/socketio/handler/EncoderHandler.java
index 0968659..986568a 100644
--- a/src/main/java/com/corundumstudio/socketio/handler/EncoderHandler.java
+++ b/src/main/java/com/corundumstudio/socketio/handler/EncoderHandler.java
@@ -208,7 +208,7 @@
             Queue<Packet> queue = msg.getClientHead().getPacketsQueue(msg.getTransport());
             Packet packet = queue.poll();
             if (packet == null) {
-                promise.setSuccess();
+                promise.trySuccess();
                 break;
             }
 
@@ -223,7 +223,7 @@
             if (out.isReadable()) {
                 ctx.channel().writeAndFlush(res, promise);
             } else {
-                promise.setSuccess();
+                promise.trySuccess();
                 out.release();
             }
 
@@ -246,7 +246,7 @@
         Queue<Packet> queue = msg.getClientHead().getPacketsQueue(msg.getTransport());
 
         if (!channel.isActive() || queue.isEmpty() || !attr.compareAndSet(null, true)) {
-            promise.setSuccess();
+            promise.trySuccess();
             return;
         }
 
