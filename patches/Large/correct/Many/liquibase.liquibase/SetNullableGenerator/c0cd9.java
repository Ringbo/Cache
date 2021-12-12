diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/SetNullableGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/SetNullableGenerator.java
index ad00200..7c25ab5 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/SetNullableGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/SetNullableGenerator.java
@@ -37,7 +37,7 @@
         }
 
         try {
-            if ((database instanceof DB2Database) && (database.getDatabaseMajorVersion() >= 9)) {
+            if ((database instanceof DB2Database) && (database.getDatabaseMajorVersion() < 9)) {
                 validationErrors.addError("DB2 versions less than 9 do not support modifying null constraints");
             }
         } catch (DatabaseException ignore) {
