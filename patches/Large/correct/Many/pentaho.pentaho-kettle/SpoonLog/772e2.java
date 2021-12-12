diff --git a/src/be/ibridge/kettle/spoon/SpoonLog.java b/src/be/ibridge/kettle/spoon/SpoonLog.java
index 3a8dec0..b4251fe 100644
--- a/src/be/ibridge/kettle/spoon/SpoonLog.java
+++ b/src/be/ibridge/kettle/spoon/SpoonLog.java
@@ -1020,8 +1020,7 @@
 			for (i = 0; i < err_lines.length; i++)
 				err_lines[i] = (String) err.get(i);
 
-			EnterSelectionDialog esd = new EnterSelectionDialog(shell, spoon.props, err_lines,
-					Messages.getString("SpoonLog.Dialog.ErrorLines.Title"), Messages.getString("SpoonLog.Dialog.ErrorLines.Message")); //$NON-NLS-1$ //$NON-NLS-2$
+			EnterSelectionDialog esd = new EnterSelectionDialog(shell, err_lines, Messages.getString("SpoonLog.Dialog.ErrorLines.Title"), Messages.getString("SpoonLog.Dialog.ErrorLines.Message")); //$NON-NLS-1$ //$NON-NLS-2$
 			line = esd.open();
 			if (line != null)
 			{
