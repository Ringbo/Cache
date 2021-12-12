diff --git a/transport/src/main/java/io/netty/channel/Channels.java b/transport/src/main/java/io/netty/channel/Channels.java
index 879758c..c709789 100644
--- a/transport/src/main/java/io/netty/channel/Channels.java
+++ b/transport/src/main/java/io/netty/channel/Channels.java
@@ -481,7 +481,7 @@
      * the specified {@link Channel} once the io-thread runs again.
      */
     public static void fireExceptionCaughtLater(Channel channel, Throwable cause) {
-        channel.getPipeline().sendUpstream(
+        channel.getPipeline().sendUpstreamLater(
                 new DefaultExceptionEvent(channel, cause));
     }
 
