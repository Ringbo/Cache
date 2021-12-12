diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java b/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
index fdd26a7..02cf7e0 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/TimestampType.java
@@ -118,7 +118,7 @@
         }
 
         if (((getAdditionalInformation() != null) && ((database instanceof PostgresDatabase) || (database instanceof
-            OracleDatabase))) || (database instanceof HsqlDatabase)){
+            OracleDatabase))) || (database instanceof HsqlDatabase) || (database instanceof H2Database)){
             String additionalInformation = this.getAdditionalInformation();
 
             if ((additionalInformation != null) && (database instanceof PostgresDatabase)) {
