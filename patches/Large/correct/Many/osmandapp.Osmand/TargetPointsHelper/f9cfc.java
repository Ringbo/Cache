diff --git a/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java b/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
index 5d06ca2..804e19b 100644
--- a/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
+++ b/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
@@ -229,7 +229,7 @@
 	public void updateRouteAndReferesh(boolean updateRoute) {
 		//Fix for Issue 2136(b-d) (i.e. after Destination has been deleted)
 		if (pointToNavigate == null) {
-			mapActivity.getMapActions().stopNavigationWithoutConfirm();
+			MapActivity.getMapActions().stopNavigationWithoutConfirm();
 		}
 
 		if(updateRoute && ( routingHelper.isRouteBeingCalculated() || routingHelper.isRouteCalculated() ||
