diff --git a/OsmAnd-java/src/net/osmand/router/RoutePlannerFrontEnd.java b/OsmAnd-java/src/net/osmand/router/RoutePlannerFrontEnd.java
index 9ffae73..4d7ef34 100644
--- a/OsmAnd-java/src/net/osmand/router/RoutePlannerFrontEnd.java
+++ b/OsmAnd-java/src/net/osmand/router/RoutePlannerFrontEnd.java
@@ -334,7 +334,7 @@
 			runRecalculation = rlist.size() > 0;
 			if (rlist.size() > 0) {
 				RouteSegment previous = null;
-				for (int i = 0; i < rlist.size() - 1; i++) {
+				for (int i = 0; i <= rlist.size() - 1; i++) {
 					RouteSegmentResult rr = rlist.get(i);
 					RouteSegment segment = new RouteSegment(rr.getObject(), rr.getEndPointIndex());
 					if (previous != null) {
