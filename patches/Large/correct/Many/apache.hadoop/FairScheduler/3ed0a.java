diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/FairScheduler.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/FairScheduler.java
index 124da99..2f0857e 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/FairScheduler.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/fair/FairScheduler.java
@@ -1232,7 +1232,7 @@
     }
   }
 
-  private String resolveReservationQueueName(String queueName,
+  private synchronized String resolveReservationQueueName(String queueName,
       ApplicationId applicationId, ReservationId reservationID) {
     FSQueue queue = queueMgr.getQueue(queueName);
     if ((queue == null) || !allocConf.isReservable(queue.getQueueName())) {
