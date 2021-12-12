diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index ca57ed5..caed1e3 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -531,11 +531,11 @@
             {
                 if (!sashForm.isDisposed()) {
                     int[] weights = sashForm.getWeights();
-                    getActivePreferenceStore().setValue(SQLPreferenceConstants.RESULTS_PANEL_RATIO, weights[0] + "-" + weights[1]);
+                    getPreferenceStore().setValue(SQLPreferenceConstants.RESULTS_PANEL_RATIO, weights[0] + "-" + weights[1]);
                 }
             }
         });
-        String resultsPanelRatio = getActivePreferenceStore().getString(SQLPreferenceConstants.RESULTS_PANEL_RATIO);
+        String resultsPanelRatio = getPreferenceStore().getString(SQLPreferenceConstants.RESULTS_PANEL_RATIO);
         if (!CommonUtils.isEmpty(resultsPanelRatio)) {
             String[] weights = resultsPanelRatio.split("-");
             if (weights.length > 1) {
@@ -1002,9 +1002,9 @@
             // Execute all SQL statements consequently
             ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();
             if (selection.getLength() > 1) {
-                elements = extractScriptQueries(selection.getOffset(), selection.getLength(), true, false);
+                elements = extractScriptQueries(selection.getOffset(), selection.getLength(), true, false, true);
             } else {
-                elements = extractScriptQueries(0, document.getLength(), true, false);
+                elements = extractScriptQueries(0, document.getLength(), true, false, true);
             }
         } else {
             // Execute statement under cursor or selected text (if selection present)
