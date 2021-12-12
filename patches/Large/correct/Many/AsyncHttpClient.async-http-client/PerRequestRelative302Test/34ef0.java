diff --git a/api/src/test/java/org/asynchttpclient/PerRequestRelative302Test.java b/api/src/test/java/org/asynchttpclient/PerRequestRelative302Test.java
index 7de4bb3..500389d 100644
--- a/api/src/test/java/org/asynchttpclient/PerRequestRelative302Test.java
+++ b/api/src/test/java/org/asynchttpclient/PerRequestRelative302Test.java
@@ -41,6 +41,7 @@
 
 public abstract class PerRequestRelative302Test extends AbstractBasicTest {
 
+ // FIXME super NOT threadsafe!!!
     private final AtomicBoolean isSet = new AtomicBoolean(false);
 
     private class Relative302Handler extends AbstractHandler {
@@ -152,7 +153,7 @@
         try (AsyncHttpClient c = getAsyncHttpClient(null)) {
             Response response = c.preparePost(getTargetUrl()).setFollowRedirect(true).setHeader("X-redirect", "/foo/test").execute().get();
             assertNotNull(response);
-            assertEquals(response.getStatusCode(), 302);
+            assertEquals(response.getStatusCode(), 200);
             assertEquals(response.getUri().toString(), getTargetUrl());
         }
     }
