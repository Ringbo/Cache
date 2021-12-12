diff --git a/handler/src/main/java/io/netty/handler/queue/BlockingReadHandler.java b/handler/src/main/java/io/netty/handler/queue/BlockingReadHandler.java
index 88cdf0b..9167de7 100644
--- a/handler/src/main/java/io/netty/handler/queue/BlockingReadHandler.java
+++ b/handler/src/main/java/io/netty/handler/queue/BlockingReadHandler.java
@@ -100,7 +100,7 @@
     public ChannelBufferHolder<Object> newInboundBuffer(
             ChannelInboundHandlerContext<Object> ctx) throws Exception {
         this.ctx = ctx;
-        return ChannelBufferHolders.catchAllBuffer();
+        return ChannelBufferHolders.messageBuffer(queue);
     }
 
     /**
