diff --git a/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java b/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
index 0a861fe..ad196e8 100644
--- a/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
@@ -396,7 +396,8 @@
 			public void onContextMenuClick(int resId, int pos, boolean isChecked, DialogInterface dialog) {
 				if (resId == R.string.local_index_mi_rename) {
 					renameFile(info);
-				} else if (resId == R.string.local_index_unselect_gpx_file) {
+				} else if (resId == R.string.local_index_unselect_gpx_file ||
+						resId == R.string.local_index_select_gpx_file) {
 					getMyApplication().getSelectedGpxHelper().selectGpxFile(info.gpx, resId == R.string.local_index_select_gpx_file, true);
 					listAdapter.notifyDataSetChanged();
 					Runnable r = selectedGpxHelper.getUiListener();
