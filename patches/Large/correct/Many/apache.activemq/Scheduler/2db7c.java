diff --git a/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java b/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
index 1403f57..859f93f 100755
--- a/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
+++ b/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
@@ -36,12 +36,12 @@
         
     public void executePeriodically(final Runnable task, long period) {
     	TimerTask timerTask = new SchedulerTimerTask(task);
-        timer.scheduleAtFixedRate(timerTask, period, period);
+        timer.schedule(timerTask, period, period);
         timerTasks.put(task, timerTask);
     }
 
     /*
-     * execute on rough schedual based on termination of last execution. There is no
+     * execute on rough schedule based on termination of last execution. There is no
      * compensation (two runs in quick succession) for delays
      */
     public synchronized void schedualPeriodically(final Runnable task, long period) {
