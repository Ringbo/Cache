diff --git a/netty/src/main/java/io/grpc/netty/NettyHandlerSettings.java b/netty/src/main/java/io/grpc/netty/NettyHandlerSettings.java
index e8ae119..07f87af 100644
--- a/netty/src/main/java/io/grpc/netty/NettyHandlerSettings.java
+++ b/netty/src/main/java/io/grpc/netty/NettyHandlerSettings.java
@@ -36,7 +36,7 @@
     if (!enabled) {
       return;
     }
-    synchronized (InternalHandlerSettings.class) {
+    synchronized (NettyHandlerSettings.class) {
       handler.setAutoTuneFlowControl(autoFlowControlOn);
       if (handler instanceof NettyClientHandler) {
         clientHandler = handler;
