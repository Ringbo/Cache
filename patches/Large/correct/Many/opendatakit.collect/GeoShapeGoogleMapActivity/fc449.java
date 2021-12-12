diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
index ac47f97..3fadaa3 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/GeoShapeGoogleMapActivity.java
@@ -308,7 +308,7 @@
         String temp_string = "";
         //Add the first marker to the end of the array, so the first and the last are the same
         if (markerArray.size() > 1 ){
-            markerArray.add(markerArray.get(1));
+            markerArray.add(markerArray.get(0));
             for (int i = 0 ; i < markerArray.size();i++){
                 String lat = Double.toString(markerArray.get(i).getPosition().latitude);
                 String lng = Double.toString(markerArray.get(i).getPosition().longitude);
