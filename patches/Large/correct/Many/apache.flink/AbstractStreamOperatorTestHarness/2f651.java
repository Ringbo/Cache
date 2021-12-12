diff --git a/flink-streaming-java/src/test/java/org/apache/flink/streaming/util/AbstractStreamOperatorTestHarness.java b/flink-streaming-java/src/test/java/org/apache/flink/streaming/util/AbstractStreamOperatorTestHarness.java
index 793e8f6..3d1b6fd 100644
--- a/flink-streaming-java/src/test/java/org/apache/flink/streaming/util/AbstractStreamOperatorTestHarness.java
+++ b/flink-streaming-java/src/test/java/org/apache/flink/streaming/util/AbstractStreamOperatorTestHarness.java
@@ -120,7 +120,7 @@
 	public AbstractStreamOperatorTestHarness(
 		StreamOperator<OUT> operator,
 		int maxParallelism,
-		int numSubtasks,
+		int parallelism,
 		int subtaskIndex) throws Exception {
 
 		this(
@@ -133,7 +133,7 @@
 				new Configuration(),
 				new ExecutionConfig(),
 				maxParallelism,
-				numSubtasks,
+				parallelism,
 				subtaskIndex));
 	}
 
