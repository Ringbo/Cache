diff --git a/netty/src/main/java/com/google/net/stubby/transport/netty/NettyClientHandler.java b/netty/src/main/java/com/google/net/stubby/transport/netty/NettyClientHandler.java
index e1bba43..1e2aa60 100644
--- a/netty/src/main/java/com/google/net/stubby/transport/netty/NettyClientHandler.java
+++ b/netty/src/main/java/com/google/net/stubby/transport/netty/NettyClientHandler.java
@@ -117,7 +117,7 @@
   void returnProcessedBytes(int streamId, int bytes) {
     try {
       Http2Stream http2Stream = connection().requireStream(streamId);
-      http2Stream.inboundFlow().returnProcessedBytes(ctx, bytes);
+      http2Stream.garbageCollector().returnProcessedBytes(ctx, bytes);
     } catch (Http2Exception e) {
       throw new RuntimeException(e);
     }
@@ -334,7 +334,7 @@
       throws Http2Exception {
     // Attach the client stream to the HTTP/2 stream object as user data.
     Http2Stream http2Stream = connection().requireStream(streamId);
-    http2Stream.data(stream);
+    http2Stream.setProperty(NettyClientStream.class, stream);
 
     // Notify the stream that it has been created.
     stream.id(streamId);
@@ -345,7 +345,7 @@
    * Gets the client stream associated to the given HTTP/2 stream object.
    */
   private NettyClientStream clientStream(Http2Stream stream) {
-    return stream.<NettyClientStream>data();
+    return stream.getProperty(NettyClientStream.class);
   }
 
   /**
