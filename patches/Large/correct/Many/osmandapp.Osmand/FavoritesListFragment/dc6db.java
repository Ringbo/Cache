diff --git a/OsmAnd/src/net/osmand/plus/activities/FavoritesListFragment.java b/OsmAnd/src/net/osmand/plus/activities/FavoritesListFragment.java
index 27fc4c3..c65e729 100644
--- a/OsmAnd/src/net/osmand/plus/activities/FavoritesListFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/FavoritesListFragment.java
@@ -270,13 +270,12 @@
 						
 		}
 
-
-		public void sortByDefault() {
+		public void sortByDefault(boolean isSortedByDistance) {
 			Location loc = app.getLocationProvider().getLastStaleKnownLocation();
 			LatLon map = app.getMapViewTrackingUtilities().getMapLocation();
-			if (loc != null) {
+			if (loc != null && isSortedByDistance) {
 				sortByDistance(new LatLon(loc.getLatitude(), loc.getLongitude()));
-			} else if(map != null){
+			} else if (map != null && isSortedByDistance){
 				sortByDistance(map);
 			} else{
 				sortByName();
