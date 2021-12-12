diff --git a/camel-core/src/main/java/org/apache/camel/processor/loadbalancer/WeightedRoundRobinLoadBalancer.java b/camel-core/src/main/java/org/apache/camel/processor/loadbalancer/WeightedRoundRobinLoadBalancer.java
index 94e7818..41be294 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/loadbalancer/WeightedRoundRobinLoadBalancer.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/loadbalancer/WeightedRoundRobinLoadBalancer.java
@@ -29,7 +29,7 @@
     }
     
     @Override
-    protected Processor chooseProcessor(List<Processor> processors, Exchange exchange) {
+    protected synchronized Processor chooseProcessor(List<Processor> processors, Exchange exchange) {
         if (isRuntimeRatiosZeroed())  {
             resetRuntimeRatios();
             counter = 0;
