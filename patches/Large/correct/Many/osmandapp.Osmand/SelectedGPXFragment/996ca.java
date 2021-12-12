diff --git a/OsmAnd/src/net/osmand/plus/activities/SelectedGPXFragment.java b/OsmAnd/src/net/osmand/plus/activities/SelectedGPXFragment.java
index 801f1d0..fbe09d0 100644
--- a/OsmAnd/src/net/osmand/plus/activities/SelectedGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/SelectedGPXFragment.java
@@ -139,7 +139,7 @@
 				if (resId == R.string.show_gpx_route) {
 					OsmandSettings settings = getMyApplication().getSettings();
 					settings.setMapLocationToShow(gpxDisplayItem.locationStart.lat, gpxDisplayItem.locationStart.lon,
-							settings.getLastKnownMapZoom(), gpxDisplayItem.name);
+							settings.getLastKnownMapZoom(), Html.fromHtml(gpxDisplayItem.name).toString());
 					MapActivity.launchMapActivityMoveToTop(getActivity());
 				}
 			}
@@ -266,7 +266,7 @@
 			@Override
 			public void onClick(DialogInterface dialog, int which) {
 				if(!vis.isChecked()) {
-					getMyApplication().getSelectedGpxHelper().selectGpxFile(model.getGpx(), false);
+					getMyApplication().getSelectedGpxHelper().selectGpxFile(model.getGpx(), false, false);
 					
 					SelectedGPXFragment.this.adapter.setDisplayGroups(selectedGpxHelper.getDisplayGroups());
 				} else {
