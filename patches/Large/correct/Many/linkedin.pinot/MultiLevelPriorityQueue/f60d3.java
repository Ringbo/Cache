diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueue.java b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueue.java
index 0385f14..126f443 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueue.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/MultiLevelPriorityQueue.java
@@ -86,7 +86,7 @@
   }
 
   @Override
-  public void put(@Nonnull SchedulerQueryContext query) throws OutOfCapacityError {
+  public void put(@Nonnull SchedulerQueryContext query) throws OutOfCapacityException {
     Preconditions.checkNotNull(query);
     queueLock.lock();
     String groupName = groupSelector.getSchedulerGroupName(query);
@@ -205,10 +205,10 @@
     return query;
   }
 
-  private void checkGroupHasCapacity(SchedulerGroup groupContext) throws OutOfCapacityError {
+  private void checkGroupHasCapacity(SchedulerGroup groupContext) throws OutOfCapacityException {
     if (groupContext.numPending() >= maxPendingPerGroup &&
         groupContext.totalReservedThreads() >= resourceManager.getTableThreadsHardLimit()) {
-      throw new OutOfCapacityError(
+      throw new OutOfCapacityException(
           String.format("SchedulerGroup %s is out of capacity. numPending: %d, maxPending: %d, reservedThreads: %d threadsHardLimit: %d",
               groupContext.name(),
               groupContext.numPending(), maxPendingPerGroup,
