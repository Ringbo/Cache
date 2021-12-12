diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 893ff0b..8296fef 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -1278,7 +1278,7 @@
 	}
     
     
-    public static void navigatePointDialogAndLaunchMap(final Activity act, final double lat, final double lon, final String name){
+    public void navigatePointDialogAndLaunchMap(final Activity act, final double lat, final double lon, final String name){
     	OsmandApplication ctx = (OsmandApplication) act.getApplication();
     	final TargetPointsHelper targetPointsHelper = ctx.getTargetPointsHelper();
     	final OsmandSettings settings = ctx.getSettings();
