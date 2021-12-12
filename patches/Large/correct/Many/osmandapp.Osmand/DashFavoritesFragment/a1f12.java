diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
index b2e5b3b..65f2ad3 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
@@ -69,7 +69,7 @@
 			if(!getMyApplication().getSettings().isLastKnownMapLocation()) {
 				// show first time when application ran
 				//location = getMyApplication().getLocationProvider().getFirstTimeRunDefaultLocation();
-				location = new LatLon(getMyApplication().getLocationProvider().getFirstTimeRunDefaultLocation().getLatitide(), getMyApplication().getLocationProvider().getFirstTimeRunDefaultLocation().getLongitude());
+				location = new LatLon(getMyApplication().getLocationProvider().getFirstTimeRunDefaultLocation().getLatitude(), getMyApplication().getLocationProvider().getFirstTimeRunDefaultLocation().getLongitude());
 			} else {
 				//location = getLocationProvider().getLastKnownLocation();
 				location = new LatLon(getLocationProvider().getLastKnownLocation().getLatitude(), getLocationProvider().getLastKnownLocation().getLongitude());
