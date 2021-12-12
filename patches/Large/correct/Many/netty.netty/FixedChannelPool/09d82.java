diff --git a/transport/src/main/java/io/netty/channel/pool/FixedChannelPool.java b/transport/src/main/java/io/netty/channel/pool/FixedChannelPool.java
index 1066358..ddafebb 100644
--- a/transport/src/main/java/io/netty/channel/pool/FixedChannelPool.java
+++ b/transport/src/main/java/io/netty/channel/pool/FixedChannelPool.java
@@ -264,7 +264,7 @@
     }
 
     private void runTaskQueue() {
-        while (acquiredChannelCount <= maxConnections) {
+        while (acquiredChannelCount < maxConnections) {
             AcquireTask task = pendingAcquireQueue.poll();
             if (task == null) {
                 break;
