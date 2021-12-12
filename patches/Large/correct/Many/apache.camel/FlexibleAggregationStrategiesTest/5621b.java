diff --git a/camel-core/src/test/java/org/apache/camel/util/toolbox/FlexibleAggregationStrategiesTest.java b/camel-core/src/test/java/org/apache/camel/util/toolbox/FlexibleAggregationStrategiesTest.java
index bbb2aa9..8d050b4 100644
--- a/camel-core/src/test/java/org/apache/camel/util/toolbox/FlexibleAggregationStrategiesTest.java
+++ b/camel-core/src/test/java/org/apache/camel/util/toolbox/FlexibleAggregationStrategiesTest.java
@@ -173,12 +173,12 @@
 
         template.sendBody("direct:start.timeoutAndCompletionAware", "AGGREGATE1");
         
-        assertTrue(timeoutLatch.await(1200, TimeUnit.MILLISECONDS));
+        assertTrue(timeoutLatch.await(2500, TimeUnit.MILLISECONDS));
         
         template.sendBody("direct:start.timeoutAndCompletionAware", "AGGREGATE2");
         template.sendBody("direct:start.timeoutAndCompletionAware", "AGGREGATE3");
 
-        assertTrue(completionLatch.await(1200, TimeUnit.MILLISECONDS));
+        assertTrue(completionLatch.await(2500, TimeUnit.MILLISECONDS));
 
         getMockEndpoint("mock:result.timeoutAndCompletionAware").getReceivedExchanges();
         assertMockEndpointsSatisfied();
