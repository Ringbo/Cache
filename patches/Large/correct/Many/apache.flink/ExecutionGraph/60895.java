diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ExecutionGraph.java b/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ExecutionGraph.java
index 1c7b1c8..0564fd0 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ExecutionGraph.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/executiongraph/ExecutionGraph.java
@@ -1090,11 +1090,10 @@
 
 	/**
 	 * For testing: This waits until the job execution has finished.
-	 * @throws InterruptedException
 	 */
 	public void waitUntilFinished() throws InterruptedException {
 		synchronized (progressLock) {
-			while (!state.isGloballyTerminalState()) {
+			while (!state.isTerminalState()) {
 				progressLock.wait();
 			}
 		}
