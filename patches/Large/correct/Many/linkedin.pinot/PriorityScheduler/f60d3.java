diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/PriorityScheduler.java b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/PriorityScheduler.java
index 4910c74..04eccdd 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/PriorityScheduler.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/query/scheduler/PriorityScheduler.java
@@ -70,7 +70,7 @@
     final SchedulerQueryContext schedQueryContext = new SchedulerQueryContext(queryRequest);
     try {
       queryQueue.put(schedQueryContext);
-    } catch (OutOfCapacityError e) {
+    } catch (OutOfCapacityException e) {
       LOGGER.error("Out of capacity for table {}, message: {}", queryRequest.getTableName(), e.getMessage());
       return immediateErrorResponse(queryRequest, QueryException.SERVER_OUT_OF_CAPACITY_ERROR);
     }
