diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/metastore/MetastoreUtil.java b/presto-hive/src/main/java/com/facebook/presto/hive/metastore/MetastoreUtil.java
index 4d9c41b..f47ab74 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/metastore/MetastoreUtil.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/metastore/MetastoreUtil.java
@@ -177,7 +177,7 @@
 
     public static String makePartName(List<Column> partitionColumns, List<String> values)
     {
-        checkArgument(partitionColumns.size() == values.size());
+        checkArgument(partitionColumns.size() == values.size(), "Partition value count does not match the partition column count");
         List<String> partitionColumnNames = partitionColumns.stream().map(Column::getName).collect(toList());
         return FileUtils.makePartName(partitionColumnNames, values);
     }
