diff --git a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
index 99f15c7..ec25c12 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/p2p/P2pHandler.java
@@ -182,7 +182,7 @@
 
     @Override
     public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
-        logger.error("P2p handling failed", cause);
+        logger.warn("P2p handling failed", cause);
         ctx.close();
         killTimers();
     }
