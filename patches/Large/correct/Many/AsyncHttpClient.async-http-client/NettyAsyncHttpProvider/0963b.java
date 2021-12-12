diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 61c0a9f..0863718 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -712,7 +712,7 @@
                     int length = lengthWrapper[0];
                     nettyRequest.setHeader(HttpHeaders.Names.CONTENT_LENGTH, String.valueOf(length));
                     nettyRequest.setContent(ChannelBuffers.wrappedBuffer(bytes, 0, length));
-                } else if (request.getParams() != null) {
+                } else if (request.getParams() != null && !request.getParams().isEmpty()) {
                     StringBuilder sb = new StringBuilder();
                     for (final Entry<String, List<String>> paramEntry : request.getParams()) {
                         final String key = paramEntry.getKey();
