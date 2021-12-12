diff --git a/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/maprdb/MapRDBFormatPlugin.java b/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/maprdb/MapRDBFormatPlugin.java
index 6a10d22..aa91901 100644
--- a/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/maprdb/MapRDBFormatPlugin.java
+++ b/contrib/format-maprdb/src/main/java/org/apache/drill/exec/store/maprdb/MapRDBFormatPlugin.java
@@ -105,7 +105,7 @@
   @Override
   public AbstractGroupScan getGroupScan(String userName, FileSelection selection,
       List<SchemaPath> columns) throws IOException {
-    List<String> files = selection.getAsFiles();
+    List<String> files = selection.getFiles();
     assert (files.size() == 1);
     String tableName = files.get(0);
     HBaseScanSpec scanSpec = new HBaseScanSpec(tableName);
