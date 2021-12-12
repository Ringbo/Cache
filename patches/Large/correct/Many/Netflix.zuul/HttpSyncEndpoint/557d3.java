diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpSyncEndpoint.java b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpSyncEndpoint.java
index 2c5b8b8..5677362 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpSyncEndpoint.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpSyncEndpoint.java
@@ -34,7 +34,7 @@
 public abstract class HttpSyncEndpoint extends SyncEndpoint<HttpRequestMessage, HttpResponseMessage>
 {
     @Override
-    public ZuulMessage getDefaultOutput(HttpRequestMessage request)
+    public HttpResponseMessage getDefaultOutput(HttpRequestMessage request)
     {
         return HttpResponseMessageImpl.defaultErrorResponse(request);
     }
