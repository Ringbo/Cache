diff --git a/src/be/ibridge/kettle/chef/Chef.java b/src/be/ibridge/kettle/chef/Chef.java
index 32e5f7d..3682029 100644
--- a/src/be/ibridge/kettle/chef/Chef.java
+++ b/src/be/ibridge/kettle/chef/Chef.java
@@ -1510,7 +1510,7 @@
 					DatabaseMeta dbinfo = jobMeta.findDatabase(name);
 					if (dbinfo!=null)
 					{
-						DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, dbinfo, jobMeta.databases, true );
+						DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, dbinfo, jobMeta.databases, true );
 						std.open();
 					}
 					else
