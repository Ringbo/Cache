diff --git a/components/camel-pulsar/src/test/java/org/apache/camel/component/pulsar/PulsarComponentTest.java b/components/camel-pulsar/src/test/java/org/apache/camel/component/pulsar/PulsarComponentTest.java
index 7a9adc2..620ea2c 100644
--- a/components/camel-pulsar/src/test/java/org/apache/camel/component/pulsar/PulsarComponentTest.java
+++ b/components/camel-pulsar/src/test/java/org/apache/camel/component/pulsar/PulsarComponentTest.java
@@ -39,7 +39,7 @@
 
     @Test
     public void testPulsarEndpointConfiguration() throws Exception {
-        PulsarComponent component = new PulsarComponent();
+        PulsarComponent component = new PulsarComponent(context);
         component.setAutoConfiguration(autoConfiguration);
 
         PulsarEndpoint endpoint = (PulsarEndpoint)component
