diff --git a/contrib/storage-hbase/src/main/java/org/apache/drill/exec/store/hbase/HBaseGroupScan.java b/contrib/storage-hbase/src/main/java/org/apache/drill/exec/store/hbase/HBaseGroupScan.java
index e143e23..69c2725 100644
--- a/contrib/storage-hbase/src/main/java/org/apache/drill/exec/store/hbase/HBaseGroupScan.java
+++ b/contrib/storage-hbase/src/main/java/org/apache/drill/exec/store/hbase/HBaseGroupScan.java
@@ -144,7 +144,7 @@
   public GroupScan clone(List<SchemaPath> columns) {
     HBaseGroupScan newScan = new HBaseGroupScan(this);
     newScan.columns = columns == null ? ALL_COLUMNS : columns;
-    newScan.verifyColumns();
+    HBaseUtils.verifyColumns(columns, hTableDesc);
     return newScan;
   }
 
