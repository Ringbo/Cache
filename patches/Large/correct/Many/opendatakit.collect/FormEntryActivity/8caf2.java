diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
index db704e4..d6bd10b 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
@@ -2167,7 +2167,7 @@
                 && LocationClients.areGooglePlayServicesAvailable(this)) {
             registerReceiver(locationProvidersReceiver, new IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION));
             if (isBackgroundLocationEnabled()) {
-                if (PermissionUtils.isLocationPermissionGranted(this)) {
+                if (PermissionUtils.areLocationPermissionsGranted(this)) {
                     if (!locationPermissionsGranted) {
                         locationPermissionsGranted = true;
                         formController.getAuditEventLogger().logEvent(AuditEvent.AuditEventType.LOCATION_PERMISSIONS_GRANTED, null, false);
