diff --git a/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/NonBlockingIOThreadingModel.java b/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/NonBlockingIOThreadingModel.java
index b9be294..dd2504f 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/NonBlockingIOThreadingModel.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/networking/nonblocking/NonBlockingIOThreadingModel.java
@@ -156,7 +156,7 @@
         if (logger.isFineEnabled()) {
             logger.fine("TcpIpConnectionManager configured with Non Blocking IO-threading model: "
                     + inputThreadCount + " input threads and "
-                    + outputThreads + " output threads");
+                    + outputThreadCount + " output threads");
         }
 
 
