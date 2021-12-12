diff --git a/transport/src/main/java/io/netty/channel/socket/nio/NioClientSocketPipelineSink.java b/transport/src/main/java/io/netty/channel/socket/nio/NioClientSocketPipelineSink.java
index ca23336..39b2a73 100644
--- a/transport/src/main/java/io/netty/channel/socket/nio/NioClientSocketPipelineSink.java
+++ b/transport/src/main/java/io/netty/channel/socket/nio/NioClientSocketPipelineSink.java
@@ -242,7 +242,7 @@
                 wakenUp.set(false);
 
                 try {
-                    int selectedKeyCount = selector.select(500);
+                    int selectedKeyCount = selector.select(10);
 
                     // 'wakenUp.compareAndSet(false, true)' is always evaluated
                     // before calling 'selector.wakeup()' to reduce the wake-up
@@ -282,9 +282,9 @@
                         processSelectedKeys(selector.selectedKeys());
                     }
 
-                    // Handle connection timeout every 0.5 seconds approximately.
+                    // Handle connection timeout every 10 milliseconds approximately.
                     long currentTimeNanos = System.nanoTime();
-                    if (currentTimeNanos - lastConnectTimeoutCheckTimeNanos >= 500 * 1000000L) {
+                    if (currentTimeNanos - lastConnectTimeoutCheckTimeNanos >= 10 * 1000000L) {
                         lastConnectTimeoutCheckTimeNanos = currentTimeNanos;
                         processConnectTimeout(selector.keys(), currentTimeNanos);
                     }
