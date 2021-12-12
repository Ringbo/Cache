diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
index 9b881a8..4235adc 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
@@ -73,7 +73,7 @@
 			}
 			//Use map center as origin if no position known
 			if (location == null) {
-				location = getMyApplication().getSettings().isLastKnownMapLocation();
+				location = getMyApplication().getSettings().getLastKnownMapLocation();
 			}
 			updateLocation(location);
 		}
