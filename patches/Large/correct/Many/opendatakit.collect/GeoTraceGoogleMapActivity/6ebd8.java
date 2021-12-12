diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/GeoTraceGoogleMapActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/GeoTraceGoogleMapActivity.java
index 847e303..0dc5df8 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/GeoTraceGoogleMapActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/GeoTraceGoogleMapActivity.java
@@ -606,7 +606,7 @@
     }
 
     private void zoomToMyLocation() {
-        if (curLocation != null) {
+        if (curLocation != null && curlatLng != null) {
             map.animateCamera(CameraUpdateFactory.newLatLngZoom(curlatLng, 17));
         }
 
