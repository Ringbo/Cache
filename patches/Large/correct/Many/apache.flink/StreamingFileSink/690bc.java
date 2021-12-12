diff --git a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/filesystem/StreamingFileSink.java b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/filesystem/StreamingFileSink.java
index b6fff03..0406afc 100644
--- a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/filesystem/StreamingFileSink.java
+++ b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/functions/sink/filesystem/StreamingFileSink.java
@@ -332,7 +332,7 @@
 		final int subtaskIndex = getRuntimeContext().getIndexOfThisSubtask();
 
 		// setting the values in the bucketer context
-		bucketerContext.update(context.timestamp(), currentProcessingTime, context.currentWatermark());
+		bucketerContext.update(context.timestamp(), context.currentWatermark(), currentProcessingTime);
 
 		final String bucketId = bucketer.getBucketId(value, bucketerContext);
 
