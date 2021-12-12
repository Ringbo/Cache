diff --git a/src/org/wordpress/android/util/WPStatsTrackerMixpanel.java b/src/org/wordpress/android/util/WPStatsTrackerMixpanel.java
index a12580b..538024c 100644
--- a/src/org/wordpress/android/util/WPStatsTrackerMixpanel.java
+++ b/src/org/wordpress/android/util/WPStatsTrackerMixpanel.java
@@ -23,7 +23,7 @@
     public void track(WPStats.Stat stat, JSONObject properties) {
         WPStatsTrackerMixpanelInstructionsForStat instructions = instructionsForStat(stat);
 
-        if (stat == null)
+        if (instructions == null)
             return;
 
         trackMixpanelDataForInstructions(instructions, properties);
