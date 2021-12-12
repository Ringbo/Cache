diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebscoketEndpointConfigurationTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebscoketEndpointConfigurationTest.java
index 029529d..27e01ba 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebscoketEndpointConfigurationTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebscoketEndpointConfigurationTest.java
@@ -44,7 +44,7 @@
         WebsocketEndpoint websocketEndpoint = (WebsocketEndpoint)context.getEndpoint(uri);
         WebsocketComponent component = websocketEndpoint.getComponent();
         component.setMinThreads(1);
-        component.setMaxThreads(11);
+        component.setMaxThreads(20);
         Consumer consumer = websocketEndpoint.createConsumer(processor);
         component.connect((WebsocketProducerConsumer) consumer);
         
