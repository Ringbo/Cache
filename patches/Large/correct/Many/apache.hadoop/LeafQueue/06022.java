diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/LeafQueue.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/LeafQueue.java
index b43f658..869b49a 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/LeafQueue.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/LeafQueue.java
@@ -1163,7 +1163,7 @@
     metrics.setAvailableResourcesToUser(userName, application.getHeadroom());
     
     if (LOG.isDebugEnabled()) {
-      LOG.info(getQueueName() + 
+      LOG.debug(getQueueName() +
           " user=" + userName + 
           " used=" + queueUsage.getUsed() + " numContainers=" + numContainers +
           " headroom = " + application.getHeadroom() +
