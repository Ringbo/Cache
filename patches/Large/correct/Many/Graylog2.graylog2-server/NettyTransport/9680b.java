diff --git a/graylog2-server/src/main/java/org/graylog2/plugin/inputs/transports/NettyTransport.java b/graylog2-server/src/main/java/org/graylog2/plugin/inputs/transports/NettyTransport.java
index ce40b75..c031ee9 100644
--- a/graylog2-server/src/main/java/org/graylog2/plugin/inputs/transports/NettyTransport.java
+++ b/graylog2-server/src/main/java/org/graylog2/plugin/inputs/transports/NettyTransport.java
@@ -305,7 +305,7 @@
                 final ChannelBuffer completeMessage = result.getMessage();
                 if (completeMessage != null) {
                     log.debug("Message aggregation completion, forwarding {}", completeMessage);
-                    fireMessageReceived(ctx, completeMessage);
+                    fireMessageReceived(ctx, completeMessage, e.getRemoteAddress());
                 } else if (result.isValid()) {
                     log.debug("More chunks necessary to complete this message");
                 } else {
@@ -314,7 +314,7 @@
                 }
             } else {
                 log.debug("Could not handle netty message {}, sending further upstream.", e);
-                fireMessageReceived(ctx, message);
+                fireMessageReceived(ctx, message, e.getRemoteAddress());
             }
         }
     }
