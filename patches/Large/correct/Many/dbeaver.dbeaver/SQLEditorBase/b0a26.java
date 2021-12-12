diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
index 41998b8..7a29182 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorBase.java
@@ -1180,7 +1180,7 @@
                     if (pos.line < 0) {
                         if (pos.position >= 0) {
                             // Only position
-                            getSelectionProvider().setSelection(new TextSelection(queryStartOffset + pos.position, 1));
+                            getSelectionProvider().setSelection(new TextSelection(queryStartOffset + pos.position, 0));
                             scrolled = true;
                         }
                     } else {
