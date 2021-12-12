diff --git a/src/be/ibridge/kettle/core/dialog/DatabaseExplorerDialog.java b/src/be/ibridge/kettle/core/dialog/DatabaseExplorerDialog.java
index b75cad9..289213f 100644
--- a/src/be/ibridge/kettle/core/dialog/DatabaseExplorerDialog.java
+++ b/src/be/ibridge/kettle/core/dialog/DatabaseExplorerDialog.java
@@ -565,7 +565,7 @@
                 String conn[] = new String[dbs.size()];
     			for (int i=0;i<conn.length;i++) conn[i] = ((DatabaseMeta)dbs.get(i)).getName();
     			
-    			EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, conn, "Target database:", "Select the target database:");
+    			EnterSelectionDialog esd = new EnterSelectionDialog(shell, conn, "Target database:", "Select the target database:");
     			String target = esd.open();
     			if (target!=null)
     			{
