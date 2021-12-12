diff --git a/netty/src/main/java/io/grpc/netty/NettyClientHandler.java b/netty/src/main/java/io/grpc/netty/NettyClientHandler.java
index ed5336a..2d0d547 100644
--- a/netty/src/main/java/io/grpc/netty/NettyClientHandler.java
+++ b/netty/src/main/java/io/grpc/netty/NettyClientHandler.java
@@ -226,7 +226,11 @@
   private void onRstStreamRead(int streamId, long errorCode) throws Http2Exception {
     NettyClientStream stream = clientStream(requireHttp2Stream(streamId));
     Status status = GrpcUtil.Http2Error.statusForCode((int) errorCode);
-    stream.transportReportStatus(status, false, new Metadata());
+    // TODO(carl-mastrangelo): This is a hack!  Currently, due to a bug in the deframer, the stream
+    // listener might not be closed if the stream is stopped while in the middle of a recieving a
+    // message.   This is a quick work around to get things working again, but should be changed
+    // back to not stopping delivery once a proper, thought-out fix is in place in the Deframer.
+    stream.transportReportStatus(status, true /*stop delivery*/, new Metadata());
   }
 
   @Override
