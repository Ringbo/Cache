diff --git a/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java b/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
index 9919141..f9ea823 100644
--- a/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
+++ b/OsmAnd/src/net/osmand/plus/myplaces/SelectedGPXFragment.java
@@ -335,7 +335,7 @@
 			public void onClick(DialogInterface dialog, int which) {
 				SelectedGpxFile sf = app.getSelectedGpxHelper().selectGpxFile(getGpx(), vis.isChecked(), false);
 				int clr = list.get(colorSpinner.getSelectedItemPosition());
-				if(!vis.isChecked() && clr != 0 && sf.getModifiableGpxFile() != null) {
+				if(vis.isChecked() && clr != 0 && sf.getModifiableGpxFile() != null) {
 					sf.getModifiableGpxFile().setColor(clr);
 					sf.processPoints();
 				}
