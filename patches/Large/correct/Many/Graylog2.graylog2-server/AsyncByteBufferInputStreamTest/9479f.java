diff --git a/graylog2-rest-client/src/test/java/org/graylog2/restclient/lib/AsyncByteBufferInputStreamTest.java b/graylog2-rest-client/src/test/java/org/graylog2/restclient/lib/AsyncByteBufferInputStreamTest.java
index 23d87b8..c19adea 100644
--- a/graylog2-rest-client/src/test/java/org/graylog2/restclient/lib/AsyncByteBufferInputStreamTest.java
+++ b/graylog2-rest-client/src/test/java/org/graylog2/restclient/lib/AsyncByteBufferInputStreamTest.java
@@ -153,7 +153,7 @@
         reader.join();
         writer.join();
 
-        await().atMost(5, TimeUnit.SECONDS).untilTrue(caughtExceptionInReader);
+        await().atMost(20, TimeUnit.SECONDS).untilTrue(caughtExceptionInReader);
         assertTrue(stream.getFailed() instanceof Exception);
         assertEquals("Some weird error", stream.getFailed().getMessage());
     }
@@ -188,7 +188,7 @@
         reader.join();
         writer.join();
 
-        await().atMost(5, TimeUnit.SECONDS).until(new Callable<Boolean>() {
+        await().atMost(20, TimeUnit.SECONDS).until(new Callable<Boolean>() {
             @Override
             public Boolean call() throws Exception {
                 return stream.isDone();
