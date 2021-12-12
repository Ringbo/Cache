diff --git a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamContextEnvironment.java b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamContextEnvironment.java
index 010628f..c0216e5 100644
--- a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamContextEnvironment.java
+++ b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/environment/StreamContextEnvironment.java
@@ -48,7 +48,7 @@
 
 	@Override
 	public JobExecutionResult execute(String jobName) throws Exception {
-		Preconditions.checkNotNull("Streaming Job name should not be null.");
+		Preconditions.checkNotNull(jobName, "Streaming Job name should not be null.");
 
 		StreamGraph streamGraph = this.getStreamGraph();
 		streamGraph.setJobName(jobName);
