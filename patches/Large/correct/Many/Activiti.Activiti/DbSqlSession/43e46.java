diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSession.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSession.java
index f0aabd9..0b06f01 100755
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSession.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/db/DbSqlSession.java
@@ -1067,12 +1067,12 @@
       ResultSet tables = null;
 
       String catalog = this.connectionMetadataDefaultCatalog;
-      if (dbSqlSessionFactory.getDatabaseCatalog() != null) {
+      if (dbSqlSessionFactory.getDatabaseCatalog() != null && dbSqlSessionFactory.getDatabaseCatalog().length() > 0) {
         catalog = dbSqlSessionFactory.getDatabaseCatalog();
       }
 
       String schema = this.connectionMetadataDefaultSchema;
-      if (dbSqlSessionFactory.getDatabaseSchema()!=null) {
+      if (dbSqlSessionFactory.getDatabaseSchema() != null && dbSqlSessionFactory.getDatabaseSchema().length() > 0) {
         schema = dbSqlSessionFactory.getDatabaseSchema();
       }
       
