diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index a8edaea..d6a03cb 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -466,7 +466,7 @@
 			}
 			return true;
 		} else if (keyCode == KeyEvent.KEYCODE_MENU && event.getRepeatCount() == 0) {
-			mapActions.openOptionsMenuAsList();
+			mapActions.openOptionsMenuAsDrawer();
 			return true;
 		} else if (keyCode == KeyEvent.KEYCODE_SEARCH && event.getRepeatCount() == 0) {
 			Intent newIntent = new Intent(MapActivity.this, getMyApplication().getAppCustomization().getSearchActivity());
