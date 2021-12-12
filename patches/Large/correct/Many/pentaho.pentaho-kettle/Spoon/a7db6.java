diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index 72c42a4..d4c6606 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -1581,7 +1581,7 @@
 	            if (object instanceof DatabaseMeta)
 	            {
 	                DatabaseMeta databaseMeta = (DatabaseMeta) object;
-	                TreeItem databaseItem = new TreeItem(stepsItem, SWT.NONE);
+	                TreeItem databaseItem = new TreeItem(databasesItem, SWT.NONE);
 	    			databaseItem.setText(databaseMeta.getName());
 	    			databaseItem.setImage(GUIResource.getInstance().getImageConnection());
 	            }
