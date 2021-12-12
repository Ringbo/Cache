diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index 014118e..1b36fc6 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -2633,7 +2633,7 @@
                     QueryResultsContainer results = queryProcessor.getResults(query);
                     if (results != null) {
                         int queryIndex = queryProcessors.indexOf(queryProcessor);
-                        if (queryIndex == 0) {
+                        if (queryIndex == 0 || queryProcessor.getResultContainers().size() == 1) {
                             String resultSetName = getResultsTabName(results.resultSetNumber, queryIndex, result.getResultSetName());
                             results.updateResultsName(resultSetName, null);
                         }
