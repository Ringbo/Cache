diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteRestartTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteRestartTest.java
index 3f9c4d2..e28ca29 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteRestartTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteRestartTest.java
@@ -121,7 +121,7 @@
         return new RouteBuilder() {
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 websocketComponent.setMinThreads(1);
                 from("direct:shop")
                     .id(ROUTE_ID)
