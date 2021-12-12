diff --git a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
index 32c4118..1817810 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
@@ -274,7 +274,7 @@
 
 					// For STOP first check if it has directional info
 					if (info != null && info.getType() != null && info.getType() == AlarmInfoType.STOP) {
-						if (ro.isStopApplicable(ro.bearingVsRouteDirection(loc), i)) {
+						if (!ro.isStopApplicable(ro.bearingVsRouteDirection(loc), i)) {
 							info = null;
 						}
 					}
