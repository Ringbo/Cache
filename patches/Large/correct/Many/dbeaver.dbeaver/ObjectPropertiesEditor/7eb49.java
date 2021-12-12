diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/ObjectPropertiesEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/ObjectPropertiesEditor.java
index faa1232..9cfefde 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/ObjectPropertiesEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/ObjectPropertiesEditor.java
@@ -207,7 +207,7 @@
         Point foldersSize = children[1].computeSize(SWT.DEFAULT, SWT.DEFAULT);
         //Point foldersSize = children[1].computeSize(SWT.DEFAULT, SWT.DEFAULT);
         Point sashSize = sashForm.getSize();
-        if (foldersSize.y > sashSize.y / 2) {
+        if (sashSize.y > 0 && foldersSize.y > sashSize.y / 2) {
             int[] weights = new int[] {
                 (sashSize.y - foldersSize.y),
                 foldersSize.y
