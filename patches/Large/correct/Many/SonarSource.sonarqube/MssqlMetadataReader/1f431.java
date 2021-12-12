diff --git a/server/sonar-db-migration/src/main/java/org/sonar/server/platform/db/migration/charset/MssqlMetadataReader.java b/server/sonar-db-migration/src/main/java/org/sonar/server/platform/db/migration/charset/MssqlMetadataReader.java
index adbd16a..5233c14 100644
--- a/server/sonar-db-migration/src/main/java/org/sonar/server/platform/db/migration/charset/MssqlMetadataReader.java
+++ b/server/sonar-db-migration/src/main/java/org/sonar/server/platform/db/migration/charset/MssqlMetadataReader.java
@@ -25,18 +25,18 @@
 
 import static java.lang.String.format;
 
-public class MssqlMetadataReader {
+class MssqlMetadataReader {
   private final SqlExecutor sqlExecutor;
 
-  public MssqlMetadataReader(SqlExecutor sqlExecutor) {
+  MssqlMetadataReader(SqlExecutor sqlExecutor) {
     this.sqlExecutor = sqlExecutor;
   }
 
-  public String getDefaultCollation(Connection connection) throws SQLException {
+  String getDefaultCollation(Connection connection) throws SQLException {
     return sqlExecutor.selectSingleString(connection, "SELECT CONVERT(VARCHAR(128), DATABASEPROPERTYEX(DB_NAME(), 'Collation'))");
   }
 
-  public List<ColumnDef> getColumnDefs(Connection connection) throws SQLException {
+  List<ColumnDef> getColumnDefs(Connection connection) throws SQLException {
     return sqlExecutor.select(connection,
       ColumnDef.SELECT_COLUMNS +
         "FROM [INFORMATION_SCHEMA].[COLUMNS] " +
@@ -45,7 +45,7 @@
       ColumnDef.ColumnDefRowConverter.INSTANCE);
   }
 
-  public List<MssqlCharsetHandler.ColumnIndex> getColumnIndices(Connection connection, ColumnDef column) throws SQLException {
+  List<MssqlCharsetHandler.ColumnIndex> getColumnIndices(Connection connection, ColumnDef column) throws SQLException {
     String selectIndicesSql = format("SELECT I.name as index_name, I.is_unique as unik, IndexedColumns " +
       "     FROM sys.indexes I " +
       "     JOIN sys.tables T ON T.Object_id = I.Object_id " +
