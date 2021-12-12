diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetadata.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetadata.java
index bd57e95..01dc1a1 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetadata.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetadata.java
@@ -269,7 +269,7 @@
     public Optional<Object> getInfo(ConnectorTableLayoutHandle layoutHandle)
     {
         HiveTableLayoutHandle tableLayoutHandle = checkType(layoutHandle, HiveTableLayoutHandle.class, "layoutHandle");
-        if (!tableLayoutHandle.getPartitions().isPresent()) {
+        if (tableLayoutHandle.getPartitions().isPresent()) {
             return Optional.of(new HiveInputInfo(tableLayoutHandle.getPartitions().get().stream()
                     .map(HivePartition::getPartitionId)
                     .collect(Collectors.toList())));
