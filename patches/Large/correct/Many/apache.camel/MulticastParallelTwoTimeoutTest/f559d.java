diff --git a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTwoTimeoutTest.java b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTwoTimeoutTest.java
index bb858a2..4d4fe0a 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTwoTimeoutTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/MulticastParallelTwoTimeoutTest.java
@@ -54,7 +54,7 @@
                                 return oldExchange;
                             }
                         })
-                        .parallelProcessing().timeout(2000).to("direct:a", "direct:b", "direct:c")
+                        .parallelProcessing().timeout(1000).to("direct:a", "direct:b", "direct:c")
                     // use end to indicate end of multicast route
                     .end()
                     .to("mock:result");
