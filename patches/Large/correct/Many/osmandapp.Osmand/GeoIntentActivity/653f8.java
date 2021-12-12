diff --git a/OsmAnd/src/net/osmand/plus/activities/search/GeoIntentActivity.java b/OsmAnd/src/net/osmand/plus/activities/search/GeoIntentActivity.java
index c660114..ef10e31 100644
--- a/OsmAnd/src/net/osmand/plus/activities/search/GeoIntentActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/search/GeoIntentActivity.java
@@ -153,7 +153,7 @@
 				MapActivity.launchMapActivityMoveToTop(GeoIntentActivity.this);
 			}
 			Uri uri = intent.getData();
-			String searchString = p != null && p.isGeoAddress() ? p.getLabel() : uri.toString();
+			String searchString = p != null && p.isGeoAddress() ? p.getQuery() : uri.toString();
 			settings.setSearchRequestToShow(searchString);
 			MapActivity.launchMapActivityMoveToTop(GeoIntentActivity.this);
 		}
