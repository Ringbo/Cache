diff --git a/src/test/java/com/ning/http/client/async/BodyDeferringAsyncHandlerTest.java b/src/test/java/com/ning/http/client/async/BodyDeferringAsyncHandlerTest.java
index 56a86de..3d79324 100644
--- a/src/test/java/com/ning/http/client/async/BodyDeferringAsyncHandlerTest.java
+++ b/src/test/java/com/ning/http/client/async/BodyDeferringAsyncHandlerTest.java
@@ -157,7 +157,7 @@
         client.close();
     }
 
-    @Test(groups = { "standalone", "default_provider" }, enabled = false)
+    @Test(groups = { "standalone", "default_provider" }, enabled = true)
     public void deferredSimpleWithFailure() throws IOException,
             ExecutionException, TimeoutException, InterruptedException {
         AsyncHttpClient client = getAsyncHttpClient(getAsyncHttpClientConfig());
