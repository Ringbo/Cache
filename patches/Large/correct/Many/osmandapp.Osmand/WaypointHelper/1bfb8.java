diff --git a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
index d160a8b..3119531 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/WaypointHelper.java
@@ -523,13 +523,13 @@
 	private void calculateAlarms(RouteCalculationResult route, List<LocationPointWrapper> array) {
 		for(AlarmInfo i : route.getAlarmInfo()) {
 			if(i.getType() == AlarmInfoType.SPEED_CAMERA) {
-				if(app.getSettings().SHOW_CAMERAS.get()){
+				if(app.getSettings().SHOW_CAMERAS.get() || app.getSettings().SPEAK_SPEED_CAMERA.get()){
 					LocationPointWrapper lw = new LocationPointWrapper(route, ALARMS, i, 0, i.getLocationIndex());	
 					lw.setAnnounce(app.getSettings().SPEAK_SPEED_CAMERA.get());
 					array.add(lw);
 				}
 			} else {
-				if(app.getSettings().SHOW_TRAFFIC_WARNINGS.get()){
+				if(app.getSettings().SHOW_TRAFFIC_WARNINGS.get() || app.getSettings().SPEAK_TRAFFIC_WARNINGS.get()){
 					LocationPointWrapper lw = new LocationPointWrapper(route, ALARMS, i, 0, i.getLocationIndex());	
 					lw.setAnnounce(app.getSettings().SPEAK_TRAFFIC_WARNINGS.get());
 					array.add(lw);
@@ -591,8 +591,9 @@
 	}
 	
 	public boolean showAlarms() {
-		return app.getSettings().SPEAK_SPEED_CAMERA.get() || 
-				app.getSettings().SPEAK_TRAFFIC_WARNINGS.get();
+		// I think this line was a bug:
+		//return app.getSettings().SPEAK_SPEED_CAMERA.get() || app.getSettings().SPEAK_TRAFFIC_WARNINGS.get();
+		return app.getSettings().SHOW_CAMERAS.get() || app.getSettings().SHOW_TRAFFIC_WARNINGS.get();
 	}
 	
 	public boolean announceFavorites() {
