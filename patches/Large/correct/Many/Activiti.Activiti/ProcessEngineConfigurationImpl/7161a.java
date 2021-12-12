diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cfg/ProcessEngineConfigurationImpl.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cfg/ProcessEngineConfigurationImpl.java
index 6335125..7604803 100755
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cfg/ProcessEngineConfigurationImpl.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/cfg/ProcessEngineConfigurationImpl.java
@@ -1209,7 +1209,7 @@
 
       // Special care for MSSQL, as it has a hard limit of 2000 params per statement (incl bulk statement).
       // Especially with executions, with 100 as default, this limit is passed.
-      if (DATABASE_TYPE_MYSQL.equals(databaseType)) {
+      if (DATABASE_TYPE_MSSQL.equals(databaseType)) {
         maxNrOfStatementsInBulkInsert = DEFAULT_MAX_NR_OF_STATEMENTS_BULK_INSERT_SQL_SERVER;
       }
       
