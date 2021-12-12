diff --git a/netty/src/main/java/com/google/net/stubby/transport/netty/NettyServerHandler.java b/netty/src/main/java/com/google/net/stubby/transport/netty/NettyServerHandler.java
index 38e3035..81e4e05 100644
--- a/netty/src/main/java/com/google/net/stubby/transport/netty/NettyServerHandler.java
+++ b/netty/src/main/java/com/google/net/stubby/transport/netty/NettyServerHandler.java
@@ -97,7 +97,7 @@
       // The Http2Stream object was put by AbstractHttp2ConnectionHandler before calling this
       // method.
       Http2Stream http2Stream = connection().requireStream(streamId);
-      http2Stream.data(stream);
+      http2Stream.setProperty(NettyServerStream.class, stream);
       String method = determineMethod(streamId, headers);
       ServerStreamListener listener =
           transportListener.streamCreated(stream, method, Utils.convertHeaders(headers));
@@ -198,7 +198,7 @@
   void returnProcessedBytes(int streamId, int bytes) {
     try {
       Http2Stream http2Stream = connection().requireStream(streamId);
-      http2Stream.inboundFlow().returnProcessedBytes(ctx, bytes);
+      http2Stream.garbageCollector().returnProcessedBytes(ctx, bytes);
     } catch (Http2Exception e) {
       throw new RuntimeException(e);
     }
@@ -285,7 +285,7 @@
    * Returns the server stream associated to the given HTTP/2 stream object
    */
   private NettyServerStream serverStream(Http2Stream stream) {
-    return stream.<NettyServerStream>data();
+    return stream.getProperty(NettyServerStream.class);
   }
 
   private Http2StreamException newStreamException(int streamId, Throwable cause) {
