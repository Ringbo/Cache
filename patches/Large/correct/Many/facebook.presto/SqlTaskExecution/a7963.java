diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java b/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
index dca9c66..88af518 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SqlTaskExecution.java
@@ -304,7 +304,7 @@
         return updatedUnpartitionedSources;
     }
 
-    private void schedulePartitionedSource(TaskSource source)
+    private synchronized void schedulePartitionedSource(TaskSource source)
     {
         // if this is not for the currently scheduling source, save off the splits for
         // when the source is scheduled
@@ -335,12 +335,12 @@
         }
     }
 
-    private boolean isSchedulingSource(PlanNodeId sourceId)
+    private synchronized boolean isSchedulingSource(PlanNodeId sourceId)
     {
         return !sourceStartOrder.isEmpty() && sourceStartOrder.peek().equals(sourceId);
     }
 
-    private void scheduleUnpartitionedSource(TaskSource source, Map<PlanNodeId, TaskSource> updatedUnpartitionedSources)
+    private synchronized void scheduleUnpartitionedSource(TaskSource source, Map<PlanNodeId, TaskSource> updatedUnpartitionedSources)
     {
         // create new source
         TaskSource newSource;
@@ -419,7 +419,7 @@
         }
     }
 
-    public Set<PlanNodeId> getNoMoreSplits()
+    public synchronized Set<PlanNodeId> getNoMoreSplits()
     {
         ImmutableSet.Builder<PlanNodeId> noMoreSplits = ImmutableSet.builder();
         for (Entry<PlanNodeId, DriverSplitRunnerFactory> entry : partitionedDriverFactories.entrySet()) {
