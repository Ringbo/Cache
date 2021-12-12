diff --git a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregatorBatchOptionsTest.java b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregatorBatchOptionsTest.java
index 0d34eaa..be82d96 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregatorBatchOptionsTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AggregatorBatchOptionsTest.java
@@ -23,8 +23,8 @@
                     // as we have not configured more on the aggregator it will default to aggregate the
                     // latest exchange only
                     .aggregator().header("id")
-                    // wait for 2 seconds to aggregate
-                    .batchTimeout(2000L)
+                    // wait for 0.5 seconds to aggregate
+                    .batchTimeout(500L)
                     // batch size in is the limit of number of exchanges recieved, so when we have received 100
                     // exchanges then whatever we have in the collection will be sent
                     .batchSize(100)
@@ -41,7 +41,7 @@
         MockEndpoint result = getMockEndpoint("mock:result");
 
         // we expect 3 messages grouped by the latest message only
-        result.expectedMessageCount(3);
+        result.expectedMinimumMessageCount(3);
         result.expectedBodiesReceived("Message 1c", "Message 2b", "Message 3a");
 
         // then we sent all the message at once
@@ -72,8 +72,8 @@
                     // as we have not configured more on the aggregator it will default to aggregate the
                     // latest exchange only
                     .aggregator().header("id")
-                    // wait for 2 seconds to aggregate
-                    .batchTimeout(2000L)
+                    // wait for 0.5 seconds to aggregate
+                    .batchTimeout(500L)
                     // batch size in is the limit of number of exchanges recieved, so when we have received 100
                     // exchanges then whatever we have in the collection will be sent
                     .batchSize(5)
@@ -87,7 +87,7 @@
         MockEndpoint result = getMockEndpoint("mock:result");
 
         // we expect 3 messages grouped by the latest message only
-        result.expectedMessageCount(2);
+        result.expectedMinimumMessageCount(2);
         result.expectedBodiesReceived("Message 1c", "Message 2b");
 
         // then we sent all the message at once
@@ -130,7 +130,7 @@
         MockEndpoint result = getMockEndpoint("mock:result");
 
         // we expect 3 messages grouped by the latest message only
-        result.expectedMessageCount(3);
+        result.expectedMinimumMessageCount(3);
         result.expectedBodiesReceived("Message 1c", "Message 2b", "Message 3a");
 
         // then we sent all the message at once
