diff --git a/src/be/ibridge/kettle/chef/ChefLog.java b/src/be/ibridge/kettle/chef/ChefLog.java
index 52bd96b..acf5296 100644
--- a/src/be/ibridge/kettle/chef/ChefLog.java
+++ b/src/be/ibridge/kettle/chef/ChefLog.java
@@ -675,7 +675,7 @@
 			String err_lines[] = new String[err.size()];
 			for (i=0;i<err_lines.length;i++) err_lines[i] = (String)err.get(i);
 			
-			EnterSelectionDialog esd = new EnterSelectionDialog(shell, chef.props, err_lines, Messages.getString("ChefLog.Dialog.ErrorLines.Title"), Messages.getString("ChefLog.Dialog.ErrorLines.Message")); //$NON-NLS-1$ //$NON-NLS-2$
+			EnterSelectionDialog esd = new EnterSelectionDialog(shell, err_lines, Messages.getString("ChefLog.Dialog.ErrorLines.Title"), Messages.getString("ChefLog.Dialog.ErrorLines.Message")); //$NON-NLS-1$ //$NON-NLS-2$
 			line = esd.open();
 			if (line!=null)
 			{
