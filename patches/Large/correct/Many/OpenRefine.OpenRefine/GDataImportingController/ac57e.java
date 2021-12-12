diff --git a/extensions/gdata/src/com/google/refine/extension/gdata/GDataImportingController.java b/extensions/gdata/src/com/google/refine/extension/gdata/GDataImportingController.java
index 08ad641..8813977 100644
--- a/extensions/gdata/src/com/google/refine/extension/gdata/GDataImportingController.java
+++ b/extensions/gdata/src/com/google/refine/extension/gdata/GDataImportingController.java
@@ -146,7 +146,7 @@
         Fusiontables.Table.List listTables = service.table().list();
         TableList tablelist = listTables.execute();
         
-        if (tablelist == null)
+        if (tablelist == null || tablelist.getItems() == null)
             return;
         
         for (Table table : tablelist.getItems()) {
