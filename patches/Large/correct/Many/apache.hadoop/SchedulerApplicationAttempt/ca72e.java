diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/SchedulerApplicationAttempt.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/SchedulerApplicationAttempt.java
index 7e7fdb7..7785e56 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/SchedulerApplicationAttempt.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/SchedulerApplicationAttempt.java
@@ -432,7 +432,7 @@
       .transferStateFromPreviousAppSchedulingInfo(appAttempt.appSchedulingInfo);
   }
   
-  public void move(Queue newQueue) {
+  public synchronized void move(Queue newQueue) {
     QueueMetrics oldMetrics = queue.getMetrics();
     QueueMetrics newMetrics = newQueue.getMetrics();
     String user = getUser();
