diff --git a/OsmAnd-java/src/net/osmand/router/BinaryRoutePlanner.java b/OsmAnd-java/src/net/osmand/router/BinaryRoutePlanner.java
index ac61390..dfbf11f 100644
--- a/OsmAnd-java/src/net/osmand/router/BinaryRoutePlanner.java
+++ b/OsmAnd-java/src/net/osmand/router/BinaryRoutePlanner.java
@@ -554,8 +554,9 @@
 			RouteSegment from = !reverseWaySearch ? getParentDiffId(segment) : getParentDiffId(opposite);
 			if (checkViaRestrictions(from, to)) {
 				FinalRouteSegment frs = new FinalRouteSegment(road, segmentPoint);
+				// obstacles already count on backward calculation (so don't include obstaclesTime)
 				float distStartObstacles = segment.distanceFromStart
-						+ calculateTimeWithObstacles(ctx, road, segmentDist, obstaclesTime);
+						+ calculateTimeWithObstacles(ctx, road, segmentDist, 0);
 				frs.setParentRoute(segment);
 				frs.setParentSegmentEnd(segmentPoint);
 				frs.reverseWaySearch = reverseWaySearch;
@@ -781,7 +782,7 @@
 					segment, segmentPoint);
 			distFromStart += obstaclesTime;
 			if (TEST_SPECIFIC && next.road.getId() >> 6 == TEST_ID) {
-				printRoad(" !? distFromStart=" + +distFromStart + " from " + segment.getRoad().getId() +
+				printRoad(" !? distFromStart=" +distFromStart + " from " + segment.getRoad().getId() +
 						" dir=" + segment.getDirectionAssigned() +
 						" distToEnd=" + distanceToEnd +
 						" segmentPoint=" + segmentPoint + " -- ", next, true);
@@ -793,7 +794,7 @@
 					next.distanceFromStart = distFromStart;
 					next.distanceToEnd = distanceToEnd;
 					if (TRACE_ROUTING) {
-						printRoad("  >>", next, null);
+						printRoad(" "+segmentPoint+">>" , next, null);
 					}
 					// put additional information to recover whole route after
 					next.setParentRoute(segment);
