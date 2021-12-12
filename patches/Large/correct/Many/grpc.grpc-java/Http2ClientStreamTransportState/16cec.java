diff --git a/core/src/main/java/io/grpc/internal/Http2ClientStreamTransportState.java b/core/src/main/java/io/grpc/internal/Http2ClientStreamTransportState.java
index 5037789..ea22432 100644
--- a/core/src/main/java/io/grpc/internal/Http2ClientStreamTransportState.java
+++ b/core/src/main/java/io/grpc/internal/Http2ClientStreamTransportState.java
@@ -226,7 +226,7 @@
   private static Charset extractCharset(Metadata headers) {
     String contentType = headers.get(GrpcUtil.CONTENT_TYPE_KEY);
     if (contentType != null) {
-      String[] split = contentType.split("charset=");
+      String[] split = contentType.split("charset=", 2);
       try {
         return Charset.forName(split[split.length - 1].trim());
       } catch (Exception t) {
