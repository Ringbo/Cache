diff --git a/core/src/main/java/org/elasticsearch/cluster/routing/allocation/DiskThresholdMonitor.java b/core/src/main/java/org/elasticsearch/cluster/routing/allocation/DiskThresholdMonitor.java
index 84fe1b3..b53629b 100644
--- a/core/src/main/java/org/elasticsearch/cluster/routing/allocation/DiskThresholdMonitor.java
+++ b/core/src/main/java/org/elasticsearch/cluster/routing/allocation/DiskThresholdMonitor.java
@@ -77,7 +77,7 @@
         }
 
         // Check percentage disk values
-        if (usage.getFreeDiskAsPercentage() < diskThresholdSettings.getFreeDiskThresholdHigh()) {
+        if (usage.getFreeDiskAsPercentage() < diskThresholdSettings.getFreeDiskThresholdFloodStage()) {
             logger.warn("flood stage disk watermark [{}] exceeded on {}, all indices on this node will marked read-only",
                 Strings.format1Decimals(100.0 - diskThresholdSettings.getFreeDiskThresholdFloodStage(), "%"), usage);
         } else if (usage.getFreeDiskAsPercentage() < diskThresholdSettings.getFreeDiskThresholdHigh()) {
