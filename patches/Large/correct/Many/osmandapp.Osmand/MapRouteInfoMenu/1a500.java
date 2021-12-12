diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/MapRouteInfoMenu.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/MapRouteInfoMenu.java
index 00baf41..3165abc 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/MapRouteInfoMenu.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/other/MapRouteInfoMenu.java
@@ -306,7 +306,7 @@
 					}
 				}
 
-				if (startPoint != null) {
+				if (startPoint != null && endPoint != null) {
 					targetPointsHelper.navigateToPoint(startPoint.point, false, -1, startPoint.getPointDescription(mapActivity));
 					targetPointsHelper.setStartPoint(endPoint.point, false, endPoint.getPointDescription(mapActivity));
 					targetPointsHelper.updateRouteAndRefresh(true);
