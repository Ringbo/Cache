diff --git a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/JoinedStreams.java b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/JoinedStreams.java
index c005310..ed1cbd7 100644
--- a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/JoinedStreams.java
+++ b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/datastream/JoinedStreams.java
@@ -306,7 +306,7 @@
 		public <T> DataStream<T> apply(FlatJoinFunction<T1, T2, T> function) {
 			TypeInformation<T> resultType = TypeExtractor.getBinaryOperatorReturnType(
 					function,
-					JoinFunction.class,
+					FlatJoinFunction.class,
 					true,
 					true,
 					input1.getType(),
