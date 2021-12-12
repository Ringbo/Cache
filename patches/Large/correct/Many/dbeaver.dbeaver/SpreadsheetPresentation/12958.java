diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
index 105082e..e8d52c2 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/spreadsheet/SpreadsheetPresentation.java
@@ -1452,7 +1452,7 @@
             if (element instanceof DBDAttributeBinding) {
                 DBDAttributeBinding attributeBinding = (DBDAttributeBinding) element;
                 DBDAttributeConstraint constraint = controller.getModel().getDataFilter().getConstraint(attributeBinding);
-                if (constraint != null && constraint.hasFilter()) {
+                if (constraint != null && constraint.hasCondition()) {
                     return boldFont;
                 }
             }
