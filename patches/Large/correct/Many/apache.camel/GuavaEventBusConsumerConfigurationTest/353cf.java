diff --git a/components/camel-guava-eventbus/src/test/java/org/apache/camel/component/guava/eventbus/GuavaEventBusConsumerConfigurationTest.java b/components/camel-guava-eventbus/src/test/java/org/apache/camel/component/guava/eventbus/GuavaEventBusConsumerConfigurationTest.java
index ffb2243..d98b006 100644
--- a/components/camel-guava-eventbus/src/test/java/org/apache/camel/component/guava/eventbus/GuavaEventBusConsumerConfigurationTest.java
+++ b/components/camel-guava-eventbus/src/test/java/org/apache/camel/component/guava/eventbus/GuavaEventBusConsumerConfigurationTest.java
@@ -36,7 +36,7 @@
     public void invalidConfiguration() throws Exception {
         // Given
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("eventBus", new EventBus());
+        registry.bind("eventBus", new EventBus());
         CamelContext context = new DefaultCamelContext(registry);
         context.addRoutes(new RouteBuilder() {
             @Override
