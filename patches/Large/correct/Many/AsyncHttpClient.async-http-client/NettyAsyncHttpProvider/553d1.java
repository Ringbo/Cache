diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index c58d831..673a25b 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -1004,7 +1004,7 @@
 
             // Windows only.
             if (abortOnRemoteCloseException(cause)){
-                log.error(currentThread() + String.format("Trying to recover from dead Channel: %s ", channel));
+                log.debug(currentThread() + String.format("Trying to recover from dead Channel: %s ", channel));
                 remotelyClosed(channel, null);
                 return;
             }
@@ -1025,9 +1025,8 @@
     }
 
     /**
-     * On windows, there is scenario where the connection get broken and the only way we can find it is by inspecting
+     * On Windows, there is scenario where the connection get broken and the only way we can find it is by inspecting
      * the stack trace in order to catch the following exception:
-     *
      *
      * java.io.IOException: An established connection was aborted by the software in your host machine
         at sun.nio.ch.SocketDispatcher.read0(Native Method)
