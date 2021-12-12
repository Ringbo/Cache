diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java b/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
index 274f0e3..146a94b 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
@@ -342,7 +342,7 @@
                 context.getString(R.string.pref_femto_detection_key), false);
 
         boolean trackCellPref = prefs.getBoolean(
-                context.getString(R.string.pref_enable_cell_key), false);
+                context.getString(R.string.pref_enable_cell_key), true);
 
         boolean monitorCellPref = prefs.getBoolean(
                 context.getString(R.string.pref_enable_cell_monitoring_key), true);
