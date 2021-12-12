diff --git a/twitter4j-core/src/internal-json/java/twitter4j/PlaceJSONImpl.java b/twitter4j-core/src/internal-json/java/twitter4j/PlaceJSONImpl.java
index 1a5117e..3ae8409 100644
--- a/twitter4j-core/src/internal-json/java/twitter4j/PlaceJSONImpl.java
+++ b/twitter4j-core/src/internal-json/java/twitter4j/PlaceJSONImpl.java
@@ -90,7 +90,7 @@
                 JSONArray array = geometryJSON.getJSONArray("coordinates");
                 if (geometryType.equals("Point")) {
                     geometryCoordinates = new GeoLocation[1][1];
-                    geometryCoordinates[0][0] = new GeoLocation(array.getDouble(0), array.getDouble(1));
+                    geometryCoordinates[0][0] = new GeoLocation(array.getDouble(1), array.getDouble(0));
                 } else if (geometryType.equals("Polygon")) {
                     geometryCoordinates = JSONImplFactory.coordinatesAsGeoLocationArray(array);
                 } else {
