diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/FavouritesBottomSheetMenuFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/FavouritesBottomSheetMenuFragment.java
index 3c014bb..6dcab05 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/FavouritesBottomSheetMenuFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/FavouritesBottomSheetMenuFragment.java
@@ -58,7 +58,7 @@
 		if (savedInstanceState != null && savedInstanceState.getBoolean(IS_SORTED)) {
 			sortByDist = savedInstanceState.getBoolean(SORTED_BY_TYPE);
 		}
-		favouritePoints = getMyApplication().getFavorites().getVisibleFavouritePoints();
+		favouritePoints = getMyApplication().getFavorites().getFavouritePoints();
 		recyclerView = new RecyclerView(getContext());
 		final int themeRes = nightMode ? R.style.OsmandDarkTheme : R.style.OsmandLightTheme;
 		recyclerView = (RecyclerView) View.inflate(new ContextThemeWrapper(getContext(), themeRes),
