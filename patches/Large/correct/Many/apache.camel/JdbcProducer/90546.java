diff --git a/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/JdbcProducer.java b/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/JdbcProducer.java
index d78e9c7..13ecade 100644
--- a/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/JdbcProducer.java
+++ b/components/camel-jdbc/src/main/java/org/apache/camel/component/jdbc/JdbcProducer.java
@@ -163,7 +163,7 @@
             boolean stmtExecutionResult = ps.execute();
             if (stmtExecutionResult) {
                 rs = ps.getResultSet();
-                shouldCloseResources = setResultSet(exchange, rs);
+                shouldCloseResources = setResultSet(exchange, conn, rs);
             } else {
                 int updateCount = ps.getUpdateCount();
                 // preserve headers
@@ -173,7 +173,7 @@
             }
 
             if (shouldRetrieveGeneratedKeys) {
-                setGeneratedKeys(exchange, ps.getGeneratedKeys());
+                setGeneratedKeys(exchange, conn, ps.getGeneratedKeys());
             }
         } finally {
             if (shouldCloseResources) {
@@ -219,7 +219,7 @@
 
             if (stmtExecutionResult) {
                 rs = stmt.getResultSet();
-                shouldCloseResources = setResultSet(exchange, rs);
+                shouldCloseResources = setResultSet(exchange, conn, rs);
             } else {
                 int updateCount = stmt.getUpdateCount();
                 // preserve headers
@@ -229,7 +229,7 @@
             }
 
             if (shouldRetrieveGeneratedKeys) {
-                setGeneratedKeys(exchange, stmt.getGeneratedKeys());
+                setGeneratedKeys(exchange, conn, stmt.getGeneratedKeys());
             }
         } finally {
             if (shouldCloseResources) {
@@ -286,11 +286,12 @@
      * - {@link JdbcConstants#JDBC_GENERATED_KEYS_DATA} : the generated keys data
      *
      * @param exchange The exchange where to store the generated keys
+     * @param conn          Current JDBC connection
      * @param generatedKeys The result set containing the generated keys
      */
-    protected void setGeneratedKeys(Exchange exchange, ResultSet generatedKeys) throws SQLException {
+    protected void setGeneratedKeys(Exchange exchange, Connection conn, ResultSet generatedKeys) throws SQLException {
         if (generatedKeys != null) {
-            ResultSetIterator iterator = new ResultSetIterator(generatedKeys, getEndpoint().isUseJDBC4ColumnNameAndLabelSemantics());
+            ResultSetIterator iterator = new ResultSetIterator(conn, generatedKeys, getEndpoint().isUseJDBC4ColumnNameAndLabelSemantics());
             List<Map<String, Object>> data = extractRows(iterator);
 
             exchange.getOut().setHeader(JdbcConstants.JDBC_GENERATED_KEYS_ROW_COUNT, data.size());
@@ -303,10 +304,10 @@
      *
      * @return whether to close resources
      */
-    protected boolean setResultSet(Exchange exchange, ResultSet rs) throws SQLException {
+    protected boolean setResultSet(Exchange exchange, Connection conn, ResultSet rs) throws SQLException {
         boolean answer = true;
 
-        ResultSetIterator iterator = new ResultSetIterator(rs, getEndpoint().isUseJDBC4ColumnNameAndLabelSemantics());
+        ResultSetIterator iterator = new ResultSetIterator(conn, rs, getEndpoint().isUseJDBC4ColumnNameAndLabelSemantics());
 
         // preserve headers
         exchange.getOut().getHeaders().putAll(exchange.getIn().getHeaders());
