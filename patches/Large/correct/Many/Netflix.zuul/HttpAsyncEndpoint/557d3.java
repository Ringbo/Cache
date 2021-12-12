diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpAsyncEndpoint.java b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpAsyncEndpoint.java
index eb5130b..976451b 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpAsyncEndpoint.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpAsyncEndpoint.java
@@ -14,7 +14,7 @@
 public abstract class HttpAsyncEndpoint extends Endpoint<HttpRequestMessage, HttpResponseMessage>
 {
     @Override
-    public ZuulMessage getDefaultOutput(HttpRequestMessage request)
+    public HttpResponseMessage getDefaultOutput(HttpRequestMessage request)
     {
         return HttpResponseMessageImpl.defaultErrorResponse(request);
     }
