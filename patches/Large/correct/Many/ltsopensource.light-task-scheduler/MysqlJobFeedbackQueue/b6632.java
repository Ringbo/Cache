diff --git a/lts-core/src/main/java/com/lts/queue/mysql/MysqlJobFeedbackQueue.java b/lts-core/src/main/java/com/lts/queue/mysql/MysqlJobFeedbackQueue.java
index 0e09857..16ab5ec 100644
--- a/lts-core/src/main/java/com/lts/queue/mysql/MysqlJobFeedbackQueue.java
+++ b/lts-core/src/main/java/com/lts/queue/mysql/MysqlJobFeedbackQueue.java
@@ -33,7 +33,7 @@
     @Override
     public boolean removeQueue(String jobClientNodeGroup) {
         return new DropTableSql(getSqlTemplate())
-                .drop(JobQueueUtils.getExecutableQueueName(jobClientNodeGroup))
+                .drop(JobQueueUtils.getFeedbackQueueName(jobClientNodeGroup))
                 .doDrop();
     }
 
