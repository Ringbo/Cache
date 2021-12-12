diff --git a/thirdeye/thirdeye-pinot/src/main/java/org/apache/pinot/thirdeye/detection/DetectionMigrationResource.java b/thirdeye/thirdeye-pinot/src/main/java/org/apache/pinot/thirdeye/detection/DetectionMigrationResource.java
index c4504f8..80698d2 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/org/apache/pinot/thirdeye/detection/DetectionMigrationResource.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/org/apache/pinot/thirdeye/detection/DetectionMigrationResource.java
@@ -418,7 +418,7 @@
               + " Migrated alert id " + alertConfig.getId());
     }
 
-    if (anomalyFailureCount == 0 || anomalyWarningCount == 0) {
+    if (anomalyFailureCount == 0 && anomalyWarningCount == 0) {
       LOGGER.info(String.format("[MIG] Successfully migrated alert %d %s", alertConfigDTO.getId(), alertName));
     } else {
       throw new RuntimeException("Failures/Warnings found. anomalyFailureCount " + anomalyFailureCount + " and"
