diff --git a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
index 501f8d0..64a4930 100644
--- a/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
+++ b/tests/camel-itest/src/test/java/org/apache/camel/itest/async/HttpAsyncCallbackTest.java
@@ -48,7 +48,7 @@
 
         // give on completion time to complete properly before we do assertions on its size
         // TODO: improve MockEndpoint.assertIsSatisfied(long) to make this sleep unnecessary
-        Thread.sleep(2200);
+        Thread.sleep(3000);
 
         // END SNIPPET: e3
         assertMockEndpointsSatisfied();
