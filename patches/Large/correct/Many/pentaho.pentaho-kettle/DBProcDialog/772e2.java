diff --git a/src/be/ibridge/kettle/trans/step/dbproc/DBProcDialog.java b/src/be/ibridge/kettle/trans/step/dbproc/DBProcDialog.java
index 58c8840..ed183a3 100644
--- a/src/be/ibridge/kettle/trans/step/dbproc/DBProcDialog.java
+++ b/src/be/ibridge/kettle/trans/step/dbproc/DBProcDialog.java
@@ -179,7 +179,7 @@
 						String[] procs = db.getProcedures();
 						if (procs!=null && procs.length>0)
 						{
-							EnterSelectionDialog esd = new EnterSelectionDialog(shell, props, procs, Messages.getString("DBProcDialog.EnterSelection.DialogTitle"), Messages.getString("DBProcDialog.EnterSelection.DialogMessage")); //$NON-NLS-1$ //$NON-NLS-2$
+							EnterSelectionDialog esd = new EnterSelectionDialog(shell, procs, Messages.getString("DBProcDialog.EnterSelection.DialogTitle"), Messages.getString("DBProcDialog.EnterSelection.DialogMessage")); //$NON-NLS-1$ //$NON-NLS-2$
 							String proc = esd.open();
 							if (proc!=null)
 							{
