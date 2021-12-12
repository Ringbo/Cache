diff --git a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/ServerWebSocketContainer.java b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/ServerWebSocketContainer.java
index e2447d3..d426399 100644
--- a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/ServerWebSocketContainer.java
+++ b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/ServerWebSocketContainer.java
@@ -66,7 +66,7 @@
 
     @Override
     public void setDefaultMaxSessionIdleTimeout(final long timeout) {
-        this.maxSessionIdleTimeout = maxSessionIdleTimeout;
+        this.maxSessionIdleTimeout = timeout;
     }
 
     @Override
