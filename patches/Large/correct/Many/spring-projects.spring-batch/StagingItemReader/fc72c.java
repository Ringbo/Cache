diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/StagingItemReader.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/StagingItemReader.java
index d6258bf..5462fb8 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/StagingItemReader.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/StagingItemReader.java
@@ -29,7 +29,7 @@
  * Thread-safe database {@link ItemReader} implementing the process indicator
  * pattern.
  */
-public class StagingItemReader extends JdbcDaoSupport implements ItemStream, ItemReader, StepExecutionListener {
+public class StagingItemReader<T> extends JdbcDaoSupport implements ItemStream, ItemReader<T>, StepExecutionListener {
 
 	// Key for buffer in transaction synchronization manager
 	private static final String BUFFER_KEY = StagingItemReader.class.getName() + ".BUFFER";
@@ -106,13 +106,14 @@
 
 	}
 
-	public Object read() throws Exception {
+	@SuppressWarnings("unchecked")
+	public T read() throws Exception {
 		Long id = doRead();
 
 		if (id == null) {
 			return null;
 		}
-		Object result = getJdbcTemplate().queryForObject("SELECT VALUE FROM BATCH_STAGING WHERE ID=?",
+		T result = (T) getJdbcTemplate().queryForObject("SELECT VALUE FROM BATCH_STAGING WHERE ID=?",
 				new Object[] { id }, new RowMapper() {
 					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
 						byte[] blob = lobHandler.getBlobAsBytes(rs, 1);
