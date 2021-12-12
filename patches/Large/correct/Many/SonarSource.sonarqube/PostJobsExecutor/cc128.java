diff --git a/sonar-batch/src/main/java/org/sonar/batch/phases/PostJobsExecutor.java b/sonar-batch/src/main/java/org/sonar/batch/phases/PostJobsExecutor.java
index 801a9f3..9ef8f5d 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/phases/PostJobsExecutor.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/phases/PostJobsExecutor.java
@@ -57,7 +57,7 @@
     logPostJobs(postJobs);
 
     for (PostJob postJob : postJobs) {
-      LOG.info("Executing post-job {}", postJob.getClass());
+      LOG.info("Executing post-job {}", postJob.toString());
       eventBus.fireEvent(new PostJobExecutionEvent(postJob, true));
       postJob.executeOn(project, context);
       eventBus.fireEvent(new PostJobExecutionEvent(postJob, false));
