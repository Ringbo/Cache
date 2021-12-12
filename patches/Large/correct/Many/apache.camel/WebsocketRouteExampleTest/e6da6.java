diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketRouteExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketRouteExampleTest.java
index 3606a27..d4b655c 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketRouteExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketRouteExampleTest.java
@@ -89,7 +89,7 @@
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setPort(port);
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
 
                 // START SNIPPET: e1
                 // expose a echo websocket client, that sends back an echo
