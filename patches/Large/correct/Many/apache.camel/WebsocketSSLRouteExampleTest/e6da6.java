diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLRouteExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLRouteExampleTest.java
index 251cccc..f364b12 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLRouteExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLRouteExampleTest.java
@@ -162,7 +162,7 @@
                 websocketComponent.setSslContextParameters(defineSSLContextParameters());
                 websocketComponent.setPort(port);
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
 
                 from("websocket://test")
                         .log(">>> Message received from WebSocket Client : ${body}")
