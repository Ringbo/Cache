diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/LightGrid.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/LightGrid.java
index c41c908..8a094ac 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/LightGrid.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/lightgrid/LightGrid.java
@@ -3449,7 +3449,7 @@
             showItem(newSelection);
 
             GridCell newPos;
-            if (newSelection >= 0) {
+            if (newSelection >= 0 && newSelection < rowElements.length) {
                 newPos = new GridCell(newColumnFocus.getElement(), rowElements[newSelection]);
             } else {
                 newPos = null;
