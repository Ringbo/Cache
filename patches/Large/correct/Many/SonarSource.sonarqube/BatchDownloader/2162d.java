diff --git a/sonar-batch-bootstrapper/src/main/java/org/sonar/batch/bootstrapper/BatchDownloader.java b/sonar-batch-bootstrapper/src/main/java/org/sonar/batch/bootstrapper/BatchDownloader.java
index 27b28df..250559a 100644
--- a/sonar-batch-bootstrapper/src/main/java/org/sonar/batch/bootstrapper/BatchDownloader.java
+++ b/sonar-batch-bootstrapper/src/main/java/org/sonar/batch/bootstrapper/BatchDownloader.java
@@ -77,7 +77,7 @@
       String libs = remoteContent(BATCH_PATH);
 
       for (String lib : libs.split("\n")) {
-        if ("".equals(lib)) {
+        if (!"".equals(lib)) {
           File file = new File(toDir, lib);
           remoteContentToFile(BATCH_PATH + lib, file);
           files.add(file);
