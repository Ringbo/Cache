diff --git a/tool/src/main/java/org/apache/kylin/tool/JobInstanceExtractor.java b/tool/src/main/java/org/apache/kylin/tool/JobInstanceExtractor.java
index ef77c6a..1023a8b 100644
--- a/tool/src/main/java/org/apache/kylin/tool/JobInstanceExtractor.java
+++ b/tool/src/main/java/org/apache/kylin/tool/JobInstanceExtractor.java
@@ -85,7 +85,7 @@
 
         long endTime = System.currentTimeMillis();
         long startTime = endTime - period * 24 * 3600 * 1000; // time in Millis
-        List<JobInstance> jobInstances = listJobInstances(cube, project, startTime, endTime);
+        List<JobInstance> jobInstances = listJobInstances(project, cube, startTime, endTime);
         logger.info("There are {} jobInstances to extract.", jobInstances.size());
 
         ObjectMapper mapper = new ObjectMapper();
