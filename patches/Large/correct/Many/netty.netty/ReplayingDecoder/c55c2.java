diff --git a/src/main/java/org/jboss/netty/handler/codec/replay/ReplayingDecoder.java b/src/main/java/org/jboss/netty/handler/codec/replay/ReplayingDecoder.java
index 6b74bbb..3525769 100644
--- a/src/main/java/org/jboss/netty/handler/codec/replay/ReplayingDecoder.java
+++ b/src/main/java/org/jboss/netty/handler/codec/replay/ReplayingDecoder.java
@@ -407,11 +407,12 @@
             }
 
             // A successful decode
-            fireMessageReceived(context, remoteAddress, result);
+            unfoldAndfireMessageReceived(context, result, remoteAddress);
         }
     }
 
-    private void fireMessageReceived(ChannelHandlerContext context, SocketAddress remoteAddress, Object result) {
+    private void unfoldAndfireMessageReceived(
+            ChannelHandlerContext context, Object result, SocketAddress remoteAddress) {
         if (unfold) {
             if (result instanceof Object[]) {
                 for (Object r: (Object[]) result) {
@@ -443,9 +444,9 @@
                 callDecode(ctx, e.getChannel(), cumulation, null);
                 if (cumulation.readable()) {
                     // and send the remainders too if necessary.
-                    Object partiallyDecoded = decodeLast(ctx, e.getChannel(), cumulation, state);
+                    Object partiallyDecoded = decodeLast(ctx, e.getChannel(), replayable, state);
                     if (partiallyDecoded != null) {
-                        fireMessageReceived(ctx, null, partiallyDecoded);
+                        unfoldAndfireMessageReceived(ctx, partiallyDecoded, null);
                     }
                 }
             }
