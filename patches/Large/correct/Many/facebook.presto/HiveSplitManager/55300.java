diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveSplitManager.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveSplitManager.java
index 365d4eb..0588bbb 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveSplitManager.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveSplitManager.java
@@ -288,7 +288,7 @@
                 String partName = makePartName(table.getPartitionColumns(), partition.getValues());
 
                 // verify partition is online
-                verifyOnline(tableName, Optional.of(partName), getProtectMode(partition), table.getParameters());
+                verifyOnline(tableName, Optional.of(partName), getProtectMode(partition), partition.getParameters());
 
                 // verify partition is not marked as non-readable
                 String partitionNotReadable = partition.getParameters().get(OBJECT_NOT_READABLE);
