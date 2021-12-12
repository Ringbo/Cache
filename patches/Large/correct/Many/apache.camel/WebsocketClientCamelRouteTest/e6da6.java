diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketClientCamelRouteTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketClientCamelRouteTest.java
index f226a27..c98f893 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketClientCamelRouteTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketClientCamelRouteTest.java
@@ -97,7 +97,7 @@
                 WebsocketComponent websocketComponent = getContext().getComponent("websocket", WebsocketComponent.class);
                 websocketComponent.setPort(port);
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
 
                 from("websocket://test")
                         .log(">>> Message received from WebSocket Client : ${body}")
