diff --git a/core/java/android/companion/CompanionDeviceManager.java b/core/java/android/companion/CompanionDeviceManager.java
index ecdc0ce..78e3de4 100644
--- a/core/java/android/companion/CompanionDeviceManager.java
+++ b/core/java/android/companion/CompanionDeviceManager.java
@@ -214,7 +214,7 @@
     }
 
     private boolean checkFeaturePresent() {
-        boolean featurePresent = mService == null;
+        boolean featurePresent = mService != null;
         if (!featurePresent && DEBUG) {
             Log.d(LOG_TAG, "Feature " + PackageManager.FEATURE_COMPANION_DEVICE_SETUP
                     + " not available");
