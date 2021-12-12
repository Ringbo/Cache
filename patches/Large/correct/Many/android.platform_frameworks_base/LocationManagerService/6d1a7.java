diff --git a/services/core/java/com/android/server/LocationManagerService.java b/services/core/java/com/android/server/LocationManagerService.java
index 7c48634..e0b4960 100644
--- a/services/core/java/com/android/server/LocationManagerService.java
+++ b/services/core/java/com/android/server/LocationManagerService.java
@@ -545,11 +545,11 @@
                     com.android.internal.R.string.config_hardwareFlpPackageName,
                     com.android.internal.R.array.config_locationProviderPackageNames);
             if (fusedProxy == null) {
-                Slog.e(TAG, "Unable to bind FusedProxy.");
+                Slog.d(TAG, "Unable to bind FusedProxy.");
             }
         } else {
             flpHardwareProvider = null;
-            Slog.e(TAG, "FLP HAL not supported");
+            Slog.d(TAG, "FLP HAL not supported");
         }
 
         // bind to geofence provider
@@ -561,7 +561,7 @@
                 mGpsGeofenceProxy,
                 flpHardwareProvider != null ? flpHardwareProvider.getGeofenceHardware() : null);
         if (provider == null) {
-            Slog.e(TAG,  "Unable to bind FLP Geofence proxy.");
+            Slog.d(TAG,  "Unable to bind FLP Geofence proxy.");
         }
 
         // bind to hardware activity recognition
@@ -570,7 +570,7 @@
         if (activityRecognitionHardwareIsSupported) {
             activityRecognitionHardware = ActivityRecognitionHardware.getInstance(mContext);
         } else {
-            Slog.e(TAG, "Hardware Activity-Recognition not supported.");
+            Slog.d(TAG, "Hardware Activity-Recognition not supported.");
         }
         ActivityRecognitionProxy proxy = ActivityRecognitionProxy.createAndBind(
                 mContext,
@@ -581,7 +581,7 @@
                 com.android.internal.R.string.config_activityRecognitionHardwarePackageName,
                 com.android.internal.R.array.config_locationProviderPackageNames);
         if (proxy == null) {
-            Slog.e(TAG, "Unable to bind ActivityRecognitionProxy.");
+            Slog.d(TAG, "Unable to bind ActivityRecognitionProxy.");
         }
 
         String[] testProviderStrings = resources.getStringArray(
