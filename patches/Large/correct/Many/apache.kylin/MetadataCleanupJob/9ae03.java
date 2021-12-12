diff --git a/tool/src/main/java/org/apache/kylin/tool/MetadataCleanupJob.java b/tool/src/main/java/org/apache/kylin/tool/MetadataCleanupJob.java
index cf17f82..1e5214d 100644
--- a/tool/src/main/java/org/apache/kylin/tool/MetadataCleanupJob.java
+++ b/tool/src/main/java/org/apache/kylin/tool/MetadataCleanupJob.java
@@ -57,7 +57,7 @@
         logger.info("jobThreshold option value: '" + optionsHelper.getOptionValue(OPTION_THRESHOLD_FOR_JOB) + "'");
         boolean delete = Boolean.parseBoolean(optionsHelper.getOptionValue(OPTION_DELETE));
         int jobOutdatedDays = optionsHelper.hasOption(OPTION_THRESHOLD_FOR_JOB)
-                ? Integer.valueOf(optionsHelper.getOptionValue(OPTION_THRESHOLD_FOR_JOB))
+                ? Integer.parseInt(optionsHelper.getOptionValue(OPTION_THRESHOLD_FOR_JOB))
                 : DEFAULT_JOB_OUTDATED_THRESHOLD_DAYS;
         
         new org.apache.kylin.rest.job.MetadataCleanupJob().cleanup(delete, jobOutdatedDays);
