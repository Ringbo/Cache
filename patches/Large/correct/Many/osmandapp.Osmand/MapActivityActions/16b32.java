diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 8296fef..1a9a648 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -801,11 +801,13 @@
 						getDirections(loc, null, true);
 					}
 				} else if (standardId == R.string.context_menu_item_intermediate_point) {
+					// Issue 1929: navigatePointDialogAndLaunchMap(activity, latitude, longitude, null);
 					targets.navigateToPoint(new LatLon(latitude, longitude), 
 							true, targets.getIntermediatePoints().size());
 					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
 				// For button-less search UI
 				} else if (standardId == R.string.context_menu_item_destination_point) {
+					// Issue 1929: navigatePointDialogAndLaunchMap(activity, latitude, longitude, null);
 					targets.navigateToPoint(new LatLon(latitude, longitude), 
 							true, -1);
 					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
@@ -1278,7 +1280,7 @@
 	}
     
     
-    public void navigatePointDialogAndLaunchMap(final Activity act, final double lat, final double lon, final String name){
+    public static void navigatePointDialogAndLaunchMap(final Activity act, final double lat, final double lon, final String name){
     	OsmandApplication ctx = (OsmandApplication) act.getApplication();
     	final TargetPointsHelper targetPointsHelper = ctx.getTargetPointsHelper();
     	final OsmandSettings settings = ctx.getSettings();
@@ -1307,16 +1309,16 @@
 						settings.insertIntermediatePoint(lat, lon, name, 0, true);
 					}
 					targetPointsHelper.updatePointsFromSettings();
-					IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
-					//MapActivity.launchMapActivityMoveToTop(act);
+					// Issue 1929: IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
+					MapActivity.launchMapActivityMoveToTop(act);
 				}
 			});
     		builder.show();
     	} else {
     		settings.setPointToNavigate(lat, lon, true, name);
     		targetPointsHelper.updatePointsFromSettings();
-		IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
-		//MapActivity.launchMapActivityMoveToTop(act);
+		// Issue 1929: IntermediatePointsDialog.openIntermediatePointsDialog(mapActivity);
+		MapActivity.launchMapActivityMoveToTop(act);
     	}
     }
     
