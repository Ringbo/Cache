diff --git a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
index 7feb2e2..32f5087 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
@@ -544,7 +544,7 @@
 						if (d >= 0 && !showMiniMap) {
 							visible = true;
 							RouteDirectionInfo next = routeLayer.getHelper().getNextRouteDirectionInfo();
-							if (next == null) {
+							if (next == null || next.turnType == null) {
 								if (turnType != null) {
 									turnType = null;
 									invalidate();
