diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerRunner.java b/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerRunner.java
index 4620585..2de1be8 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerRunner.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerRunner.java
@@ -198,7 +198,7 @@
 	}
 
 	// export the termination future for caller to know it is terminated
-	public CompletableFuture<Boolean> getTerminationFuture() {
+	public CompletableFuture<Void> getTerminationFuture() {
 		return taskManager.getTerminationFuture();
 	}
 
