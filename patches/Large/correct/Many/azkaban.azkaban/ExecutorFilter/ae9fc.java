diff --git a/azkaban-common/src/main/java/azkaban/executor/selector/ExecutorFilter.java b/azkaban-common/src/main/java/azkaban/executor/selector/ExecutorFilter.java
index a47bc16..af61be4 100644
--- a/azkaban-common/src/main/java/azkaban/executor/selector/ExecutorFilter.java
+++ b/azkaban-common/src/main/java/azkaban/executor/selector/ExecutorFilter.java
@@ -163,7 +163,7 @@
         ExecutorInfo stats = filteringTarget.getExecutorInfo();
         if (null == stats) {
           logger.debug(String.format("%s : filtering out %s as it's stats is unavailable.",
-              MINIMUMFREEMEMORY_FILTER_NAME,
+              CPUSTATUS_FILTER_NAME,
               filteringTarget.toString()));
           return false;
         }
