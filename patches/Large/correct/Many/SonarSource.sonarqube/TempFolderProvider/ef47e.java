diff --git a/sonar-batch/src/main/java/org/sonar/batch/bootstrap/TempFolderProvider.java b/sonar-batch/src/main/java/org/sonar/batch/bootstrap/TempFolderProvider.java
index 4ca4fe7..686b37a 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/bootstrap/TempFolderProvider.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/bootstrap/TempFolderProvider.java
@@ -80,13 +80,13 @@
     try {
       Files.createDirectories(workingPath);
     } catch (IOException e) {
-      throw new IllegalStateException("Failed to create working path: " + workingPath);
+      throw new IllegalStateException("Failed to create working path: " + workingPath, e);
     }
 
     try {
       return Files.createTempDirectory(workingPath, TMP_NAME_PREFIX);
     } catch (IOException e) {
-      throw new IllegalStateException("Failed to create temporary folder in " + workingPath);
+      throw new IllegalStateException("Failed to create temporary folder in " + workingPath, e);
     }
   }
 
