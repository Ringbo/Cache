diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
index befc596..0075371 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
@@ -148,7 +148,7 @@
 	}
 
 	private void updateArrows() {
-		if (location == null) {
+		if (loc == null) {
 			return;
 		}
 
