diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobManagerRunner.java b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobManagerRunner.java
index 5740bd7..4269243 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobManagerRunner.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/jobmaster/JobManagerRunner.java
@@ -225,10 +225,10 @@
 
 				jobManager.shutDown();
 
-				final CompletableFuture<Boolean> jobManagerTerminationFuture = jobManager.getTerminationFuture();
+				final CompletableFuture<Void> jobManagerTerminationFuture = jobManager.getTerminationFuture();
 
 				jobManagerTerminationFuture.whenComplete(
-					(Boolean ignored, Throwable throwable) -> {
+					(Void ignored, Throwable throwable) -> {
 						try {
 							leaderElectionService.stop();
 						} catch (Throwable t) {
