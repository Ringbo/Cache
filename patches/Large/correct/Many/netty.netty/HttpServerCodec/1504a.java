diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/HttpServerCodec.java b/codec-http/src/main/java/io/netty/handler/codec/http/HttpServerCodec.java
index 29a1199..a009df1 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/HttpServerCodec.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/HttpServerCodec.java
@@ -112,7 +112,7 @@
     private final class HttpServerResponseEncoder extends HttpResponseEncoder {
 
         @Override
-        boolean isContentAlwaysEmpty(@SuppressWarnings("unused") HttpResponse msg) {
+        protected boolean isContentAlwaysEmpty(@SuppressWarnings("unused") HttpResponse msg) {
             return HttpMethod.HEAD.equals(queue.poll());
         }
     }
