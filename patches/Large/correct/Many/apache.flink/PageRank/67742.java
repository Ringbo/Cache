diff --git a/flink-examples/flink-examples-batch/src/main/java/org/apache/flink/examples/java/graph/PageRank.java b/flink-examples/flink-examples-batch/src/main/java/org/apache/flink/examples/java/graph/PageRank.java
index f8a5c83..c613a7e 100644
--- a/flink-examples/flink-examples-batch/src/main/java/org/apache/flink/examples/java/graph/PageRank.java
+++ b/flink-examples/flink-examples-batch/src/main/java/org/apache/flink/examples/java/graph/PageRank.java
@@ -85,7 +85,7 @@
 		ParameterTool params = ParameterTool.fromArgs(args);
 		System.out.println("Usage: PageRankBasic --pages <path> --links <path> --output <path> --numPages <n> --iterations <n>");
 
-		final int numPages = params.getInt("numPages");
+		final int numPages = params.getInt("numPages", PageRankData.getNumberOfPages());
 		final int maxIterations = params.getInt("iterations", 10);
 		
 		// set up execution environment
