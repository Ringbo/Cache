diff --git a/flink-batch-connectors/flink-jdbc/src/main/java/org/apache/flink/api/java/io/jdbc/JDBCOutputFormat.java b/flink-batch-connectors/flink-jdbc/src/main/java/org/apache/flink/api/java/io/jdbc/JDBCOutputFormat.java
index 5464a94..da4b1ad 100644
--- a/flink-batch-connectors/flink-jdbc/src/main/java/org/apache/flink/api/java/io/jdbc/JDBCOutputFormat.java
+++ b/flink-batch-connectors/flink-jdbc/src/main/java/org/apache/flink/api/java/io/jdbc/JDBCOutputFormat.java
@@ -108,7 +108,7 @@
 	@Override
 	public void writeRecord(Row row) throws IOException {
 
-		if (typesArray != null && typesArray.length > 0 && typesArray.length == row.productArity()) {
+		if (typesArray != null && typesArray.length > 0 && typesArray.length != row.productArity()) {
 			LOG.warn("Column SQL types array doesn't match arity of passed Row! Check the passed array...");
 		} 
 		try {
