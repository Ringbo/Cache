diff --git a/flink-staging/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/graph/StreamGraph.java b/flink-staging/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/graph/StreamGraph.java
index 593b476..ffc7032 100644
--- a/flink-staging/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/graph/StreamGraph.java
+++ b/flink-staging/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/graph/StreamGraph.java
@@ -196,7 +196,7 @@
 
 		chaining = false;
 
-		StreamLoop iteration = new StreamLoop(iterationID, getStreamNode(iterationHead), timeOut);
+		StreamLoop iteration = new StreamLoop(iterationID, getStreamNode(vertexID), timeOut);
 		streamLoops.put(iterationID, iteration);
 		vertexIDtoLoop.put(vertexID, iteration);
 
