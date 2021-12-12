diff --git a/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/JDBCStream.java b/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/JDBCStream.java
index f57beac..9763809 100644
--- a/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/JDBCStream.java
+++ b/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/JDBCStream.java
@@ -223,7 +223,7 @@
     for(int columnIdx = 0; columnIdx < metadata.getColumnCount(); ++columnIdx){
       
       final int columnNumber = columnIdx + 1; // cause it starts at 1        
-      final String columnName = metadata.getColumnName(columnNumber);
+      final String columnName = metadata.getColumnLabel(columnNumber);
       String className = metadata.getColumnClassName(columnNumber);
       String typeName = metadata.getColumnTypeName(columnNumber);
             
@@ -239,7 +239,7 @@
           }
         };
       }
-      else if(Short.class.getName() == className){
+      else if(Short.class.getName().equals(className)) {
         valueSelectors[columnIdx] = new ResultSetValueSelector() {
           public Object selectValue(ResultSet resultSet) throws SQLException {
             Short obj = resultSet.getShort(columnNumber);
@@ -251,7 +251,7 @@
           }
         };
       }
-      else if(Integer.class.getName() == className){
+      else if(Integer.class.getName().equals(className)) {
         valueSelectors[columnIdx] = new ResultSetValueSelector() {
           public Object selectValue(ResultSet resultSet) throws SQLException {
             Integer obj = resultSet.getInt(columnNumber);
@@ -263,7 +263,7 @@
           }
         };
       }
-      else if(Float.class.getName() == className){
+      else if(Float.class.getName().equals(className)) {
         valueSelectors[columnIdx] = new ResultSetValueSelector() {
           public Object selectValue(ResultSet resultSet) throws SQLException {
             Float obj = resultSet.getFloat(columnNumber);
