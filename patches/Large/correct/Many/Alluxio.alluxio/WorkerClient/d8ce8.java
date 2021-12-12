diff --git a/common/src/main/java/tachyon/worker/WorkerClient.java b/common/src/main/java/tachyon/worker/WorkerClient.java
index 020af7d..7f374f3 100644
--- a/common/src/main/java/tachyon/worker/WorkerClient.java
+++ b/common/src/main/java/tachyon/worker/WorkerClient.java
@@ -197,7 +197,7 @@
     if (mConnected) {
       try {
         // Heartbeat to send the client metrics.
-        if (mHeartbeat != null) {
+        if (mHeartbeatExecutor != null) {
           mHeartbeatExecutor.heartbeat();
         }
         mProtocol.getTransport().close();
