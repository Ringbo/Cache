diff --git a/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelUpstreamHandler.java b/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelUpstreamHandler.java
index de65509..83ec60f 100644
--- a/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelUpstreamHandler.java
+++ b/src/main/java/org/jboss/netty/handler/timeout/IdleStateAwareChannelUpstreamHandler.java
@@ -52,7 +52,7 @@
     /**
      * Invoked when a {@link Channel} has been idle for a while.
      */
-    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) {
+    public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) throws Exception {
         ctx.sendUpstream(e);
     }
 }
