diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashWaypointsFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashWaypointsFragment.java
index f20f3c8..1891a02 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashWaypointsFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashWaypointsFragment.java
@@ -156,7 +156,7 @@
 				return true;
 			}
 		});
-		boolean target = model == getMyApplication().getTargetPointsHelper().getPointToNavigate();
+		final boolean target = model == getMyApplication().getTargetPointsHelper().getPointToNavigate();
 		if(SHOW_ALL && getMyApplication().getTargetPointsHelper().getIntermediatePoints().size() > 0) {
 			final List<TargetPoint> allTargets = getMyApplication().getTargetPointsHelper().getIntermediatePointsWithTarget();
 			if (model.index > 0 || target) {
