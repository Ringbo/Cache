diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java b/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
index 62e37a5..a921452 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/utils/internal/DefaultTempFolder.java
@@ -95,7 +95,7 @@
     try {
       Files.walkFileTree(tempDir.toPath(), DeleteRecursivelyFileVisitor.INSTANCE);
     } catch (IOException e) {
-      LOG.trace("Failed to delete temp folder", e);
+      LOG.error("Failed to delete temp folder", e);
     }
   }
 
