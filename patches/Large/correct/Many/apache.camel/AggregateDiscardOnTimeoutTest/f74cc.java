diff --git a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateDiscardOnTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateDiscardOnTimeoutTest.java
index 8018c97..d5525db 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateDiscardOnTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregateDiscardOnTimeoutTest.java
@@ -35,8 +35,8 @@
         template.sendBodyAndHeader("direct:start", "A", "id", 123);
         template.sendBodyAndHeader("direct:start", "B", "id", 123);
 
-        // wait 3 seconds
-        Thread.sleep(3000);
+        // wait 4 seconds
+        Thread.sleep(4000);
 
         mock.assertIsSatisfied();
 
@@ -61,7 +61,7 @@
                 from("direct:start")
                     .aggregate(header("id"), new BodyInAggregatingStrategy())
                         .completionSize(3)
-                        // use a 3 second timeout
+                        // use a 2 second timeout
                         .completionTimeout(2000)
                         // and if timeout occurred then just discard the aggregated message
                         .discardOnCompletionTimeout()
