diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
index c4283cf..befc596 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashFavoritesFragment.java
@@ -116,7 +116,7 @@
 			ImageView icon = (ImageView) view.findViewById(R.id.icon);
 			ImageView direction = (ImageView) view.findViewById(R.id.direction);
 
-			if(location != null){
+			if(loc != null){
 				direction.setVisibility(View.VISIBLE);
 				updateArrow(point, direction);
 			}
