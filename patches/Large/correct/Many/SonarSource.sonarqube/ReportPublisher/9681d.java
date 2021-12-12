diff --git a/sonar-batch/src/main/java/org/sonar/batch/report/ReportPublisher.java b/sonar-batch/src/main/java/org/sonar/batch/report/ReportPublisher.java
index 0f60fe4..fb60750 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/report/ReportPublisher.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/report/ReportPublisher.java
@@ -183,7 +183,7 @@
     }
   }
 
-  private void dumpReportImpl(String dumpDirLocation, String projectKey, String relativeUrl, File report) throws IOException, URISyntaxException {
+  private static void dumpReportImpl(String dumpDirLocation, String projectKey, String relativeUrl, File report) throws IOException, URISyntaxException {
     File dumpDir = new File(dumpDirLocation);
     if (!dumpDir.exists() || !dumpDir.isDirectory()) {
       LOG.warn("Report dump directory '{}' does not exist or is not a directory", dumpDirLocation);
