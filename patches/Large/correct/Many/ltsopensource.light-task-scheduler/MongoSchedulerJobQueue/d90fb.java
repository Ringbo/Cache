diff --git a/lts-core/src/main/java/com/lts/queue/mongo/MongoSchedulerJobQueue.java b/lts-core/src/main/java/com/lts/queue/mongo/MongoSchedulerJobQueue.java
index f825cb9..b8e5ae5 100644
--- a/lts-core/src/main/java/com/lts/queue/mongo/MongoSchedulerJobQueue.java
+++ b/lts-core/src/main/java/com/lts/queue/mongo/MongoSchedulerJobQueue.java
@@ -37,7 +37,7 @@
     @Override
     public List<JobPo> getNeedGenerateJobPos(Long checkTime, int topSize) {
         Query<JobPo> query = template.createQuery(JobPo.class);
-        query.field("relyOnPrevCycle").equal(true);
+        query.field("relyOnPrevCycle").equal(false);
         query.field("lastGenerateTriggerTime").equal(checkTime);
         query.offset(0).limit(topSize);
         return query.asList();
