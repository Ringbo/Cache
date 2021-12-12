diff --git a/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java b/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
index 3805c10..8b290e5 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
@@ -275,9 +275,9 @@
         lastUpdate = DateTime.now();
     }
 
-    private void sendGetResults()
+    private synchronized void sendGetResults()
     {
-        final URI uri = HttpUriBuilder.uriBuilderFrom(location).appendPath(String.valueOf(token)).build();
+        URI uri = HttpUriBuilder.uriBuilderFrom(location).appendPath(String.valueOf(token)).build();
         HttpResponseFuture<PagesResponse> resultFuture = httpClient.executeAsync(
                 prepareGet()
                         .setHeader(PRESTO_MAX_SIZE, maxResponseSize.toString())
@@ -359,7 +359,7 @@
         }, executor);
     }
 
-    private void sendDelete()
+    private synchronized void sendDelete()
     {
         HttpResponseFuture<StatusResponse> resultFuture = httpClient.executeAsync(prepareDelete().setUri(location).build(), createStatusResponseHandler());
         future = resultFuture;
