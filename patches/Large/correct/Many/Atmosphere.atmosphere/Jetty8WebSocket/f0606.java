diff --git a/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty8WebSocket.java b/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty8WebSocket.java
index 8182996..fce20a0 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty8WebSocket.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/version/Jetty8WebSocket.java
@@ -51,7 +51,7 @@
             logger.debug("The WebSocket handshake succeeded but the dispatched URI failed {}:{}. " +
                     "The WebSocket connection is still open and client can continue sending messages.", message, errorCode);
         } else {
-            logger.warn("{} {}", errorCode, message);
+            logger.debug("{} {}", errorCode, message);
         }
     }
 
