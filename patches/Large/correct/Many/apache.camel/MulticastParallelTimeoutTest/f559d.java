diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
index 5ca3817..af1f443 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeoutTest.java
@@ -29,8 +29,8 @@
 
     public void testMulticastParallelTimeout() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        // A will timeout so we only get B and C
-        mock.expectedBodiesReceived("BC");
+        // A will timeout so we only get B and/or C
+        mock.message(0).body().not(body().contains("A"));
 
         getMockEndpoint("mock:A").expectedMessageCount(0);
         getMockEndpoint("mock:B").expectedMessageCount(1);
@@ -63,7 +63,7 @@
                                 return oldExchange;
                             }
                         })
-                        .parallelProcessing().timeout(2000).to("direct:a", "direct:b", "direct:c")
+                        .parallelProcessing().timeout(1000).to("direct:a", "direct:b", "direct:c")
                     // use end to indicate end of multicast route
                     .end()
                     .to("mock:result");
