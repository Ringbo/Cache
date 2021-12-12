diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/entrypoint/ClusterEntrypoint.java b/flink-runtime/src/main/java/org/apache/flink/runtime/entrypoint/ClusterEntrypoint.java
index f347d05..8e4f936 100755
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/entrypoint/ClusterEntrypoint.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/entrypoint/ClusterEntrypoint.java
@@ -213,7 +213,7 @@
 
 			// TODO: Make shutDownAndTerminate non blocking to not use the global executor
 			dispatcher.getTerminationFuture().whenCompleteAsync(
-				(Boolean success, Throwable throwable) -> {
+				(Void value, Throwable throwable) -> {
 					if (throwable != null) {
 						LOG.info("Could not properly terminate the Dispatcher.", throwable);
 					}
