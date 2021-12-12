diff --git a/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java b/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
index 232f58a..2f947aa 100644
--- a/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
+++ b/examples/camel-example-twitter-websocket/src/main/java/org/apache/camel/example/websocket/CamelTwitterWebSocketMain.java
@@ -59,8 +59,10 @@
         route.setConsumerSecret(consumerSecret);
 
         // poll for gaga, every 5nd second
+        // twitter rate limits 180 per 15 min, so that is 0.2/sec, eg 1/5sec.
+        // so to be safe we do 6 seconds
         route.setSearchTerm("gaga");
-        route.setDelay(5000);
+        route.setDelay(6000);
 
         // web socket on port 9090
         route.setPort(9090);
