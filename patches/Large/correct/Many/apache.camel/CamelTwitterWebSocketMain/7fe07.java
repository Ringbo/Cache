diff --git a/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java b/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
index 50b2e33..232f58a 100644
--- a/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
+++ b/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
@@ -60,7 +60,7 @@
 
         // poll for gaga, every 5nd second
         route.setSearchTerm("gaga");
-        route.setDelay(5);
+        route.setDelay(5000);
 
         // web socket on port 9090
         route.setPort(9090);
