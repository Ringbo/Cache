diff --git a/src/test/java/com/ning/http/client/async/SimpleAsyncHttpClientTest.java b/src/test/java/com/ning/http/client/async/SimpleAsyncHttpClientTest.java
index 1885344..99b1357 100644
--- a/src/test/java/com/ning/http/client/async/SimpleAsyncHttpClientTest.java
+++ b/src/test/java/com/ning/http/client/async/SimpleAsyncHttpClientTest.java
@@ -120,7 +120,7 @@
     /**
      * See https://issues.sonatype.org/browse/AHC-5
      */
-    @Test(groups = {"standalone", "default_provider"}, enabled = false)
+    @Test(groups = {"standalone", "default_provider"}, enabled = true)
     public void testPutZeroBytesFileTest() throws Throwable {
         System.err.println("setting up client");
         SimpleAsyncHttpClient client = new SimpleAsyncHttpClient.Builder()
