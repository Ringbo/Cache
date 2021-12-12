diff --git a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
index 01cde4b..f1bf559 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/GpxUiHelper.java
@@ -381,7 +381,7 @@
 					public void onClick(DialogInterface dialog, int which) {
 
 						int position = selectedPosition[0];
-						if (position != -1) {
+						if (position != -1 && position < list.size()) {
 							if (showCurrentGpx && position == 0) {
 								callbackWithObject.processResult(null);
 								app.getSettings().LAST_SELECTED_GPX_TRACK_FOR_NEW_POINT.set(null);
