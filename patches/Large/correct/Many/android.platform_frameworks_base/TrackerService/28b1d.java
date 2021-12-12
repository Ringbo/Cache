diff --git a/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java b/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
index e2332bf..e4d2155 100644
--- a/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
+++ b/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
@@ -214,7 +214,7 @@
     private long getLocationUpdateTime() {
         try {
             String timeString = getPreferences().getString(MIN_TIME_PREF, "0");
-            long secondsTime = Long.valueOf(timeString);
+            long secondsTime = Long.parseLong(timeString);
             return secondsTime * 1000;
         }
         catch (NumberFormatException e) {
