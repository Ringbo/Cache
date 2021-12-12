diff --git a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
index baaf725..f88ef7f 100644
--- a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
+++ b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
@@ -468,7 +468,7 @@
 			} else {
 				playMakeTurn(currentSegment, next, null);
 			}
-			if (nextNextInfo.distanceTo < TURN_IN_DISTANCE && isTargetPoint(nextNextInfo)) {
+			if (nextNextInfo.distanceTo < TURN_IN_DISTANCE_END && isTargetPoint(nextNextInfo)) {
 				if (!next.getTurnType().goAhead()) {  // Avoids isolated "and arrive.." prompt
 					playAndArriveAtDestination(nextNextInfo);
 				}
