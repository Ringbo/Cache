diff --git a/netty/src/main/java/io/grpc/transport/netty/NettyClientHandler.java b/netty/src/main/java/io/grpc/transport/netty/NettyClientHandler.java
index b8ed06f..8050ca9 100644
--- a/netty/src/main/java/io/grpc/transport/netty/NettyClientHandler.java
+++ b/netty/src/main/java/io/grpc/transport/netty/NettyClientHandler.java
@@ -194,7 +194,7 @@
     if (debugData.isReadable()) {
       // If a debug message was provided, use it.
       String msg = debugData.toString(UTF_8);
-      status = status.withDescription(msg);
+      status = status.augmentDescription(msg);
     }
     goAwayStatus(status);
   }
