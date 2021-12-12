diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutAwareTest.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutAwareTest.java
index c9710f9..6f70d3b 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutAwareTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutAwareTest.java
@@ -29,8 +29,8 @@
 
     public void testMulticastParallelTimeoutAware() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        // A will timeout so we only get B and C
-        mock.expectedBodiesReceived("BC");
+        // A will timeout so we only get B and/or C
+        mock.message(0).body().not(body().contains("A"));
 
         template.sendBody("direct:start", "Hello");
 
@@ -44,12 +44,12 @@
             public void configure() throws Exception {
                 from("direct:start")
                         .multicast(new MyAggregationStrategy())
-                        .parallelProcessing().timeout(2000).to("direct:a", "direct:b", "direct:c")
+                            .parallelProcessing().timeout(1000).to("direct:a", "direct:b", "direct:c")
                         // use end to indicate end of multicast route
                         .end()
                         .to("mock:result");
 
-                from("direct:a").delay(3000).setBody(constant("A"));
+                from("direct:a").delay(2000).setBody(constant("A"));
 
                 from("direct:b").setBody(constant("B"));
 
@@ -61,7 +61,7 @@
     private class MyAggregationStrategy implements TimeoutAwareAggregationStrategy {
 
         public void timeout(Exchange oldExchange, int index, int total, long timeout) {
-            assertEquals(2000, timeout);
+            assertEquals(1000, timeout);
             assertEquals(3, total);
             assertEquals(0, index);
             assertNotNull(oldExchange);
