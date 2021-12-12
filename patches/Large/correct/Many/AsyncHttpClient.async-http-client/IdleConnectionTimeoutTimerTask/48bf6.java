diff --git a/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/timeout/IdleConnectionTimeoutTimerTask.java b/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/timeout/IdleConnectionTimeoutTimerTask.java
index f547795..96cb9b9 100644
--- a/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/timeout/IdleConnectionTimeoutTimerTask.java
+++ b/providers/netty/src/main/java/org/asynchttpclient/providers/netty/request/timeout/IdleConnectionTimeoutTimerTask.java
@@ -46,7 +46,7 @@
 
             long now = millisTime();
 
-            long currentIdleConnectionTimeoutInstant = idleConnectionTimeout - nettyResponseFuture.getLastTouch();
+            long currentIdleConnectionTimeoutInstant = idleConnectionTimeout + nettyResponseFuture.getLastTouch();
             long durationBeforeCurrentIdleConnectionTimeout = currentIdleConnectionTimeoutInstant - now;
 
             if (durationBeforeCurrentIdleConnectionTimeout <= 0L) {
