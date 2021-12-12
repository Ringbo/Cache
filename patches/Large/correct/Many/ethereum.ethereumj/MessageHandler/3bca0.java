diff --git a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/MessageHandler.java b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/MessageHandler.java
index c759c10..7d379bc 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/MessageHandler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/MessageHandler.java
@@ -60,7 +60,7 @@
 
     @Override
     public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
-        logger.error("Channel error", cause);
+        logger.warn("Channel error", cause);
         ctx.close();
         // We don't close the channel because we can keep serving requests.
     }
