diff --git a/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java b/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
index 8488821..f152411 100644
--- a/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
+++ b/transport/src/main/java/io/netty/channel/nio/NioEventLoop.java
@@ -529,7 +529,7 @@
         }
 
         // Call flushNow which will also take care of clear the OP_WRITE once there is nothing left to write
-        ch.unsafe().flushNow();
+        ch.unsafe().flush();
     }
 
     private static void unregisterWritableTasks(AbstractNioChannel ch) {
