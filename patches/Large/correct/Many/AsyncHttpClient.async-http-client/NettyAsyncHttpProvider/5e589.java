diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 26847e2..70edc5c 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -1754,7 +1754,7 @@
                     requestTimeout = p.getRequestTimeoutInMs();
                 }
 
-                finishChannel(channel.getPipeline().getContext(NettyAsyncHttpProvider.class));
+                markChannelNotReadable(channel.getPipeline().getContext(NettyAsyncHttpProvider.class));
                 abort(this.nettyResponseFuture, new TimeoutException(String.format("No response received after %s", requestTimeout)));
 
                 this.nettyResponseFuture = null;
