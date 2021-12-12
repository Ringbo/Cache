diff --git a/handler/src/main/java/io/netty/handler/ssl/SslHandler.java b/handler/src/main/java/io/netty/handler/ssl/SslHandler.java
index 63561a3..bfa5960 100644
--- a/handler/src/main/java/io/netty/handler/ssl/SslHandler.java
+++ b/handler/src/main/java/io/netty/handler/ssl/SslHandler.java
@@ -267,7 +267,7 @@
     }
 
     public long getCloseNotifyTimeoutMillis() {
-        return handshakeTimeoutMillis;
+        return closeNotifyTimeoutMillis;
     }
 
     public void setCloseNotifyTimeout(long closeNotifyTimeout, TimeUnit unit) {
