diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java b/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
index cd76c8f..6e18116 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
@@ -52,7 +52,7 @@
     try {
       return Files.createTempDirectory(baseDir, null);
     } catch (IOException e) {
-      throw new IllegalStateException("Failed to create temp directory");
+      throw new IllegalStateException("Failed to create temp directory", e);
     }
   }
 
