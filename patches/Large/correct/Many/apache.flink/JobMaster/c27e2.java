diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobMaster.java b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobMaster.java
index dd2a7ea..015751b 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobMaster.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobMaster.java
@@ -407,7 +407,7 @@
 
 		// shut down will internally release all registered slots
 		slotPool.shutDown();
-		CompletableFuture<Boolean> terminationFuture = slotPool.getTerminationFuture();
+		CompletableFuture<Void> terminationFuture = slotPool.getTerminationFuture();
 
 		Exception exception = null;
 
