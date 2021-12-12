diff --git a/codec-http2/src/main/java/io/netty/handler/codec/http2/InboundHttpToHttp2Adapter.java b/codec-http2/src/main/java/io/netty/handler/codec/http2/InboundHttpToHttp2Adapter.java
index 73fb3d8..4cf2f00 100644
--- a/codec-http2/src/main/java/io/netty/handler/codec/http2/InboundHttpToHttp2Adapter.java
+++ b/codec-http2/src/main/java/io/netty/handler/codec/http2/InboundHttpToHttp2Adapter.java
@@ -35,7 +35,7 @@
 
     private int getStreamId(HttpHeaders httpHeaders) {
         return httpHeaders.getInt(HttpConversionUtil.ExtensionHeaderNames.STREAM_ID.text(),
-            connection.remote().nextStreamId());
+                                  connection.remote().incrementAndGetNextStreamId());
     }
 
     @Override
