diff --git a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
index 9555c8f..f47cf70 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/impl/model/jdbc/AbstractJDBCDataModel.java
@@ -557,7 +557,10 @@
     private ResultSetUserIterator(DataSource dataSource, String getUsersSQL) throws TasteException {
       try {
         connection = dataSource.getConnection();
-        statement = connection.prepareStatement(getUsersSQL);
+        // These settings should enable the ResultSet to be iterated in both directions
+        statement = connection.prepareStatement(getUsersSQL,
+                                                ResultSet.TYPE_SCROLL_INSENSITIVE,
+                                                ResultSet.CONCUR_READ_ONLY);
         statement.setFetchDirection(ResultSet.FETCH_UNKNOWN);
         log.debug("Executing SQL query: {}", getUsersSQL);
         resultSet = statement.executeQuery();
