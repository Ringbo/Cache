diff --git a/flink-addons/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/datastream/DataStream.java b/flink-addons/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/datastream/DataStream.java
index 7cab2df..86b3322 100644
--- a/flink-addons/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/datastream/DataStream.java
+++ b/flink-addons/flink-streaming/flink-streaming-core/src/main/java/org/apache/flink/streaming/api/datastream/DataStream.java
@@ -353,10 +353,10 @@
 	 * 
 	 * @return The closed DataStream.
 	 */
-	public DataStream<OUT> print() {
+	public DataStreamSink<OUT> print() {
 		DataStream<OUT> inputStream = this.copy();
 		PrintSinkFunction<OUT> printFunction = new PrintSinkFunction<OUT>();
-		DataStream<OUT> returnStream = addSink(inputStream, printFunction, null);
+		DataStreamSink<OUT> returnStream = addSink(inputStream, printFunction, null);
 
 		jobGraphBuilder.setBytesFrom(inputStream.getId(), returnStream.getId());
 
@@ -373,7 +373,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsText(String path) {
+	public DataStreamSink<OUT> writeAsText(String path) {
 		return writeAsText(this, path, new WriteFormatAsText<OUT>(), 1, null);
 	}
 
@@ -390,7 +390,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsText(String path, long millis) {
+	public DataStreamSink<OUT> writeAsText(String path, long millis) {
 		return writeAsText(this, path, new WriteFormatAsText<OUT>(), millis, null);
 	}
 
@@ -408,7 +408,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsText(String path, int batchSize) {
+	public DataStreamSink<OUT> writeAsText(String path, int batchSize) {
 		return writeAsText(this, path, new WriteFormatAsText<OUT>(), batchSize, null);
 	}
 
@@ -430,7 +430,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsText(String path, long millis, OUT endTuple) {
+	public DataStreamSink<OUT> writeAsText(String path, long millis, OUT endTuple) {
 		return writeAsText(this, path, new WriteFormatAsText<OUT>(), millis, endTuple);
 	}
 
@@ -453,7 +453,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsText(String path, int batchSize, OUT endTuple) {
+	public DataStreamSink<OUT> writeAsText(String path, int batchSize, OUT endTuple) {
 		return writeAsText(this, path, new WriteFormatAsText<OUT>(), batchSize, endTuple);
 	}
 
@@ -475,9 +475,9 @@
 	 * 
 	 * @return the data stream constructed
 	 */
-	private DataStream<OUT> writeAsText(DataStream<OUT> inputStream, String path,
+	private DataStreamSink<OUT> writeAsText(DataStream<OUT> inputStream, String path,
 			WriteFormatAsText<OUT> format, long millis, OUT endTuple) {
-		DataStream<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByMillis<OUT>(
+		DataStreamSink<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByMillis<OUT>(
 				path, format, millis, endTuple), null);
 		jobGraphBuilder.setBytesFrom(inputStream.getId(), returnStream.getId());
 		jobGraphBuilder.setMutability(returnStream.getId(), false);
@@ -503,9 +503,9 @@
 	 * 
 	 * @return the data stream constructed
 	 */
-	private DataStream<OUT> writeAsText(DataStream<OUT> inputStream, String path,
+	private DataStreamSink<OUT> writeAsText(DataStream<OUT> inputStream, String path,
 			WriteFormatAsText<OUT> format, int batchSize, OUT endTuple) {
-		DataStream<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByBatches<OUT>(
+		DataStreamSink<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByBatches<OUT>(
 				path, format, batchSize, endTuple), null);
 		jobGraphBuilder.setBytesFrom(inputStream.getId(), returnStream.getId());
 		jobGraphBuilder.setMutability(returnStream.getId(), false);
@@ -522,7 +522,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsCsv(String path) {
+	public DataStreamSink<OUT> writeAsCsv(String path) {
 		return writeAsCsv(this, path, new WriteFormatAsCsv<OUT>(), 1, null);
 	}
 
@@ -539,7 +539,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsCsv(String path, long millis) {
+	public DataStreamSink<OUT> writeAsCsv(String path, long millis) {
 		return writeAsCsv(this, path, new WriteFormatAsCsv<OUT>(), millis, null);
 	}
 
@@ -557,7 +557,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsCsv(String path, int batchSize) {
+	public DataStreamSink<OUT> writeAsCsv(String path, int batchSize) {
 		return writeAsCsv(this, path, new WriteFormatAsCsv<OUT>(), batchSize, null);
 	}
 
@@ -579,7 +579,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsCsv(String path, long millis, OUT endTuple) {
+	public DataStreamSink<OUT> writeAsCsv(String path, long millis, OUT endTuple) {
 		return writeAsCsv(this, path, new WriteFormatAsCsv<OUT>(), millis, endTuple);
 	}
 
@@ -602,7 +602,7 @@
 	 * 
 	 * @return The closed DataStream
 	 */
-	public DataStream<OUT> writeAsCsv(String path, int batchSize, OUT endTuple) {
+	public DataStreamSink<OUT> writeAsCsv(String path, int batchSize, OUT endTuple) {
 		if (this instanceof SingleOutputStreamOperator) {
 			((SingleOutputStreamOperator<?, ?>) this).setMutability(false);
 		}
@@ -627,9 +627,9 @@
 	 * 
 	 * @return the data stream constructed
 	 */
-	private DataStream<OUT> writeAsCsv(DataStream<OUT> inputStream, String path,
+	private DataStreamSink<OUT> writeAsCsv(DataStream<OUT> inputStream, String path,
 			WriteFormatAsCsv<OUT> format, long millis, OUT endTuple) {
-		DataStream<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByMillis<OUT>(
+		DataStreamSink<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByMillis<OUT>(
 				path, format, millis, endTuple));
 		jobGraphBuilder.setBytesFrom(inputStream.getId(), returnStream.getId());
 		jobGraphBuilder.setMutability(returnStream.getId(), false);
@@ -655,9 +655,9 @@
 	 * 
 	 * @return the data stream constructed
 	 */
-	private DataStream<OUT> writeAsCsv(DataStream<OUT> inputStream, String path,
+	private DataStreamSink<OUT> writeAsCsv(DataStream<OUT> inputStream, String path,
 			WriteFormatAsCsv<OUT> format, int batchSize, OUT endTuple) {
-		DataStream<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByBatches<OUT>(
+		DataStreamSink<OUT> returnStream = addSink(inputStream, new WriteSinkFunctionByBatches<OUT>(
 				path, format, batchSize, endTuple), null);
 		jobGraphBuilder.setBytesFrom(inputStream.getId(), returnStream.getId());
 		jobGraphBuilder.setMutability(returnStream.getId(), false);
@@ -792,18 +792,18 @@
 	 *            The object containing the sink's invoke function.
 	 * @return The closed DataStream.
 	 */
-	public DataStream<OUT> addSink(SinkFunction<OUT> sinkFunction) {
+	public DataStreamSink<OUT> addSink(SinkFunction<OUT> sinkFunction) {
 		return addSink(this.copy(), sinkFunction);
 	}
 
-	private DataStream<OUT> addSink(DataStream<OUT> inputStream, SinkFunction<OUT> sinkFunction) {
+	private DataStreamSink<OUT> addSink(DataStream<OUT> inputStream, SinkFunction<OUT> sinkFunction) {
 		return addSink(inputStream, sinkFunction, new FunctionTypeWrapper<OUT, Tuple, OUT>(
 				sinkFunction, SinkFunction.class, 0, -1, 0));
 	}
 
-	private DataStream<OUT> addSink(DataStream<OUT> inputStream, SinkFunction<OUT> sinkFunction,
+	private DataStreamSink<OUT> addSink(DataStream<OUT> inputStream, SinkFunction<OUT> sinkFunction,
 			TypeSerializerWrapper<OUT, Tuple, OUT> typeWrapper) {
-		DataStream<OUT> returnStream = new DataStreamSink<OUT>(environment, "sink");
+		DataStreamSink<OUT> returnStream = new DataStreamSink<OUT>(environment, "sink");
 
 		try {
 			jobGraphBuilder.addSink(returnStream.getId(), new SinkInvokable<OUT>(sinkFunction),
