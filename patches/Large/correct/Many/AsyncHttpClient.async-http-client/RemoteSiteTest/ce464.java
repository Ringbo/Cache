diff --git a/api/src/test/java/org/asynchttpclient/async/RemoteSiteTest.java b/api/src/test/java/org/asynchttpclient/async/RemoteSiteTest.java
index 521ce1d..a6e08a2 100644
--- a/api/src/test/java/org/asynchttpclient/async/RemoteSiteTest.java
+++ b/api/src/test/java/org/asynchttpclient/async/RemoteSiteTest.java
@@ -119,7 +119,7 @@
         try {
             Response response = c.prepareGet("http://google.com/").execute().get(10, TimeUnit.SECONDS);
             assertNotNull(response);
-            assertEquals(response.getStatusCode(), 301);
+            assertEquals(response.getStatusCode(), 302);
         } finally {
             c.close();
         }
