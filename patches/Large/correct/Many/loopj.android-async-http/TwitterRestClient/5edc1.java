diff --git a/examples/TwitterRestClient.java b/examples/TwitterRestClient.java
index f55708c..387a871 100644
--- a/examples/TwitterRestClient.java
+++ b/examples/TwitterRestClient.java
@@ -12,7 +12,7 @@
     }
 
     public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
-        client.get(getAbsoluteUrl(url), params, responseHandler);
+        client.post(getAbsoluteUrl(url), params, responseHandler);
     }
 
     private static String getAbsoluteUrl(String relativeUrl) {
