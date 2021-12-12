diff --git a/okhttp-tests/src/test/java/okhttp3/URLConnectionTest.java b/okhttp-tests/src/test/java/okhttp3/URLConnectionTest.java
index 9fecda9..4a32ab7 100644
--- a/okhttp-tests/src/test/java/okhttp3/URLConnectionTest.java
+++ b/okhttp-tests/src/test/java/okhttp3/URLConnectionTest.java
@@ -2533,9 +2533,8 @@
    * https://code.google.com/p/android/issues/detail?id=41576
    */
   @Test public void sameConnectionRedirectAndReuse() throws Exception {
-    // TODO(jwilson): this behavior shouldn't rely on having another IP address to attempt.
     urlFactory.setClient(urlFactory.client().newBuilder()
-        .dns(new DoubleInetAddressDns())
+        .dns(new SingleInetAddressDns())
         .build());
     server.enqueue(new MockResponse()
         .setResponseCode(HttpURLConnection.HTTP_MOVED_TEMP)
