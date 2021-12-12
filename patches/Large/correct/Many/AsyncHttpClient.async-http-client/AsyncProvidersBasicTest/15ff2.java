diff --git a/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java b/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
index 10afe1f..19b3243 100755
--- a/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
+++ b/src/test/java/com/ning/http/client/async/AsyncProvidersBasicTest.java
@@ -1373,7 +1373,7 @@
     public void testAwsS3() throws Exception {
         final AsyncHttpClient c = new AsyncHttpClient(new Builder().build());
         Response response = c.prepareGet("http://test.s3.amazonaws.com/").execute().get();
-        if (response.getResponseBody() == null || response.getResponseBody().isEmpty()) {
+        if (response.getResponseBody() == null || response.getResponseBody().equals("")) {
             fail("No response Body");
         } else {
             assertEquals(response.getStatusCode(), 403);
