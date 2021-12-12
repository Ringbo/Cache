diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index 87a9aaf..62d76a5 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -2306,7 +2306,7 @@
         @Override
         public boolean isReadyToRun()
         {
-            return queryProcessor.curJob == null || queryProcessor.curJobRunning.get() == 0;
+            return queryProcessor.curJob == null || queryProcessor.curJobRunning.get() <= 0;
         }
 
         @Override
