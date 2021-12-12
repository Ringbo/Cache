diff --git a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/AddColumnGenerator.java b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/AddColumnGenerator.java
index 0566a33..163f89e 100644
--- a/liquibase-core/src/main/java/liquibase/sqlgenerator/core/AddColumnGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/sqlgenerator/core/AddColumnGenerator.java
@@ -96,7 +96,7 @@
                 String refTableName = referencesMatcher.group(1);
                 if (refTableName.indexOf(".") > 0) {
                     refSchemaName = refTableName.split("\\.")[0];
-                    refTableName = refTableName.split("\\.")[0];
+                    refTableName = refTableName.split("\\.")[1];
                 }
                 String refColName = referencesMatcher.group(2);
 
