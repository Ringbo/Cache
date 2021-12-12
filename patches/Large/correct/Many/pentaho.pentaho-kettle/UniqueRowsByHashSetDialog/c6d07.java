diff --git a/src-ui/org/pentaho/di/ui/trans/steps/uniquerowsbyhashset/UniqueRowsByHashSetDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/uniquerowsbyhashset/UniqueRowsByHashSetDialog.java
index e02a25d..3311b68 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/uniquerowsbyhashset/UniqueRowsByHashSetDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/uniquerowsbyhashset/UniqueRowsByHashSetDialog.java
@@ -150,7 +150,7 @@
 		SettingsgroupLayout.marginHeight = 10;
 		wSettings.setLayout(SettingsgroupLayout);
 		
-        wlStoreValues=new Label(shell, SWT.RIGHT);
+        wlStoreValues=new Label(wSettings, SWT.RIGHT);
         wlStoreValues.setText(BaseMessages.getString(PKG, "UniqueRowsByHashSetDialog.StoreValues.Label")); //$NON-NLS-1$
         props.setLook(wlStoreValues);
         fdlStoreValues=new FormData();
@@ -159,7 +159,7 @@
         fdlStoreValues.right= new FormAttachment(middle, -margin);
         wlStoreValues.setLayoutData(fdlStoreValues);
         
-        wStoreValues=new Button(shell, SWT.CHECK );
+        wStoreValues=new Button(wSettings, SWT.CHECK );
         props.setLook(wStoreValues);
         wStoreValues.setToolTipText(BaseMessages.getString(PKG, "UniqueRowsByHashSetDialog.StoreValues.ToolTip",Const.CR)); //$NON-NLS-1$ //$NON-NLS-2$
         fdStoreValues=new FormData();
