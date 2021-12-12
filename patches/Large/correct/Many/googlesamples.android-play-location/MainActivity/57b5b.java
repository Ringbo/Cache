diff --git a/Geofencing/app/src/main/java/com/google/android/gms/location/sample/geofencing/MainActivity.java b/Geofencing/app/src/main/java/com/google/android/gms/location/sample/geofencing/MainActivity.java
index 6d4271a..3002eba 100644
--- a/Geofencing/app/src/main/java/com/google/android/gms/location/sample/geofencing/MainActivity.java
+++ b/Geofencing/app/src/main/java/com/google/android/gms/location/sample/geofencing/MainActivity.java
@@ -253,7 +253,7 @@
             mGeofencesAdded = !mGeofencesAdded;
             SharedPreferences.Editor editor = mSharedPreferences.edit();
             editor.putBoolean(Constants.GEOFENCES_ADDED_KEY, mGeofencesAdded);
-            editor.commit();
+            editor.apply();
 
             // Update the UI. Adding geofences enables the Remove Geofences button, and removing
             // geofences enables the Add Geofences button.
