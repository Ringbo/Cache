diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
index 7755c4e..ed0e8f5 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/properties/TabbedFolderPageForm.java
@@ -409,7 +409,7 @@
             }
             if (editControl instanceof Text || editControl instanceof Combo) {
                 gd.widthHint = Math.max(
-                    UIUtils.getFontHeight(group) * 10,
+                    UIUtils.getFontHeight(group) * 15,
                     editControl.computeSize(SWT.DEFAULT, SWT.DEFAULT).x);
             }
 
