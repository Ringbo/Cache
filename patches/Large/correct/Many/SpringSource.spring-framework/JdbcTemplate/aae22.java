diff --git a/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java b/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
index 73783db..6190090 100644
--- a/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
+++ b/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcTemplate.java
@@ -111,22 +111,22 @@
 	private boolean ignoreWarnings = true;
 
 	/**
-	 * If this variable is set to a non-zero value, it will be used for setting the
+	 * If this variable is set to a non-negative value, it will be used for setting the
 	 * fetchSize property on statements used for query processing.
 	 */
-	private int fetchSize = 0;
+	private int fetchSize = -1;
 
 	/**
-	 * If this variable is set to a non-zero value, it will be used for setting the
+	 * If this variable is set to a non-negative value, it will be used for setting the
 	 * maxRows property on statements used for query processing.
 	 */
-	private int maxRows = 0;
+	private int maxRows = -1;
 
 	/**
-	 * If this variable is set to a non-zero value, it will be used for setting the
+	 * If this variable is set to a non-negative value, it will be used for setting the
 	 * queryTimeout property on statements used for query processing.
 	 */
-	private int queryTimeout = 0;
+	private int queryTimeout = -1;
 
 	/**
 	 * If this variable is set to true then all results checking will be bypassed for any
@@ -224,7 +224,8 @@
 	 * large result sets: Setting this higher than the default value will increase
 	 * processing speed at the cost of memory consumption; setting this lower can
 	 * avoid transferring row data that will never be read by the application.
-	 * <p>Default is 0, indicating to use the JDBC driver's default.
+	 * <p>Default is -1, indicating to use the JDBC driver's default
+	 * (i.e. to not pass a specific fetch size setting on the driver).
 	 * @see java.sql.Statement#setFetchSize
 	 */
 	public void setFetchSize(int fetchSize) {
@@ -244,7 +245,8 @@
 	 * the entire result set in the database or in the JDBC driver if we're
 	 * never interested in the entire result in the first place (for example,
 	 * when performing searches that might return a large number of matches).
-	 * <p>Default is 0, indicating to use the JDBC driver's default.
+	 * <p>Default is -1, indicating to use the JDBC driver's default
+	 * (i.e. to not pass a specific max rows setting on the driver).
 	 * @see java.sql.Statement#setMaxRows
 	 */
 	public void setMaxRows(int maxRows) {
@@ -260,7 +262,8 @@
 
 	/**
 	 * Set the query timeout for statements that this JdbcTemplate executes.
-	 * <p>Default is 0, indicating to use the JDBC driver's default.
+	 * <p>Default is -1, indicating to use the JDBC driver's default
+	 * (i.e. to not pass a specific query timeout setting on the driver).
 	 * <p>Note: Any timeout specified here will be overridden by the remaining
 	 * transaction timeout when executing within a transaction that has a
 	 * timeout specified at the transaction level.
@@ -1386,11 +1389,11 @@
 	 */
 	protected void applyStatementSettings(Statement stmt) throws SQLException {
 		int fetchSize = getFetchSize();
-		if (fetchSize > 0) {
+		if (fetchSize >= 0) {
 			stmt.setFetchSize(fetchSize);
 		}
 		int maxRows = getMaxRows();
-		if (maxRows > 0) {
+		if (maxRows >= 0) {
 			stmt.setMaxRows(maxRows);
 		}
 		DataSourceUtils.applyTimeout(stmt, getDataSource(), getQueryTimeout());
