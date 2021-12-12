diff --git a/OsmAnd/src/net/osmand/plus/mapillary/MapillaryPlugin.java b/OsmAnd/src/net/osmand/plus/mapillary/MapillaryPlugin.java
index 9cfd805..1eb7d18 100644
--- a/OsmAnd/src/net/osmand/plus/mapillary/MapillaryPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/mapillary/MapillaryPlugin.java
@@ -189,7 +189,7 @@
 
 	private TextInfoWidget createMonitoringControl(final MapActivity map) {
 		mapillaryControl = new TextInfoWidget(map);
-		mapillaryControl.setText("", map.getString(R.string.mapillary));
+		mapillaryControl.setText(map.getString(R.string.mapillary), "");
 		mapillaryControl.setIcons(R.drawable.widget_mapillary_day, R.drawable.widget_mapillary_night);
 		mapillaryControl.setOnClickListener(new View.OnClickListener() {
 			@Override
