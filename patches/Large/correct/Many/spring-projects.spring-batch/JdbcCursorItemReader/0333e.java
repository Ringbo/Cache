diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/io/cursor/JdbcCursorItemReader.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/io/cursor/JdbcCursorItemReader.java
index 32f55fc..ea1cff4 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/io/cursor/JdbcCursorItemReader.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/io/cursor/JdbcCursorItemReader.java
@@ -399,7 +399,7 @@
 	 * @see org.springframework.batch.item.stream.ItemStreamAdapter#restoreFrom(org.springframework.batch.item.ExecutionContext)
 	 */
 	public void open(ExecutionContext context) {
-		Assert.state(!initialized);
+		Assert.state(!initialized, "Stream is already initialized.  Close before re-opening.");
 		Assert.isNull(rs);
 		Assert.notNull(context, "ExecutionContext must not be null");
 		executeQuery();
