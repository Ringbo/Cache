diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
index 3d60b6b..3fbc1e1 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentDecoder.java
@@ -101,7 +101,7 @@
 
             // set new content encoding,
             CharSequence targetContentEncoding = getTargetContentEncoding(contentEncoding);
-            if (HttpHeaderValues.IDENTITY.equals(targetContentEncoding)) {
+            if (HttpHeaderValues.IDENTITY.contentEquals(targetContentEncoding)) {
                 // Do NOT set the 'Content-Encoding' header if the target encoding is 'identity'
                 // as per: http://tools.ietf.org/html/rfc2616#section-14.11
                 headers.remove(HttpHeaderNames.CONTENT_ENCODING);
