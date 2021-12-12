diff --git a/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java b/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
index 134bf01..988b213 100644
--- a/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
@@ -96,7 +96,7 @@
     public List<Partition> getPartitions(TableHandle table, Optional<Map<ColumnHandle, Object>> bindings)
     {
         checkNotNull(table, "table is null");
-        return getConnectorSplitManager(table).getPartitions(table, bindings.get());
+        return getConnectorSplitManager(table).getPartitions(table, bindings.or(ImmutableMap.<ColumnHandle, Object>of()));
     }
 
     private List<Partition> prunePartitions(Session session, List<Partition> partitions, Expression predicate, Map<ColumnHandle, Symbol> columnToSymbol)
