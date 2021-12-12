diff --git a/OsmAnd/src/net/osmand/plus/FavouritesDbHelper.java b/OsmAnd/src/net/osmand/plus/FavouritesDbHelper.java
index 8d56f5b..311e4c5 100644
--- a/OsmAnd/src/net/osmand/plus/FavouritesDbHelper.java
+++ b/OsmAnd/src/net/osmand/plus/FavouritesDbHelper.java
@@ -87,7 +87,7 @@
 		}
 		sortAll();
 		recalculateCachedFavPoints();
-		if (changed) {
+		if (changed || !getExternalFile().exists()) {
 			saveCurrentPointsIntoFile();
 		}
 		favouritesUpdated();
