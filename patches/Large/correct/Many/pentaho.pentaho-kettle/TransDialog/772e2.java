diff --git a/src/be/ibridge/kettle/trans/dialog/TransDialog.java b/src/be/ibridge/kettle/trans/dialog/TransDialog.java
index 8e94359..9ea8c03 100644
--- a/src/be/ibridge/kettle/trans/dialog/TransDialog.java
+++ b/src/be/ibridge/kettle/trans/dialog/TransDialog.java
@@ -1087,7 +1087,7 @@
         
         if (dbNames.length>0)
         {
-            EnterSelectionDialog dialog = new EnterSelectionDialog(shell, props, dbNames, "Select the database", "Select the partitioned database to import from");
+            EnterSelectionDialog dialog = new EnterSelectionDialog(shell, dbNames, "Select the database", "Select the partitioned database to import from");
             String dbName = dialog.open();
             if (dbName!=null)
             {
