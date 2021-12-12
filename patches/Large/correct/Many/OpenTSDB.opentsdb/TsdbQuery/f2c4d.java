diff --git a/src/core/TsdbQuery.java b/src/core/TsdbQuery.java
index 354da65..ac62e0c 100644
--- a/src/core/TsdbQuery.java
+++ b/src/core/TsdbQuery.java
@@ -590,7 +590,7 @@
     Bytes.setInt(end_row, (end_time == UNSET
                            ? -1  // Will scan until the end (0xFFF...).
                            : (int) getScanEndTimeSeconds()),
-                 metric_width);
+                           metric_salt_width);
     
     // set the metric UID based on the TSUIDs if given, or the metric UID
     if (tsuids != null && !tsuids.isEmpty()) {
