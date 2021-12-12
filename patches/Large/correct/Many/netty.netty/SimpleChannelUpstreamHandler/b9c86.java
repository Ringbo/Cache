diff --git a/src/main/java/org/jboss/netty/channel/SimpleChannelUpstreamHandler.java b/src/main/java/org/jboss/netty/channel/SimpleChannelUpstreamHandler.java
index b8eb72e..2ddd84f 100644
--- a/src/main/java/org/jboss/netty/channel/SimpleChannelUpstreamHandler.java
+++ b/src/main/java/org/jboss/netty/channel/SimpleChannelUpstreamHandler.java
@@ -116,7 +116,7 @@
                 channelInterestChanged(ctx, evt);
                 break;
             default:
-                ctx.sendDownstream(e);
+                ctx.sendUpstream(e);
             }
         } else if (e instanceof ExceptionEvent) {
             exceptionCaught(ctx, (ExceptionEvent) e);
