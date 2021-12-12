diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
index 41c0034..d572c08 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetFilterPanel.java
@@ -953,7 +953,7 @@
                             item = historyTable.getItem(selectionIndex);
                         }
                     }
-                    if (item != null) {
+                    if (item != null && !item.isDisposed()) {
                         if (e.keyCode == SWT.DEL) {
                             final String filterValue = item.getText();
                             try {
