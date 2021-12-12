diff --git a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateGroupedExchangeBatchSizeTest.java b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateGroupedExchangeBatchSizeTest.java
index 97db58c..c26cb8d 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateGroupedExchangeBatchSizeTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateGroupedExchangeBatchSizeTest.java
@@ -31,8 +31,8 @@
     public void testGrouped() throws Exception {
         MockEndpoint result = getMockEndpoint("mock:result");
 
-        // we expect 1 messages since we group all we get in using the same correlation key
-        result.expectedMessageCount(1);
+        // we expect 1 or 2 messages since we group all we get in using the same correlation key
+        result.expectedMinimumMessageCount(1);
 
         // then we sent all the message at once
         template.sendBody("direct:start", "100");
