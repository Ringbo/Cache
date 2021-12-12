diff --git a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesExampleTest.java b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesExampleTest.java
index eb8d8f7..9a8c0cd 100644
--- a/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesExampleTest.java
+++ b/components/camel-websocket/src/test/java/org/apache/camel/component/websocket/WebsocketTwoRoutesExampleTest.java
@@ -131,7 +131,7 @@
             public void configure() {
                 WebsocketComponent websocketComponent = (WebsocketComponent) context.getComponent("websocket");
                 websocketComponent.setMinThreads(1);
-                websocketComponent.setMaxThreads(11);
+                websocketComponent.setMaxThreads(20);
                 
                 from("websocket://localhost:" + port + "/bar")
                     .log(">>> Message received from BAR WebSocket Client : ${body}")
