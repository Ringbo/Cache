diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessor.java
index f9070e5..5153419 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/WebSocketProcessor.java
@@ -161,10 +161,10 @@
                         WebSocketEventListener.class.cast(l).onMessage(event);
                         break;
                     case HANDSHAKE:
-                        WebSocketEventListener.class.cast(l).onMessage(event);
+                        WebSocketEventListener.class.cast(l).onHandshake(event);
                         break;
                     case CLOSE:
-                        WebSocketEventListener.class.cast(l).onMessage(event);
+                        WebSocketEventListener.class.cast(l).onClose(event);
                         break;
                 }
             }
