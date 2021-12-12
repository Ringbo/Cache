diff --git a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
index 45c1a79..e28d00d 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
@@ -95,7 +95,7 @@
 		lanesControl = ric.createLanesControl(map, view);
 		
 		streetNameView = new MapInfoWidgetsFactory.TopTextView(map.getMyApplication(), map);
-		updateStreetName(calculateTextState());
+		updateStreetName(false, calculateTextState());
 		
 		alarmControl = ric.createAlarmInfoControl(app, map);
 		alarmControl.setVisibility(false);
