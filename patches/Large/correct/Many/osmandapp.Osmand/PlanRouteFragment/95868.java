diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
index a6cf75f..2e3e50a 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
@@ -670,7 +670,7 @@
 	}
 
 	public boolean quit(boolean hideMarkersListFirst) {
-		if (planRouteContext.isMarkersListOpened() && hideMarkersListFirst) {
+		if (portrait && planRouteContext.isMarkersListOpened() && hideMarkersListFirst) {
 			showHideMarkersList();
 			return false;
 		} else {
