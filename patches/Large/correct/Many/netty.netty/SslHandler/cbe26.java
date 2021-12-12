diff --git a/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java b/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
index 3fccab9..633f68b 100644
--- a/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
+++ b/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
@@ -935,7 +935,8 @@
     }
 
     private void handleRenegotiation(HandshakeStatus handshakeStatus) {
-        if (handshakeStatus == HandshakeStatus.NOT_HANDSHAKING) {
+        if (handshakeStatus == HandshakeStatus.NOT_HANDSHAKING ||
+            handshakeStatus == HandshakeStatus.FINISHED) {
             // Not handshaking
             return;
         }
