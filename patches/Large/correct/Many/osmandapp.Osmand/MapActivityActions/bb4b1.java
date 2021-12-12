diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 022ed8e..d0a66f6 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -804,14 +804,14 @@
 					// Issue 1929 TODO: insert navigatePointDialog, but without Directions:
 					navigatePointDialogAndLaunchMap(mapActivity, latitude, longitude, null);
 					//targets.navigateToPoint(new LatLon(latitude, longitude), true, targets.getIntermediatePoints().size());
-					MapActivity.launchMapActivityMoveToTop(act);
+					MapActivity.launchMapActivityMoveToTop(mapActivity);
 					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
 				// For button-less search UI
 				} else if (standardId == R.string.context_menu_item_destination_point) {
 					// Issue 1929 TODO: insert navigatePointDialog, but without Directions:
 					navigatePointDialogAndLaunchMap(mapActivity, latitude, longitude, null);
 					//targets.navigateToPoint(new LatLon(latitude, longitude), true, -1);
-					MapActivity.launchMapActivityMoveToTop(act);
+					MapActivity.launchMapActivityMoveToTop(mapActivity);
 					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
 				} else if (standardId == R.string.context_menu_item_share_location) {
 					shareLocation(latitude, longitude, mapActivity.getMapView().getZoom());
