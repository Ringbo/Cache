diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 86cb2d2..6681baa 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -851,7 +851,7 @@
 						@Override
 						public void onContextMenuClick(int itemId, int pos, boolean isChecked, DialogInterface dialog) {
 							if (getMyApplication().getWaypointHelper().isRouteCalculated()) {
-								WaypointDialogHelper.showWaypointsDialog(getMyApplication(), mapActivity);
+								WaypointDialogHelper.showWaypointsDialog(mapActivity);
 							} else {
 								openIntermediatePointsDialog();
 							}
