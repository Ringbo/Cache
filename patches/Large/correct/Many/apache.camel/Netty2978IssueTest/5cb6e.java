diff --git a/components/camel-netty/src/test/java/org/apache/camel/component/netty/Netty2978IssueTest.java b/components/camel-netty/src/test/java/org/apache/camel/component/netty/Netty2978IssueTest.java
index fba2b52..eedbba6 100644
--- a/components/camel-netty/src/test/java/org/apache/camel/component/netty/Netty2978IssueTest.java
+++ b/components/camel-netty/src/test/java/org/apache/camel/component/netty/Netty2978IssueTest.java
@@ -106,7 +106,7 @@
         private final Endpoint endpoint;
         private final ProducerTemplate producerTemplate;
 
-        public CamelClient(CamelContext camelContext) {
+        CamelClient(CamelContext camelContext) {
             this.endpoint = camelContext.getEndpoint("netty:tcp://localhost:{{port}}?sync=true");
             this.producerTemplate = camelContext.createProducerTemplate();
         }
