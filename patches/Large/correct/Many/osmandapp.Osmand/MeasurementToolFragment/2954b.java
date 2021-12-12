diff --git a/OsmAnd/src/net/osmand/plus/measurementtool/MeasurementToolFragment.java b/OsmAnd/src/net/osmand/plus/measurementtool/MeasurementToolFragment.java
index 3345225..1ecb43e 100644
--- a/OsmAnd/src/net/osmand/plus/measurementtool/MeasurementToolFragment.java
+++ b/OsmAnd/src/net/osmand/plus/measurementtool/MeasurementToolFragment.java
@@ -754,7 +754,7 @@
 
 			ImageButton snapToRoadBtn = (ImageButton) mapActivity.findViewById(R.id.snap_to_road_image_button);
 			snapToRoadBtn.setBackgroundResource(nightMode ? R.drawable.btn_circle_night : R.drawable.btn_circle);
-			snapToRoadBtn.setImageDrawable(getActiveIcon(appMode.getSmallIconDark()));
+			snapToRoadBtn.setImageDrawable(getActiveIcon(appMode.getMapIconId()));
 			snapToRoadBtn.setOnClickListener(new View.OnClickListener() {
 				@Override
 				public void onClick(View view) {
