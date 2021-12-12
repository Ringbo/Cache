diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index aa77580..f9a0e47 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -389,7 +389,7 @@
         String condition = filtersText.getText();
         StringBuilder currentCondition = new StringBuilder();
         model.getDataFilter().appendConditionString(getDataSource(), currentCondition);
-        if (!currentCondition.toString().trim().equals(condition.trim())) {
+        if (currentCondition.toString().trim().equals(condition.trim())) {
             // The same
             return;
         }
