diff --git a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
index 9657937..85eafce 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
@@ -591,7 +591,7 @@
 	}
 	
 	public boolean showFavorites() {
-		return app.getSettings().SHOW_NEARBY_FAVORIES.get();
+		return app.getSettings().SHOW_NEARBY_FAVORITES.get();
 	}
 	
 	public boolean announceFavorites() {
