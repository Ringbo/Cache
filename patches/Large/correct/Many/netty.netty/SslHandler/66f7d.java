diff --git a/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java b/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
index b210672..3b864b2 100644
--- a/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
+++ b/src/main/java/org/jboss/netty/handler/ssl/SslHandler.java
@@ -503,7 +503,7 @@
             handshaking = false;
             handshaken = true;
 
-            if (handshakeFuture != null) {
+            if (handshakeFuture == null) {
                 handshakeFuture = newHandshakeFuture(channel);
             }
         }
@@ -515,7 +515,7 @@
             handshaking = false;
             handshaken = false;
 
-            if (handshakeFuture != null) {
+            if (handshakeFuture == null) {
                 handshakeFuture = newHandshakeFuture(channel);
             }
         }
