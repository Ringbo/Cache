diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
index 215ba10..547bb24 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/runtime/sql/SQLQueryJob.java
@@ -711,7 +711,7 @@
         }
         resultSetNumber = 0;
         SQLQuery query = queries.get(0);
-        session.getProgressMonitor().beginTask(CommonUtils.truncateString(query.getQuery(), 1000), 1);
+        session.getProgressMonitor().beginTask(CommonUtils.truncateString(query.getQuery(), 512), 1);
         try {
             boolean result = executeSingleQuery(session, query, true);
             if (!result && lastError != null) {
