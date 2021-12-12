diff --git a/transport-sctp/src/main/java/io/netty/channel/sctp/SctpClientPipelineSink.java b/transport-sctp/src/main/java/io/netty/channel/sctp/SctpClientPipelineSink.java
index 363407f..b72c4f5 100644
--- a/transport-sctp/src/main/java/io/netty/channel/sctp/SctpClientPipelineSink.java
+++ b/transport-sctp/src/main/java/io/netty/channel/sctp/SctpClientPipelineSink.java
@@ -262,7 +262,7 @@
                 wakenUp.set(false);
 
                 try {
-                    int selectedKeyCount = selector.select(500);
+                    int selectedKeyCount = selector.select(10);
 
                     // 'wakenUp.compareAndSet(false, true)' is always evaluated
                     // before calling 'selector.wakeup()' to reduce the wake-up
@@ -302,9 +302,9 @@
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
