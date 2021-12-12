diff --git a/plugins/org.jkiss.dbeaver.ui.editors.base/src/org/jkiss/dbeaver/ui/editors/object/struct/EditForeignKeyPage.java b/plugins/org.jkiss.dbeaver.ui.editors.base/src/org/jkiss/dbeaver/ui/editors/object/struct/EditForeignKeyPage.java
index 9f053f7..78dc7ea 100644
--- a/plugins/org.jkiss.dbeaver.ui.editors.base/src/org/jkiss/dbeaver/ui/editors/object/struct/EditForeignKeyPage.java
+++ b/plugins/org.jkiss.dbeaver.ui.editors.base/src/org/jkiss/dbeaver/ui/editors/object/struct/EditForeignKeyPage.java
@@ -159,7 +159,7 @@
             }
         }
 
-        final Composite pkGroup = UIUtils.createPlaceholder(panel, 2);
+        final Composite pkGroup = UIUtils.createComposite(panel, 2);
         {
             pkGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
             uniqueKeyCombo = UIUtils.createLabelCombo(pkGroup, EditorsMessages.dialog_struct_edit_fk_combo_unik, SWT.DROP_DOWN | SWT.READ_ONLY);
