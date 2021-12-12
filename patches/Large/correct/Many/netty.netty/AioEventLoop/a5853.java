diff --git a/transport/src/main/java/io/netty/channel/socket/aio/AioEventLoop.java b/transport/src/main/java/io/netty/channel/socket/aio/AioEventLoop.java
index 1833554..9424a48 100644
--- a/transport/src/main/java/io/netty/channel/socket/aio/AioEventLoop.java
+++ b/transport/src/main/java/io/netty/channel/socket/aio/AioEventLoop.java
@@ -59,7 +59,7 @@
         AbstractAioChannel ch = null;
         try {
             ch = findChannel(command);
-        } catch (Exception e) {
+        } catch (Throwable t) {
             // Ignore
         }
 
