diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/heartbeat/HeartbeatManagerImpl.java b/flink-runtime/src/main/java/org/apache/flink/runtime/heartbeat/HeartbeatManagerImpl.java
index 42268fc..242fbaa 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/heartbeat/HeartbeatManagerImpl.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/heartbeat/HeartbeatManagerImpl.java
@@ -277,7 +277,7 @@
 			this.scheduledExecutor = Preconditions.checkNotNull(scheduledExecutor);
 			this.heartbeatListener = Preconditions.checkNotNull(heartbeatListener);
 
-			Preconditions.checkArgument(heartbeatTimeoutIntervalMs >= 0L, "The heartbeat timeout interval has to be larger than 0.");
+			Preconditions.checkArgument(heartbeatTimeoutIntervalMs > 0L, "The heartbeat timeout interval has to be larger than 0.");
 			this.heartbeatTimeoutIntervalMs = heartbeatTimeoutIntervalMs;
 
 			lastHeartbeat = 0L;
