diff --git a/OsmAnd/src/net/osmand/plus/myplaces/TrackPointFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/TrackPointFragment.java
index 9a2fcec..e2f6167 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/TrackPointFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/TrackPointFragment.java
@@ -122,7 +122,7 @@
 			public void onClick(View view) {
 				final OsmandSettings settings = app.getSettings();
 				GPXFile gpx = getGpx();
-				Location location = app.getLocationProvider().getLastKnownLocation();
+				LatLon location = settings.getLastKnownMapLocation();
 				if (location != null) {
 					settings.setMapLocationToShow(location.getLatitude(), location.getLongitude(),
 							settings.getLastKnownMapZoom(),
