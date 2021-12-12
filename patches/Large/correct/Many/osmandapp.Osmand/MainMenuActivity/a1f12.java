diff --git a/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java b/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
index 59ea76b..e22ded1 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
@@ -512,7 +512,7 @@
 	}
 
 	@Override
-	public void updateLocation(Location location) {
+	public void updateLocation(LatLon location) {
 		for (WeakReference<Fragment> ref : fragList) {
 			Fragment f = ref.get();
 			if (f instanceof DashFavoritesFragment && !f.isDetached()) {
