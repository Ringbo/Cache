diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetPersister.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetPersister.java
index 76ab813..6e48246 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetPersister.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetPersister.java
@@ -357,7 +357,7 @@
 
         private Throwable executeStatements(DBRProgressMonitor monitor)
         {
-            DBCTransactionManager txnManager = DBUtils.getTransactionManager(getDataSource());
+            DBCTransactionManager txnManager = DBUtils.getTransactionManager(getExecutionContext());
             DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, CoreMessages.controls_resultset_viewer_job_update);
             try {
                 monitor.beginTask(
