diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/ViewValuePanel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/ViewValuePanel.java
index 624a87d..9625db6 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/ViewValuePanel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/panel/ViewValuePanel.java
@@ -178,7 +178,7 @@
                 @Override
                 public void updateValue(@Nullable Object value) {
                     super.updateValue(value);
-                    presentation.refreshData(false, false);
+                    presentation.updateValueView();
                 }
             };
             updateActions = true;
@@ -278,7 +278,7 @@
             valueSaving = true;
             Object newValue = valueEditor.extractEditorValue();
             previewController.updateValue(newValue);
-            presentation.refreshData(false, false);
+            presentation.updateValueView();
         } catch (Exception e) {
             UIUtils.showErrorDialog(null, "Value save", "Can't save edited value", e);
         } finally {
