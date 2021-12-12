diff --git a/presto-main/src/main/java/com/facebook/presto/memory/ClusterMemoryManager.java b/presto-main/src/main/java/com/facebook/presto/memory/ClusterMemoryManager.java
index f0db01a..4cca809 100644
--- a/presto-main/src/main/java/com/facebook/presto/memory/ClusterMemoryManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/memory/ClusterMemoryManager.java
@@ -215,14 +215,14 @@
         return ImmutableMap.copyOf(pools);
     }
 
-    private boolean isClusterOutOfMemory()
+    private synchronized boolean isClusterOutOfMemory()
     {
         ClusterMemoryPool reservedPool = pools.get(RESERVED_POOL);
         ClusterMemoryPool generalPool = pools.get(GENERAL_POOL);
         return reservedPool != null && generalPool != null && reservedPool.getAssignedQueries() > 0 && generalPool.getBlockedNodes() > 0;
     }
 
-    private MemoryPoolAssignmentsRequest updateAssignments(Iterable<QueryExecution> queries)
+    private synchronized MemoryPoolAssignmentsRequest updateAssignments(Iterable<QueryExecution> queries)
     {
         ClusterMemoryPool reservedPool = pools.get(RESERVED_POOL);
         ClusterMemoryPool generalPool = pools.get(GENERAL_POOL);
@@ -280,7 +280,7 @@
 
     private void updateNodes(MemoryPoolAssignmentsRequest assignments)
     {
-        ImmutableSet.Builder builder = new ImmutableSet.Builder();
+        ImmutableSet.Builder<Node> builder = ImmutableSet.builder();
         Set<Node> aliveNodes = builder
                 .addAll(nodeManager.getNodes(ACTIVE))
                 .addAll(nodeManager.getNodes(SHUTTING_DOWN))
