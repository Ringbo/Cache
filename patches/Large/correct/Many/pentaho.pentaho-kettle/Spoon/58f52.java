diff --git a/src/be/ibridge/kettle/spoon/Spoon.java b/src/be/ibridge/kettle/spoon/Spoon.java
index 985ac4c..abe92d5 100644
--- a/src/be/ibridge/kettle/spoon/Spoon.java
+++ b/src/be/ibridge/kettle/spoon/Spoon.java
@@ -4104,7 +4104,7 @@
                     DatabaseMeta dbinfo = transMeta.findDatabase(name);
                     if (dbinfo!=null)
                     {
-                        DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, props, SWT.NONE, dbinfo, transMeta.getDatabases(), true );
+                        DatabaseExplorerDialog std = new DatabaseExplorerDialog(shell, SWT.NONE, dbinfo, transMeta.getDatabases(), true );
                         std.open();
                     }
                     else
