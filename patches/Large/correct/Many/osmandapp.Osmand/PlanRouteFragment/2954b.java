diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
index b550660..1909b7c 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/PlanRouteFragment.java
@@ -650,7 +650,7 @@
 		if (mapActivity != null) {
 			final ImageButton appModesBtn = (ImageButton) mapActivity.findViewById(R.id.snap_to_road_image_button);
 			appModesBtn.setBackgroundResource(nightMode ? R.drawable.btn_circle_night : R.drawable.btn_circle);
-			appModesBtn.setImageDrawable(getActiveIcon(planRouteContext.getSnappedMode().getSmallIconDark()));
+			appModesBtn.setImageDrawable(getActiveIcon(planRouteContext.getSnappedMode().getMapIconId()));
 			appModesBtn.setOnClickListener(new View.OnClickListener() {
 				@Override
 				public void onClick(View view) {
