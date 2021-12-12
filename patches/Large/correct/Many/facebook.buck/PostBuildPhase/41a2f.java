diff --git a/src/com/facebook/buck/distributed/build_client/PostBuildPhase.java b/src/com/facebook/buck/distributed/build_client/PostBuildPhase.java
index 9b27ce3..abba505 100644
--- a/src/com/facebook/buck/distributed/build_client/PostBuildPhase.java
+++ b/src/com/facebook/buck/distributed/build_client/PostBuildPhase.java
@@ -193,7 +193,7 @@
     try {
       finishedStats = distBuildService.fetchBuildSlaveFinishedStats(job.getStampedeId(), runId);
       if (!finishedStats.isPresent()) {
-        LOG.error("BuildSlaveFinishedStats was not set for RunId:[%s] from frontend.", runId);
+        LOG.warn("BuildSlaveFinishedStats was not set for RunId:[%s] from frontend.", runId);
       }
     } catch (IOException ex) {
       LOG.error(
