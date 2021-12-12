diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSIndividualAndBroadcastEndpointExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSIndividualAndBroadcastEndpointExampleTest.java
index d4aa92f..0b09f8a 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSIndividualAndBroadcastEndpointExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSIndividualAndBroadcastEndpointExampleTest.java
@@ -94,7 +94,7 @@
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 
                 from("websocket://localhost:" + port + "/bar")
                         .log(">>> Message received from BAR WebSocket Client : ${body}")
