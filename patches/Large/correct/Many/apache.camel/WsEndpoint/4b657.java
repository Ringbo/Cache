diff --git a/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java b/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
index 5b92134..5ddf90c 100644
--- a/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
+++ b/components/camel-ahc-ws/src/main/java/org/apache/camel/component/ahc/ws/WsEndpoint.java
@@ -206,7 +206,7 @@
         }
 
         public void onPingFrame(byte[] payload) {
-            LOG.debug("Received ping --> {}", payload);
+            log.debug("Received ping --> {}", payload);
             websocket.sendPongFrame(payload);
         }
     }
