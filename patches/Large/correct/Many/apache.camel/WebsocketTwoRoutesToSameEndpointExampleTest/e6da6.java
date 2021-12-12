diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSameEndpointExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSameEndpointExampleTest.java
index 7c0b145..677eb53 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSameEndpointExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesToSameEndpointExampleTest.java
@@ -94,7 +94,7 @@
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 
                 from("websocket://localhost:" + port + "/bar")
                         .log(">>> Message received from BAR WebSocket Client : ${body}")
