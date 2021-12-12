diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 2256db9..1d229b8 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -631,16 +631,16 @@
                     nettyRequest.setContent(buffer);
                 } else if (request.getByteData() != null) {
                     nettyRequest.setHeader(HttpHeaders.Names.CONTENT_LENGTH, String.valueOf(request.getByteData().length));
-                    nettyRequest.setContent(ChannelBuffers.copiedBuffer(request.getByteData()));
+                    nettyRequest.setContent(ChannelBuffers.wrappedBuffer(request.getByteData()));
                 } else if (request.getStringData() != null) {
                     nettyRequest.setHeader(HttpHeaders.Names.CONTENT_LENGTH, String.valueOf(request.getStringData().getBytes(bodyCharset).length));
-                    nettyRequest.setContent(ChannelBuffers.copiedBuffer(request.getStringData(), bodyCharset));
+                    nettyRequest.setContent(ChannelBuffers.wrappedBuffer(request.getStringData().getBytes(bodyCharset)));
                 } else if (request.getStreamData() != null) {
                     int[] lengthWrapper = new int[1];
                     byte[] bytes = AsyncHttpProviderUtils.readFully(request.getStreamData(), lengthWrapper);
                     int length = lengthWrapper[0];
                     nettyRequest.setHeader(HttpHeaders.Names.CONTENT_LENGTH, String.valueOf(length));
-                    nettyRequest.setContent(ChannelBuffers.copiedBuffer(bytes, 0, length));
+                    nettyRequest.setContent(ChannelBuffers.wrappedBuffer(bytes, 0, length));
                 } else if (request.getParams() != null) {
                     StringBuilder sb = new StringBuilder();
                     for (final Entry<String, List<String>> paramEntry : request.getParams()) {
@@ -655,7 +655,7 @@
                         }
                     }
                     nettyRequest.setHeader(HttpHeaders.Names.CONTENT_LENGTH, String.valueOf(sb.length()));
-                    nettyRequest.setContent(ChannelBuffers.copiedBuffer(sb.toString().getBytes(bodyCharset)));
+                    nettyRequest.setContent(ChannelBuffers.wrappedBuffer(sb.toString().getBytes(bodyCharset)));
 
                     if (!request.getHeaders().containsKey(HttpHeaders.Names.CONTENT_TYPE)) {
                         nettyRequest.setHeader(HttpHeaders.Names.CONTENT_TYPE, "application/x-www-form-urlencoded");
