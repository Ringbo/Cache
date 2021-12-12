diff --git a/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/ModuleFileSystemProvider.java b/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/ModuleFileSystemProvider.java
index 90b84ad..64514bd 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/ModuleFileSystemProvider.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/ModuleFileSystemProvider.java
@@ -79,7 +79,7 @@
       workDir = tempDirectories.getDir("work");
       LOG.warn("Working dir is not set. Using: " + workDir.getAbsolutePath());
     } else {
-      LOG.warn("Working dir: " + workDir.getAbsolutePath());
+      LOG.info("Working dir: " + workDir.getAbsolutePath());
       try {
         FileUtils.forceMkdir(workDir);
       } catch (Exception e) {
