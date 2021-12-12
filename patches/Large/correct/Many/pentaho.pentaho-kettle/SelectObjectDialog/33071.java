diff --git a/src/be/ibridge/kettle/repository/dialog/SelectObjectDialog.java b/src/be/ibridge/kettle/repository/dialog/SelectObjectDialog.java
index b9a9ebf..414034a 100644
--- a/src/be/ibridge/kettle/repository/dialog/SelectObjectDialog.java
+++ b/src/be/ibridge/kettle/repository/dialog/SelectObjectDialog.java
@@ -145,12 +145,12 @@
         userColumn = new TreeColumn(wTree, SWT.LEFT);
         userColumn.setText(Messages.getString("RepositoryExplorerDialog.Column.User")); //$NON-NLS-1$
         userColumn.setWidth(100);
-        userColumn.addListener(SWT.Selection, new Listener() { public void handleEvent(Event e) { setSort(3); } });
+        userColumn.addListener(SWT.Selection, new Listener() { public void handleEvent(Event e) { setSort(2); } });
 
         changedColumn = new TreeColumn(wTree, SWT.LEFT);
         changedColumn.setText(Messages.getString("RepositoryExplorerDialog.Column.Changed")); //$NON-NLS-1$
         changedColumn.setWidth(120);
-        changedColumn.addListener(SWT.Selection, new Listener() { public void handleEvent(Event e) { setSort(4); } });
+        changedColumn.addListener(SWT.Selection, new Listener() { public void handleEvent(Event e) { setSort(3); } });
         
         
         props.setLook(wTree);
