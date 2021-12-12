diff --git a/profiler/src/main/java/com/navercorp/pinpoint/profiler/sender/SpanStreamUdpSender.java b/profiler/src/main/java/com/navercorp/pinpoint/profiler/sender/SpanStreamUdpSender.java
index f62a93a..509356b 100644
--- a/profiler/src/main/java/com/navercorp/pinpoint/profiler/sender/SpanStreamUdpSender.java
+++ b/profiler/src/main/java/com/navercorp/pinpoint/profiler/sender/SpanStreamUdpSender.java
@@ -64,7 +64,7 @@
     }
     
     public SpanStreamUdpSender(String host, int port, String threadName, int queueSize, int timeout, int sendBufferSize) {
-        this(host, port, threadName, queueSize, timeout, SEND_BUFFER_SIZE, DEFAULT_BUFFER_SIZE);
+        this(host, port, threadName, queueSize, timeout, sendBufferSize, DEFAULT_BUFFER_SIZE);
     }
 
     public SpanStreamUdpSender(String host, int port, String threadName, int queueSize, int timeout, int sendBufferSize, int dataBufferSize) {
