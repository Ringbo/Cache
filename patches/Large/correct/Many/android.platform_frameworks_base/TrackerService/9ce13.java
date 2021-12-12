diff --git a/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java b/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
index 5b75653..e2332bf 100644
--- a/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
+++ b/tests/LocationTracker/src/com/android/locationtracker/TrackerService.java
@@ -193,11 +193,11 @@
     }
 
     private boolean doDebugLogging() {
-        return getPreferences().getBoolean(DEBUG_PREF, true);
+        return getPreferences().getBoolean(DEBUG_PREF, false);
     }
 
     private boolean trackSignalStrength() {
-        return getPreferences().getBoolean(SIGNAL_PREF, true);
+        return getPreferences().getBoolean(SIGNAL_PREF, false);
     }
 
     private float getLocationMinDistance() {
