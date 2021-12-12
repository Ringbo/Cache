diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index 703bca8..dcaa67c 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -1148,7 +1148,7 @@
 			final GeoidAltitudeCorrection geo = app.getResourceManager().getGeoidAltitudeCorrection();
 			if (geo != null) {
 				alt -= geo.getGeoidHeight(l.getLatitude(), l.getLongitude());
-				l.setAltitude(alt);
+				r.setAltitude(alt);
 			}
 		}
 		return r;
