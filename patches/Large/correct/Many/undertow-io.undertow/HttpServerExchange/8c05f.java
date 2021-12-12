diff --git a/core/src/main/java/io/undertow/server/HttpServerExchange.java b/core/src/main/java/io/undertow/server/HttpServerExchange.java
index cbc8f62..226a66b 100644
--- a/core/src/main/java/io/undertow/server/HttpServerExchange.java
+++ b/core/src/main/java/io/undertow/server/HttpServerExchange.java
@@ -463,7 +463,7 @@
             StreamSinkChannel oldChannel = firstChannel;
             StreamSinkChannel channel = oldChannel;
             for (ChannelWrapper wrapper : wrappers) {
-                channel = ((ChannelWrapper<StreamSinkChannel>) wrapper).wrap(oldChannel, exchange);
+                channel = ((ChannelWrapper<StreamSinkChannel>) wrapper).wrap(channel, exchange);
                 if (channel == null) {
                     channel = oldChannel;
                 }
