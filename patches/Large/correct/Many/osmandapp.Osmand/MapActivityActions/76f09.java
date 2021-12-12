diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 49ab337..5650132 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -803,7 +803,7 @@
 				} else if (standardId == R.string.context_menu_item_intermediate_point) {
 					// Issue 1929: Consistently show IntermediatePointDialog, without subsequent Directions screen
 					//targets.navigateToPoint(new LatLon(latitude, longitude), true, targets.getIntermediatePoints().size());
-					int sz = targetPointsHelper.getIntermediatePoints().size();
+					int sz = targets.getIntermediatePoints().size();
 					settings.insertIntermediatePoint(latitude, longitude, "x", sz, false); //$NON-NLS-1$
 					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
 				// For button-less search UI
