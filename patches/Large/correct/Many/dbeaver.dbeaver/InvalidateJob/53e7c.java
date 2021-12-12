diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/runtime/jobs/InvalidateJob.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/runtime/jobs/InvalidateJob.java
index a5aa53d..1a6f3cc 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/runtime/jobs/InvalidateJob.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/runtime/jobs/InvalidateJob.java
@@ -77,7 +77,9 @@
     {
         DBPDataSource dataSource = getExecutionContext().getDataSource();
 
-        this.invalidateResults = invalidateDataSource(monitor, dataSource, true);
+        // Disable disconnect on failure. It is the worst case anyway.
+        // Not sure that we should force disconnect even here.
+        this.invalidateResults = invalidateDataSource(monitor, dataSource, false);
 
         return Status.OK_STATUS;
     }
