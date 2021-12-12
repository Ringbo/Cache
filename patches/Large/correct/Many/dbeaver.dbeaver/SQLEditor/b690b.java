diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index e4d1fc3..45ec37c 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -1081,7 +1081,7 @@
             });
 
             //boolean firstResultSet = queryProcessors.isEmpty();
-            int tabIndex = Math.max(resultTabs.getItemCount() - 2, 0);
+            int tabIndex = Math.max(resultTabs.getItemCount() - 3, 0);
             int queryIndex = queryProcessors.indexOf(queryProcessor) + 1;
             tabItem = new CTabItem(resultTabs, SWT.NONE, tabIndex);
             String tabName = CoreMessages.editors_sql_data_grid;
