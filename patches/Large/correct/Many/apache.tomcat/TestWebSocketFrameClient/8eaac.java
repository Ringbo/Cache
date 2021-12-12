diff --git a/test/org/apache/tomcat/websocket/TestWebSocketFrameClient.java b/test/org/apache/tomcat/websocket/TestWebSocketFrameClient.java
index 3a0b68c..1f608b6 100644
--- a/test/org/apache/tomcat/websocket/TestWebSocketFrameClient.java
+++ b/test/org/apache/tomcat/websocket/TestWebSocketFrameClient.java
@@ -142,7 +142,7 @@
         // should be a lot faster.
         System.out.println("Waiting for connection to be closed");
         count = 0;
-        limit = 10000;
+        limit = 100;
         while (TesterFirehoseServer.Endpoint.getOpenConnectionCount() != 0 && count < limit) {
             Thread.sleep(100);
             count ++;
