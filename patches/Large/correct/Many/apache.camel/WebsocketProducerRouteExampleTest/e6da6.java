diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteExampleTest.java
index aea401a..513e71b 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketProducerRouteExampleTest.java
@@ -146,7 +146,7 @@
         return new RouteBuilder() {
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 websocketComponent.setMinThreads(1);
                 from("direct:shop")
                     .log(">>> Message received from Shopping center : ${body}")
