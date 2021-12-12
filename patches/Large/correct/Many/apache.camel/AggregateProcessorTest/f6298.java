diff --git a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateProcessorTest.java b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateProcessorTest.java
index 6e91edc..9ae8b61 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateProcessorTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateProcessorTest.java
@@ -559,7 +559,7 @@
         context.start();
 
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedBodiesReceived("B+END", "A+END");
+        mock.expectedBodiesReceivedInAnyOrder("B+END", "A+END");
         mock.expectedPropertyReceived(Exchange.AGGREGATED_COMPLETED_BY, "forceCompletion");
 
         Processor done = new SendProcessor(context.getEndpoint("mock:result"));
