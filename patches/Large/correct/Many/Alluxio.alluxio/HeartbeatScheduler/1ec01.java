diff --git a/core/common/src/main/java/alluxio/heartbeat/HeartbeatScheduler.java b/core/common/src/main/java/alluxio/heartbeat/HeartbeatScheduler.java
index d68f1e8..68d07b0 100644
--- a/core/common/src/main/java/alluxio/heartbeat/HeartbeatScheduler.java
+++ b/core/common/src/main/java/alluxio/heartbeat/HeartbeatScheduler.java
@@ -56,7 +56,7 @@
    * @param timer a timer to add to the scheduler
    */
   public static void addTimer(ScheduledTimer timer) {
-    Preconditions.checkNotNull(timer);
+    Preconditions.checkNotNull(timer, "timer");
     try (LockResource r = new LockResource(sLock)) {
       Preconditions.checkState(!sTimers.containsKey(timer.getThreadName()),
           "The timer for thread %s is already waiting to be scheduled", timer.getThreadName());
