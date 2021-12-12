diff --git a/flink-end-to-end-tests/flink-stream-sql-test/src/main/java/org/apache/flink/sql/tests/StreamSQLTestProgram.java b/flink-end-to-end-tests/flink-stream-sql-test/src/main/java/org/apache/flink/sql/tests/StreamSQLTestProgram.java
index 91fb4c1..e9e79ac 100644
--- a/flink-end-to-end-tests/flink-stream-sql-test/src/main/java/org/apache/flink/sql/tests/StreamSQLTestProgram.java
+++ b/flink-end-to-end-tests/flink-stream-sql-test/src/main/java/org/apache/flink/sql/tests/StreamSQLTestProgram.java
@@ -58,7 +58,7 @@
  *
  * <p>The stream is bounded and will complete after about a minute.
  * The result is always constant.
- * The job is killed on the first attemped and restarted.
+ * The job is killed on the first attempt and restarted.
  *
  * <p>Parameters:
  * -outputPath Sets the path to where the result data is written.
@@ -249,12 +249,12 @@
 		}
 
 		@Override
-		public List<Long> snapshotState(long checkpointId, long timestamp) throws Exception {
+		public List<Long> snapshotState(long checkpointId, long timestamp) {
 			return Collections.singletonList(ms);
 		}
 
 		@Override
-		public void restoreState(List<Long> state) throws Exception {
+		public void restoreState(List<Long> state) {
 			for (Long l : state) {
 				ms += l;
 			}
@@ -272,7 +272,7 @@
 		private int lostRecordCnt = 0;
 
 		@Override
-		public Row map(Row value) throws Exception {
+		public Row map(Row value) {
 
 			// the both counts are the same only in the first execution attempt
 			if (saveRecordCnt == 1 && lostRecordCnt == 1) {
@@ -294,12 +294,12 @@
 		}
 
 		@Override
-		public List<Integer> snapshotState(long checkpointId, long timestamp) throws Exception {
+		public List<Integer> snapshotState(long checkpointId, long timestamp) {
 			return Collections.singletonList(saveRecordCnt);
 		}
 
 		@Override
-		public void restoreState(List<Integer> state) throws Exception {
+		public void restoreState(List<Integer> state) {
 			for (Integer i : state) {
 				saveRecordCnt += i;
 			}
