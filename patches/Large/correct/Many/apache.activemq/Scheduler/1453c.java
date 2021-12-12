diff --git a/kahadb/src/main/java/org/apache/kahadb/util/Scheduler.java b/kahadb/src/main/java/org/apache/kahadb/util/Scheduler.java
index 7804523..fb2be06 100755
--- a/kahadb/src/main/java/org/apache/kahadb/util/Scheduler.java
+++ b/kahadb/src/main/java/org/apache/kahadb/util/Scheduler.java
@@ -35,7 +35,7 @@
 
     public static synchronized void executePeriodically(final Runnable task, long period) {
     	TimerTask timerTask = new SchedulerTimerTask(task);
-        CLOCK_DAEMON.scheduleAtFixedRate(timerTask, period, period);
+        CLOCK_DAEMON.schedule(timerTask, period, period);
         TIMER_TASKS.put(task, timerTask);
     }
 
