diff --git a/src/main/java/org/jboss/netty/channel/SimpleChannelHandler.java b/src/main/java/org/jboss/netty/channel/SimpleChannelHandler.java
index c8ab351..812cf66 100644
--- a/src/main/java/org/jboss/netty/channel/SimpleChannelHandler.java
+++ b/src/main/java/org/jboss/netty/channel/SimpleChannelHandler.java
@@ -134,7 +134,7 @@
                 channelInterestChanged(ctx, evt);
                 break;
             default:
-                ctx.sendDownstream(e);
+                ctx.sendUpstream(e);
             }
         } else if (e instanceof ExceptionEvent) {
             exceptionCaught(ctx, (ExceptionEvent) e);
