diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketComponentRouteExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketComponentRouteExampleTest.java
index 76b14a0..211856f 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketComponentRouteExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketComponentRouteExampleTest.java
@@ -92,7 +92,7 @@
                 WebsocketComponent websocketComponent = getContext().getComponent("websocket", WebsocketComponent.class);
                 websocketComponent.setHost("localhost");
                 websocketComponent.setPort(port);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 websocketComponent.setMinThreads(1);
 
                 from("websocket://echo")
