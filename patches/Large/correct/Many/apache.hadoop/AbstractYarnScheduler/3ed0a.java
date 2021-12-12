diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/AbstractYarnScheduler.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/AbstractYarnScheduler.java
index bf720ae..ad2b5d4 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/AbstractYarnScheduler.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/AbstractYarnScheduler.java
@@ -189,8 +189,8 @@
     }
   }
 
-  protected void containerLaunchedOnNode(ContainerId containerId,
-                                         SchedulerNode node) {
+  protected synchronized void containerLaunchedOnNode(
+      ContainerId containerId, SchedulerNode node) {
     // Get the application for the finished container
     SchedulerApplicationAttempt application = getCurrentAttemptForContainer
         (containerId);
