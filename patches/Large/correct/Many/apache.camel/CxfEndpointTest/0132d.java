diff --git a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/CxfEndpointTest.java b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/CxfEndpointTest.java
index 8293ec6..72e93c5 100644
--- a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/CxfEndpointTest.java
+++ b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/CxfEndpointTest.java
@@ -102,7 +102,7 @@
         SimpleRegistry registry = new SimpleRegistry();
         CxfEndpointConfigurer configurer = mock(CxfEndpointConfigurer.class);
         Processor processor = mock(Processor.class);
-        registry.put("myConfigurer", configurer);
+        registry.bind("myConfigurer", configurer);
         CamelContext camelContext = new DefaultCamelContext(registry);
         CxfComponent cxfComponent = new CxfComponent(camelContext);
         CxfEndpoint endpoint = (CxfEndpoint)cxfComponent.createEndpoint(routerEndpointURI + "&cxfEndpointConfigurer=#myConfigurer");
