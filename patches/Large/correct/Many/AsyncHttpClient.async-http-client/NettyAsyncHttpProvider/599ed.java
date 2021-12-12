diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index c5226c5..410b24e 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -846,7 +846,7 @@
                 }
     
                 abort(future, new TimeoutException("No response received. Connection timed out after "
-                        + config.getIdleConnectionTimeoutInMs()));
+                        + config.getIdleConnectionInPoolTimeoutInMs()));
             }
         } else {
           log.warn("null attachment on ChannelHandlerContext {}", ctx);
