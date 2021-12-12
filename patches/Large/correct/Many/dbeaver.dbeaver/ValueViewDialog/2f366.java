diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/data/ValueViewDialog.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/data/ValueViewDialog.java
index f6f1c5a..ae2e385 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/data/ValueViewDialog.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/data/ValueViewDialog.java
@@ -303,7 +303,7 @@
             opened = true;
             int result = super.open();
             if (result == IDialogConstants.OK_ID) {
-                getValueController().updateSelectionValue(editedValue);
+                getValueController().updateValue(editedValue, true);
             }
             return result;
         } finally {
