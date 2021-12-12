diff --git a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
index e9fc9d8..510fcb8 100644
--- a/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
+++ b/OsmAnd/src/net/osmand/plus/routing/RouteCalculationResult.java
@@ -191,7 +191,7 @@
 				loc.setLongitude(MapUtils.get31LongitudeX(x31));
 				AlarmInfo info = AlarmInfo.createAlarmInfo(typeRule, locInd, loc);
 				// For STOP first check if it has directional info
-				if ((info != null) && !((info.getType() == AlarmInfoType.STOP) && res.getObject().isStopApplicable(res.isForwardDirection(), intId))) {
+				if ((info != null) && !((info.getType() == AlarmInfoType.STOP) && !res.getObject().isStopApplicable(res.isForwardDirection(), intId))) {
 					alarms.add(info);
 				}
 			}
