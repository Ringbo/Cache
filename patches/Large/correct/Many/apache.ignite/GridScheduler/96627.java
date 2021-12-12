diff --git a/modules/core/java/org/gridgain/grid/scheduler/GridScheduler.java b/modules/core/java/org/gridgain/grid/scheduler/GridScheduler.java
index e3bf17c..1ac2290 100644
--- a/modules/core/java/org/gridgain/grid/scheduler/GridScheduler.java
+++ b/modules/core/java/org/gridgain/grid/scheduler/GridScheduler.java
@@ -90,5 +90,5 @@
      *      parameters are optional.
      * @return Scheduled execution future.
      */
-    public <R> GridSchedulerFuture<R> scheduleLocal(Callable<R> c, String ptrn) throws GridException;
+    public <R> GridSchedulerFuture<R> scheduleLocal(Callable<R> c, String ptrn);
 }
