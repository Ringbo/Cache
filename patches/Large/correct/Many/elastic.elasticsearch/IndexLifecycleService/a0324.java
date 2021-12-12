diff --git a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
index 8ba68e0..4ade4dc 100644
--- a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
+++ b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleService.java
@@ -119,7 +119,7 @@
     @Override
     public void triggered(SchedulerEngine.Event event) {
         if (event.getJobName().equals(IndexLifecycle.NAME)) {
-            logger.info("Job triggered: " + event.getJobName() + ", " + event.getScheduledTime() + ", " + event.getTriggeredTime());
+            logger.debug("Job triggered: " + event.getJobName() + ", " + event.getScheduledTime() + ", " + event.getTriggeredTime());
             triggerPolicies(clusterService.state(), false);
         }
     }
