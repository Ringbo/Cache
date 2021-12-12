diff --git a/src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java b/src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java
index b340135..5bccab1 100644
--- a/src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java
+++ b/src/main/java/io/vertx/core/http/impl/WebSocketImplBase.java
@@ -323,7 +323,7 @@
   public S binaryMessageHandler(Handler<Buffer> handler) {
     synchronized (conn) {
       checkClosed();
-      if (frameHandler == null || frameHandler.getClass() == FrameAggregator.class) {
+      if (frameHandler == null || frameHandler.getClass() != FrameAggregator.class) {
         frameHandler = new FrameAggregator();
       }
       ((FrameAggregator) frameHandler).binaryMessageHandler = handler;
