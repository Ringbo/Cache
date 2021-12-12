diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/jobexecutor/ExecuteJobsRunnable.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/jobexecutor/ExecuteJobsRunnable.java
index 82ceb27..9273282 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/jobexecutor/ExecuteJobsRunnable.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/jobexecutor/ExecuteJobsRunnable.java
@@ -27,7 +27,7 @@
  */
 public class ExecuteJobsRunnable implements Runnable
 {
-    private static Logger log = LoggerFactory.getLogger(AcquireJobsRunnable.class);
+    private static Logger log = LoggerFactory.getLogger(ExecuteJobsRunnable.class);
 
     private final List<String> jobIds;
     private final JobExecutor jobExecutor;
