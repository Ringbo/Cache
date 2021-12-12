diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
index c5da481..94e1ff8 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/RemoteTaskRunner.java
@@ -661,7 +661,7 @@
         );
         tasksToFail.addAll(zkWorker.getRunningTaskIds());
         for (String assignedTask : tasksToFail) {
-          RemoteTaskRunnerWorkItem taskRunnerWorkItem = runningTasks.get(assignedTask);
+          RemoteTaskRunnerWorkItem taskRunnerWorkItem = runningTasks.remove(assignedTask);
           if (taskRunnerWorkItem != null) {
             String taskPath = JOINER.join(config.getIndexerTaskPath(), worker.getHost(), assignedTask);
             if (cf.checkExists().forPath(taskPath) != null) {
