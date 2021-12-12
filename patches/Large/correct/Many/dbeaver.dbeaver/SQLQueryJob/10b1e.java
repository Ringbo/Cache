diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
index 67cbe51..0bfec0a 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
@@ -134,7 +134,7 @@
     {
         statistics = new DBCStatistics();
         try {
-            DBCTransactionManager txnManager = DBUtils.getTransactionManager(getDataSource());
+            DBCTransactionManager txnManager = DBUtils.getTransactionManager(getExecutionContext());
             DBCSession session = getExecutionContext().openSession(monitor, queries.size() > 1 ? DBCExecutionPurpose.USER_SCRIPT : DBCExecutionPurpose.USER, "SQL Query");
             try {
                 // Set transaction settings (only if autocommit is off)
