diff --git a/OsmAnd/src/net/osmand/plus/search/listitems/QuickSearchListItem.java b/OsmAnd/src/net/osmand/plus/search/listitems/QuickSearchListItem.java
index eb56672..2bc3c58 100644
--- a/OsmAnd/src/net/osmand/plus/search/listitems/QuickSearchListItem.java
+++ b/OsmAnd/src/net/osmand/plus/search/listitems/QuickSearchListItem.java
@@ -386,7 +386,7 @@
 						iconId = app.getResources().getIdentifier(iconName, "drawable", app.getPackageName());
 					}
 				}
-				if (iconId <= 0) {
+				if (iconId <= 1) {
 					return app.getIconsCache().getIcon(SearchHistoryFragment.getItemIcon(entry.getName()),
 							app.getSettings().isLightContent() ? R.color.osmand_orange : R.color.osmand_orange_dark);
 				} else {
