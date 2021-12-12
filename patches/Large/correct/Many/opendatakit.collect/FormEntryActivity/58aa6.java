diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
index d914e01..a567ea9 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
@@ -1052,7 +1052,7 @@
                 boolean previousValue = isBackgroundLocationEnabled();
                 if (formController != null) {
                     if (previousValue) {
-                        formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_DISABLED, 0, null, true);
+                        formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_DISABLED, 0, null, false);
                         if (googleLocationClient != null) {
                             googleLocationClient.stop();
                         }
@@ -2172,12 +2172,12 @@
                 if (PermissionUtils.isLocationPermissionGranted(this)) {
                     if (!locationPermissionsGranted) {
                         locationPermissionsGranted = true;
-                        formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_GRANTED, 0, null, true);
+                        formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_GRANTED, 0, null, false);
                     }
                     setUpLocationClient(formController.getSubmissionMetadata().audit);
                 } else if (locationPermissionsGranted) {
                     locationPermissionsGranted = false;
-                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_NOT_GRANTED, 0, null, true);
+                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_NOT_GRANTED, 0, null, false);
                 }
             }
         }
@@ -2538,35 +2538,35 @@
                     backgroundLocationEnabled(formController);
                 } else {
                     SnackbarUtils.showSnackbar(findViewById(R.id.llParent), getString(R.string.background_location_disabled));
-                    formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_DISABLED, 0, null, true);
+                    formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_DISABLED, 0, null, false);
                 }
             } else {
                 SnackbarUtils.showSnackbar(findViewById(R.id.llParent), getString(R.string.google_play_services_not_available));
-                formController.getEventLogger().logEvent(EventLogger.EventTypes.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE, 0, null, true);
+                formController.getEventLogger().logEvent(EventLogger.EventTypes.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE, 0, null, false);
             }
         }
     }
 
     private void backgroundLocationEnabled(FormController formController) {
-        formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_ENABLED, 0, null, true);
+        formController.getEventLogger().logEvent(EventLogger.EventTypes.BACKGROUND_LOCATION_ENABLED, 0, null, false);
         new PermissionUtils(this).requestLocationPermissions(new PermissionListener() {
             @Override
             public void granted() {
                 locationPermissionsGranted = true;
-                formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_GRANTED, 0, null, true);
+                formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_GRANTED, 0, null, false);
                 setUpLocationClient(formController.getSubmissionMetadata().audit);
                 if (googleLocationClient.isLocationAvailable()) {
-                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PROVIDERS_ENABLED, 0, null, true);
+                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PROVIDERS_ENABLED, 0, null, false);
                     SnackbarUtils.showSnackbar(findViewById(R.id.llParent), getString(R.string.background_location_enabled));
                 } else {
-                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PROVIDERS_DISABLED, 0, null, true);
+                    formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PROVIDERS_DISABLED, 0, null, false);
                     new LocationProvidersDisabledDialog().show(getSupportFragmentManager(), LocationProvidersDisabledDialog.LOCATION_PROVIDERS_DISABLED_DIALOG_TAG);
                 }
             }
 
             @Override
             public void denied() {
-                formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_NOT_GRANTED, 0, null, true);
+                formController.getEventLogger().logEvent(EventLogger.EventTypes.LOCATION_PERMISSIONS_NOT_GRANTED, 0, null, false);
             }
         });
     }
