diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
index afc9b3c..3547cb5 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
@@ -193,7 +193,7 @@
         zoomLocationButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
-                if (curLocation != null) {
+                if (curLocation != null && curlatLng != null) {
                     map.animateCamera(CameraUpdateFactory.newLatLngZoom(curlatLng, 17));
                 }
                 zoomDialog.dismiss();
