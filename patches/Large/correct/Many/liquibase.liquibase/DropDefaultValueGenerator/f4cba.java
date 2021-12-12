diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
index d4383dd..4eac720 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/DropDefaultValueGenerator.java
@@ -70,7 +70,7 @@
             sql = "ALTER TABLE " + escapedTableName + " ALTER " + database.escapeColumnName(statement.getCatalogName(), statement.getSchemaName(), statement.getTableName(), statement.getColumnName()) + " DROP DEFAULT";
         } else if (database instanceof OracleDatabase) {
             sql = "ALTER TABLE " + escapedTableName + " MODIFY " + database.escapeColumnName(statement.getCatalogName(), statement.getSchemaName(), statement.getTableName(), statement.getColumnName()) + " DEFAULT NULL";
-        } else if (database instanceof SybaseASADatabase) {
+        } else if (database instanceof SybaseASADatabase || database instanceof SybaseDatabase) {
              sql = "ALTER TABLE " + escapedTableName + " REPLACE " + database.escapeColumnName(statement.getCatalogName(), statement.getSchemaName(), statement.getTableName(), statement.getColumnName()) + " DEFAULT NULL";
         } else if (database instanceof DerbyDatabase) {
             sql = "ALTER TABLE " + escapedTableName + " ALTER COLUMN  " + database.escapeColumnName(statement.getCatalogName(), statement.getSchemaName(), statement.getTableName(), statement.getColumnName()) + " WITH DEFAULT NULL";
