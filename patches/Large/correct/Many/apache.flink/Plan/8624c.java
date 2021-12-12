diff --git a/flink-core/src/main/java/org/apache/flink/api/common/Plan.java b/flink-core/src/main/java/org/apache/flink/api/common/Plan.java
index 0235af0..db10ce4 100644
--- a/flink-core/src/main/java/org/apache/flink/api/common/Plan.java
+++ b/flink-core/src/main/java/org/apache/flink/api/common/Plan.java
@@ -201,7 +201,7 @@
 	 * @param sink The data sink to add.
 	 */
 	public void addDataSink(GenericDataSinkBase<?> sink) {
-		checkNotNull(jobName, "The data sink must not be null.");
+		checkNotNull(sink, "The data sink must not be null.");
 		
 		if (!this.sinks.contains(sink)) {
 			this.sinks.add(sink);
