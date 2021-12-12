diff --git a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
index 3119531..b956aa4 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
@@ -335,7 +335,7 @@
 						} else if (type == POI) {
 							getVoiceRouter().approachPoi(lastKnownLocation, approachPoints);
 						} else if (type == ALARMS) {
-							EnumSet<AlarmInfoType> ait = EnumSet.noneOf(AlarmInfoType.class);
+							EnumSet<AlarmInfoType> ait = EnumSet.allOf(AlarmInfoType.class);
 							for(LocationPointWrapper pw : announcePoints) {
 								ait.add(((AlarmInfo) pw.point).getType());
 							}
