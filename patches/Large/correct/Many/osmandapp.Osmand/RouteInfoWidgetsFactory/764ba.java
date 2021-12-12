diff --git a/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java b/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
index 07d0062..6e0de8b 100644
--- a/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
+++ b/OsmAnd/src/net/osmand/plus/views/mapwidgets/RouteInfoWidgetsFactory.java
@@ -695,7 +695,7 @@
 					dest.setBearing(myLocation.bearingTo(dest));
 					GeomagneticField destGf = new GeomagneticField((float) dest.getLatitude(), (float) dest.getLongitude(), (float) dest.getAltitude(),
 							System.currentTimeMillis());
-					float bearingToDest = dest.getBearing() + destGf.getDeclination();
+					float bearingToDest = dest.getBearing() - destGf.getDeclination();
 					if (relative) {
 						float b = -1000;
 						Float heading = getOsmandApplication().getLocationProvider().getHeading();
@@ -705,7 +705,7 @@
 						} else if (myLocation.hasBearing()) {
 							GeomagneticField myLocGf = new GeomagneticField((float) myLocation.getLatitude(), (float) myLocation.getLongitude(), (float) myLocation.getAltitude(),
 									System.currentTimeMillis());
-							b = (myLocation.getBearing() + myLocGf.getDeclination());
+							b = myLocation.getBearing() - myLocGf.getDeclination();
 						}
 						if (b > -1000) {
 							bearingToDest -= b;
