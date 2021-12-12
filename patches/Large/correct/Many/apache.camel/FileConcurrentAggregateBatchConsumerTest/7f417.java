diff --git a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentAggregateBatchConsumerTest.java b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentAggregateBatchConsumerTest.java
index 4ed020e..83cb987 100644
--- a/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentAggregateBatchConsumerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/file/FileConcurrentAggregateBatchConsumerTest.java
@@ -94,8 +94,8 @@
         long start = System.currentTimeMillis();
 
         MockEndpoint result = getMockEndpoint("mock:result");
-        // should be ordered
-        result.expectedBodiesReceived("A+C+E+G+I", "B+D+F+H+J");
+        // should be ordered in the body, but the files can be loaded in different order per OS
+        result.expectedBodiesReceivedInAnyOrder("A+C+E+G+I", "B+D+F+H+J");
 
         assertMockEndpointsSatisfied();
 
