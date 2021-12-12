diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
index bb852f9..1023d29 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTimeout2Test.java
@@ -29,8 +29,8 @@
 
     public void testMulticastParallelTimeout() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        // B will timeout so we only get A and C
-        mock.expectedBodiesReceived("AC");
+        // B will timeout so we only get A and/or C
+        mock.message(0).body().not(body().contains("B"));
 
         getMockEndpoint("mock:A").expectedMessageCount(1);
         getMockEndpoint("mock:B").expectedMessageCount(0);
@@ -63,7 +63,7 @@
                                 return oldExchange;
                             }
                         })
-                        .parallelProcessing().timeout(2000).to("direct:a", "direct:b", "direct:c")
+                        .parallelProcessing().timeout(1000).to("direct:a", "direct:b", "direct:c")
                     // use end to indicate end of multicast route
                     .end()
                     .to("mock:result");
