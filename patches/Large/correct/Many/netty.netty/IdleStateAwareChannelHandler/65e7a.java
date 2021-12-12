diff --git a/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelHandler.java b/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelHandler.java
index 8eb125a..4a0a10b 100644
--- a/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelHandler.java
+++ b/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelHandler.java
@@ -52,7 +52,7 @@
     /**
      * Invoked when a {@link Channel} has been idle for a while.
      */
-    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) {
+    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) throws Exception {
         ctx.sendUpstream(e);
     }
 }
