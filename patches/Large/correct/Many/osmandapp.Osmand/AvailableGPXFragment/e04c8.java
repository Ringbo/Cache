diff --git a/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java b/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
index e49b96c..4a9e3d7 100644
--- a/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/activities/AvailableGPXFragment.java
@@ -437,7 +437,7 @@
 				}
 			}
 		};
-		if(info.gpx != null){
+		if(info.gpx != null && info.file != null){
 			if(getMyApplication().getSelectedGpxHelper().getSelectedFileByPath(info.file.getAbsolutePath()) == null) {
 			adapter.item(R.string.local_index_select_gpx_file).listen(listener).reg();
 		} else {
