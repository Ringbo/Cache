diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpReadTimeoutTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpReadTimeoutTests.java
index 97b4398..2d9395b 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpReadTimeoutTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/support/http/HttpReadTimeoutTests.java
@@ -93,7 +93,7 @@
         long start = System.nanoTime();
         try {
             httpClient.execute(request);
-            fail("expected read timeout after 5 seconds (default)");
+            fail("expected read timeout after 3 seconds (default)");
         } catch (ElasticsearchTimeoutException ete) {
             // expected
 
@@ -105,7 +105,7 @@
             assertThat(timeout.seconds(), lessThan(5L));
         }
 
-        if (!latch.await(10, TimeUnit.SECONDS)) {
+        if (!latch.await(7, TimeUnit.SECONDS)) {
             // should never happen
             fail("waited too long for the response to be returned");
         }
@@ -132,7 +132,7 @@
         long start = System.nanoTime();
         try {
             httpClient.execute(request);
-            fail("expected read timeout after 5 seconds (default)");
+            fail("expected read timeout after 5 seconds");
         } catch (ElasticsearchTimeoutException ete) {
             // expected
 
@@ -163,7 +163,7 @@
         @Override
         public MockResponse dispatch(RecordedRequest request) throws InterruptedException {
             if (path.equals(request.getPath())) {
-                Thread.sleep(5000);
+                Thread.sleep(10000);
                 latch.countDown();
             }
             return new MockResponse().setStatus("200");
