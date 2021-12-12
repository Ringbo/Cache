diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
index aaca3b5..aa4e8dc 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
@@ -49,7 +49,7 @@
         assertMockEndpointsSatisfied();
 
         // give on completion time to complete properly before we do assertions on its size
-        Thread.sleep(1000);
+        Thread.sleep(2000);
 
         // assert that we got all the correct data in our callback
         assertEquals(3, callback.getData().size());
