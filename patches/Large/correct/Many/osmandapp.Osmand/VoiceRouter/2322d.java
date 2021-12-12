diff --git a/OsmAnd/src/net/osmand/plus/activities/VoiceRouter.java b/OsmAnd/src/net/osmand/plus/activities/VoiceRouter.java
index c32c3d5..90ce969 100644
--- a/OsmAnd/src/net/osmand/plus/activities/VoiceRouter.java
+++ b/OsmAnd/src/net/osmand/plus/activities/VoiceRouter.java
@@ -84,14 +84,14 @@
 			PREPARE_DISTANCE_END = 370; // 70 seconds
 			TURN_IN_DISTANCE = 230; // 40 seconds
 			TURN_IN_DISTANCE_END = 90; // 16 seconds
-			TURN_DISTANCE = 55; // 11 seconds  
+			TURN_DISTANCE = 45; // 9 seconds  
 			DEFAULT_SPEED = 5;
 		} else {
 			PREPARE_DISTANCE = 730; // 60 seconds
 			PREPARE_DISTANCE_END = 530; // 45 seconds
 			TURN_IN_DISTANCE = 330; // 25 seconds
 			TURN_IN_DISTANCE_END = 160; // 14 seconds
-			TURN_DISTANCE = 75; // 6 seconds 
+			TURN_DISTANCE = 60; // 5 seconds 
 			DEFAULT_SPEED = 12;
 		}
 	}
@@ -169,7 +169,7 @@
 		
 		RouteDirectionInfo nextNext = router.getNextNextRouteDirectionInfo();
 		if(statusNotPassed(STATUS_TURN) && isDistanceLess(speed, dist, TURN_DISTANCE)){
-			if(isDistanceLess(speed, next.distance, TURN_DISTANCE) || next.distance < TURN_IN_DISTANCE_END) {
+			if(/*isDistanceLess(speed, next.distance, TURN_DISTANCE) || */next.distance < TURN_IN_DISTANCE_END) {
 				playMakeTurnRightNow(next, nextNext);
 			} else {
 				playMakeTurnRightNow(next, null);
