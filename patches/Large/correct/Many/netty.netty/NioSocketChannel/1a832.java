diff --git a/transport/src/main/java/io/netty/channel/socket/nio/NioSocketChannel.java b/transport/src/main/java/io/netty/channel/socket/nio/NioSocketChannel.java
index caf04bf..a4442d5 100644
--- a/transport/src/main/java/io/netty/channel/socket/nio/NioSocketChannel.java
+++ b/transport/src/main/java/io/netty/channel/socket/nio/NioSocketChannel.java
@@ -332,7 +332,7 @@
     private final class NioSocketChannelUnsafe extends NioByteUnsafe {
         @Override
         protected Executor closeExecutor() {
-            if (config().getSoLinger() > 0) {
+            if (javaChannel().isOpen() && config().getSoLinger() > 0) {
                 return GlobalEventExecutor.INSTANCE;
             }
             return null;
