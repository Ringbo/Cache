diff --git a/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java b/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
index 4e37a3f..81d4d02 100644
--- a/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
+++ b/liquibase-core/src/main/java/liquibase/database/core/MSSQLDatabase.java
@@ -175,7 +175,7 @@
         boolean isRealSqlServerConnection = PRODUCT_NAME.equalsIgnoreCase(databaseProductName)
                 || "SQLOLEDB".equalsIgnoreCase(databaseProductName);
 
-        if (isRealSqlServerConnection && (majorVersion <= MSSQL_SERVER_VERSIONS.MSSQL2008)) {
+        if (isRealSqlServerConnection && (majorVersion < MSSQL_SERVER_VERSIONS.MSSQL2008)) {
             LogService.getLog(getClass()).warning(
                 LogType.LOG, String.format("Your SQL Server major version (%d) seems to indicate that your " +
                         "software is older than SQL Server 2008. Unfortunately, this is not supported, and this " +
