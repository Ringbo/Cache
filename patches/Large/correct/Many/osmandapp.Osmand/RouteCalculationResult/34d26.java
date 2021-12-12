diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
index 49c4df6..b4341fc 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
@@ -246,9 +246,9 @@
 
 			if(turn != null) {
 				RouteDirectionInfo info = new RouteDirectionInfo(s.getSegmentSpeed(), turn);
-                if (routeInd + 1 < list.size()) {
+                if (routeInd  < list.size()) {
                     int lind = routeInd;
-                    if(turn.isRoundAbout() && routeInd + 2 < list.size()) {
+                    if(turn.isRoundAbout() && routeInd + 1 < list.size()) {
                         // take next name for roundabout (not roundabout name)
                         lind = routeInd + 1;
                     }
