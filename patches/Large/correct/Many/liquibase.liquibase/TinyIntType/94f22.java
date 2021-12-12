diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/TinyIntType.java b/liquibase-core/src/main/java/liquibase/datatype/core/TinyIntType.java
index d015b8b..6e984d8 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/TinyIntType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/TinyIntType.java
@@ -26,7 +26,8 @@
         if (database instanceof MSSQLDatabase) {
             return new DatabaseDataType(database.escapeDataTypeName("tinyint"));
         }
-        if (database instanceof DerbyDatabase || database instanceof PostgresDatabase || database instanceof FirebirdDatabase) {
+        if (database instanceof DerbyDatabase || database instanceof PostgresDatabase || database instanceof FirebirdDatabase
+                || database instanceof DB2Database) {
             return new DatabaseDataType("SMALLINT");
         }
         if (database instanceof MySQLDatabase) {
