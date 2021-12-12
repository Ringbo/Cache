diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/FavoritePointEditorFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/FavoritePointEditorFragment.java
index 0a9977d..436ccc3 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/FavoritePointEditorFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/editors/FavoritePointEditorFragment.java
@@ -123,7 +123,7 @@
 		mapActivity.getSupportFragmentManager().beginTransaction()
 				//.setCustomAnimations(slideInAnim, slideOutAnim, slideInAnim, slideOutAnim)
 				.add(R.id.fragmentContainer, fragment, editor.getFragmentTag())
-				.addToBackStack(null).commit();
+				.addToBackStack(null).commitAllowingStateLoss();
 	}
 
 	public static void showAutoFillInstance(final MapActivity mapActivity, boolean autoFill) {
