diff --git a/sonar-batch/src/main/java/org/sonar/batch/scan/LastLineHashes.java b/sonar-batch/src/main/java/org/sonar/batch/scan/LastLineHashes.java
index 7fde8b4..2f8cb99 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/scan/LastLineHashes.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/scan/LastLineHashes.java
@@ -43,7 +43,7 @@
   }
 
   private String loadHashesFromWs(String fileKey) {
-    TimeProfiler profiler = new TimeProfiler(LOG).start("Load previous line hashes of: " + fileKey).setLevelToDebug();
+    TimeProfiler profiler = new TimeProfiler(LOG).setLevelToDebug().start("Load previous line hashes of: " + fileKey);
     try {
       return server.request("/api/sources/hash?key=" + ServerClient.encodeForUrl(fileKey));
     } finally {
