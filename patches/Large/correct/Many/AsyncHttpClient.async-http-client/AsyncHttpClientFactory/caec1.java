diff --git a/extras/registry/src/main/java/org/asynchttpclient/extras/registry/AsyncHttpClientFactory.java b/extras/registry/src/main/java/org/asynchttpclient/extras/registry/AsyncHttpClientFactory.java
index b0d5a06..9412087 100644
--- a/extras/registry/src/main/java/org/asynchttpclient/extras/registry/AsyncHttpClientFactory.java
+++ b/extras/registry/src/main/java/org/asynchttpclient/extras/registry/AsyncHttpClientFactory.java
@@ -63,7 +63,7 @@
     public static AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
         if (attemptInstantiation()) {
             try {
-                Constructor<AsyncHttpClient> constructor = asyncHttpClientImplClass.getConstructor(DefaultAsyncHttpClientConfig.class);
+                Constructor<AsyncHttpClient> constructor = asyncHttpClientImplClass.getConstructor(AsyncHttpClientConfig.class);
                 return constructor.newInstance(config);
             } catch (Exception e) {
                 throw new AsyncHttpClientImplException("Unable to find the instantiate the class specified by system property : "
