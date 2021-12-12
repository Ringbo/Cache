diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/ModifyDataTypeGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/ModifyDataTypeGenerator.java
index 164cbea..f816d91 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/ModifyDataTypeGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/ModifyDataTypeGenerator.java
@@ -95,7 +95,7 @@
      */
     protected String getPreDataTypeString(Database database) {
         if (database instanceof DerbyDatabase
-                || database instanceof DB2Database) {
+                || database instanceof AbstractDb2Database) {
             return " SET DATA TYPE ";
         } else if (database instanceof SybaseASADatabase
                 || database instanceof SybaseDatabase
