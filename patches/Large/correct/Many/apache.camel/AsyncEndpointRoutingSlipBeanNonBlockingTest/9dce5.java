diff --git a/camel-core/src/test/java/org/apache/camel/processor/async/AsyncEndpointRoutingSlipBeanNonBlockingTest.java b/camel-core/src/test/java/org/apache/camel/processor/async/AsyncEndpointRoutingSlipBeanNonBlockingTest.java
index 4cfac28..57ca2f4 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/async/AsyncEndpointRoutingSlipBeanNonBlockingTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/async/AsyncEndpointRoutingSlipBeanNonBlockingTest.java
@@ -96,7 +96,7 @@
         private final Endpoint startEndpoint;
         private final SendProcessor asyncSender;
 
-        public ExchangeSubmitter(Endpoint startEndpoint, SendProcessor asyncSender) {
+        ExchangeSubmitter(Endpoint startEndpoint, SendProcessor asyncSender) {
             this.startEndpoint = startEndpoint;
             this.asyncSender = asyncSender;
         }
