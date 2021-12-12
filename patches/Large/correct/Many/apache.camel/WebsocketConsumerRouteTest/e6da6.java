diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketConsumerRouteTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketConsumerRouteTest.java
index ea1874a..20b2f40 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketConsumerRouteTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketConsumerRouteTest.java
@@ -109,7 +109,7 @@
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setPort(port);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 websocketComponent.setMinThreads(1);
 
                 from("websocket://echo")
