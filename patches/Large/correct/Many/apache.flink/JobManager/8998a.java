diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/JobManager.java b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/JobManager.java
index 113f8fd..f79fecb 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/JobManager.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmanager/JobManager.java
@@ -661,7 +661,7 @@
 
 	@Override
 	public InstanceID registerTaskManager(InstanceConnectionInfo instanceConnectionInfo, HardwareDescription hardwareDescription, int numberOfSlots) {
-		if (this.instanceManager != null) {
+		if (this.instanceManager != null && this.scheduler != null) {
 			return this.instanceManager.registerTaskManager(instanceConnectionInfo, hardwareDescription, numberOfSlots);
 		} else {
 			return null;
