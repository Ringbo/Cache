diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
index c1e405e..eaf9bb3 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivity.java
@@ -131,7 +131,7 @@
 	private RouteAnimation routeAnimation = new RouteAnimation();
 
 	// this remembers the isMapLinkedToLocation state after map loses focus
-	private boolean linkMapToLocation = false;
+	private static boolean linkMapToLocation = false;
 
 	private boolean isMapLinkedToLocation = false;
 	private ProgressDialog startProgressDialog;
@@ -1384,6 +1384,7 @@
 	}
 	
 	public static void launchMapActivityMoveToTop(Context activity){
+		// linkMapToLocation memory needs to be reset if coming back from search or similar action
 		linkMapToLocation = false;
 		Intent newIntent = new Intent(activity, OsmandIntents.getMapActivity());
 		newIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
