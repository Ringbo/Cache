diff --git a/server/src/main/java/org/apache/kylin/rest/service/CacheService.java b/server/src/main/java/org/apache/kylin/rest/service/CacheService.java
index 66760a5..6a301ae 100644
--- a/server/src/main/java/org/apache/kylin/rest/service/CacheService.java
+++ b/server/src/main/java/org/apache/kylin/rest/service/CacheService.java
@@ -170,7 +170,7 @@
                 try {
                     newSeg = getCubeManager().autoMergeCubeSegments(cube);
                     if (newSeg != null) {
-                        newSeg = getCubeManager().mergeSegments(cube, newSeg.getDateRangeStart(), newSeg.getDateRangeEnd());
+                        newSeg = getCubeManager().mergeSegments(cube, newSeg.getDateRangeStart(), newSeg.getDateRangeEnd(), true);
                         logger.debug("Will submit merge job on " + newSeg);
                         CubingJobBuilder builder = new CubingJobBuilder(new JobEngineConfig(getConfig()));
                         builder.setSubmitter("SYSTEM");
