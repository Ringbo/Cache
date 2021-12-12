diff --git a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
index 0c7b344..91d3a52 100644
--- a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
+++ b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
@@ -420,7 +420,7 @@
 
 		NextDirectionInfo nextInfo = router.getNextRouteDirectionInfo(new NextDirectionInfo(), true);
 		RouteSegmentResult currentSegment = router.getCurrentSegmentResult();
-		if (nextInfo.directionInfo == null) {
+		if (nextInfo == null || nextInfo.directionInfo == null) {
 			return;
 		}
 		int dist = nextInfo.distanceTo;
