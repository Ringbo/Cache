diff --git a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/SegmentStatusChecker.java b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/SegmentStatusChecker.java
index 2e3329d..6893394 100644
--- a/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/SegmentStatusChecker.java
+++ b/pinot-controller/src/main/java/com/linkedin/pinot/controller/helix/SegmentStatusChecker.java
@@ -243,7 +243,7 @@
             nReplicasIdealMax);
       }
     } catch (Exception e) {
-      LOGGER.warn("Caught exception while updating segment status for table {}", e, tableNameWithType);
+      LOGGER.warn("Caught exception while updating segment status for table {}", tableNameWithType, e);
 
       // Remove the metric for this table
       resetTableMetrics(tableNameWithType);
