diff --git a/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java b/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
index f834d38..568b997 100644
--- a/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
+++ b/OsmAnd/src/net/osmand/plus/TargetPointsHelper.java
@@ -474,7 +474,7 @@
 
 
 	public boolean hasTooLongDistanceToNavigate() {
-		if(settings.ROUTER_SERVICE.get() != RouteService.OSMAND) {
+		if(settings.ROUTER_SERVICE.getModeValue(routingHelper.getAppMode()) != RouteService.OSMAND) {
 			return false;
 		}
 		Location current = routingHelper.getLastProjection();
