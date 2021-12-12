diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/SchedulerPriorityQueue.java b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/SchedulerPriorityQueue.java
index 5e5970a..08394e1 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/SchedulerPriorityQueue.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/SchedulerPriorityQueue.java
@@ -30,11 +30,11 @@
    * throws exception if the queues are out of capacity. This will never block for
    * resources to become available.
    * @param query query to add to the list of waiters
-   * @throws OutOfCapacityError if the internal query queues are full
+   * @throws OutOfCapacityException if the internal query queues are full
    */
   // TODO: throw OutOfCapacity or drop from the front of the queue ?
   // It may be more beneficial to drop oldest queries to move forward
-  void put(@Nonnull SchedulerQueryContext query) throws OutOfCapacityError;
+  void put(@Nonnull SchedulerQueryContext query) throws OutOfCapacityException;
 
   /**
    * Blocking call to select the query with highest priority to schedule for execution next.
