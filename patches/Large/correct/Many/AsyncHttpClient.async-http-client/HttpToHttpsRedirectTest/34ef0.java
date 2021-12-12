diff --git a/api/src/test/java/org/asynchttpclient/HttpToHttpsRedirectTest.java b/api/src/test/java/org/asynchttpclient/HttpToHttpsRedirectTest.java
index abe7b82..ff1b240 100644
--- a/api/src/test/java/org/asynchttpclient/HttpToHttpsRedirectTest.java
+++ b/api/src/test/java/org/asynchttpclient/HttpToHttpsRedirectTest.java
@@ -38,6 +38,7 @@
 
 public abstract class HttpToHttpsRedirectTest extends AbstractBasicTest {
 
+    // FIXME super NOT threadsafe!!!
     private final AtomicBoolean redirectDone = new AtomicBoolean(false);
 
     private class Relative302Handler extends AbstractHandler {
@@ -142,7 +143,7 @@
         try (AsyncHttpClient c = getAsyncHttpClient(cg)) {
             Response response = c.prepareGet(getTargetUrl()).setHeader("X-redirect", "/foo/test").execute().get();
             assertNotNull(response);
-            assertEquals(response.getStatusCode(), 302);
+            assertEquals(response.getStatusCode(), 200);
             assertEquals(response.getUri().toString(), getTargetUrl());
         }
     }
