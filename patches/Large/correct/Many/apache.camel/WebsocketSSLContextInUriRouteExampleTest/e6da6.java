diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLContextInUriRouteExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLContextInUriRouteExampleTest.java
index 5f6e8d5..937fb76 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLContextInUriRouteExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketSSLContextInUriRouteExampleTest.java
@@ -166,7 +166,7 @@
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 from(uri)
                      .log(">>> Message received from WebSocket Client : ${body}")
                      .to("mock:client")
