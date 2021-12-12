diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/DoubleType.java b/liquibase-core/src/main/java/liquibase/datatype/core/DoubleType.java
index 2ab0cde..c12df91 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/DoubleType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/DoubleType.java
@@ -13,7 +13,7 @@
         if (database instanceof MSSQLDatabase) {
             return new DatabaseDataType("FLOAT");
         }
-        if (database instanceof DB2Database || database instanceof DerbyDatabase || database instanceof HsqlDatabase) {
+        if (database instanceof DB2Database || database instanceof DerbyDatabase || database instanceof HsqlDatabase || database instanceof MySQLDatabase) {
             return new DatabaseDataType("DOUBLE");
         }
         if (database instanceof OracleDatabase) {
