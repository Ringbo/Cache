diff --git a/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java b/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
index 6b373ad..b062b6b 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
@@ -35,8 +35,8 @@
 
 	private static final int SHOW_ZOOM_LEVEL_MSG_ID = 3;
 	private static final int SHOW_ZOOM_LEVEL_DELAY = 2000;
-	//private static final float ZOOM_DELTA = 1;
-	private static final float ZOOM_DELTA = OsmandMapTileView.ZOOM_DELTA_1; 
+	private static final float ZOOM_DELTA = 1;
+//	private static final float ZOOM_DELTA = OsmandMapTileView.ZOOM_DELTA_1; 
 	
 
 	private OsmandMapTileView view;
@@ -312,9 +312,9 @@
 			@Override
 			public void onClick(View v) {
 				if (view.isZooming()) {
-					activity.changeZoom(view.getZoom() + 2 * ZOOM_DELTA);
+					activity.changeZoom(view.getFloatZoom() + 2 * ZOOM_DELTA);
 				} else {
-					activity.changeZoom(view.getZoom() + 1 * ZOOM_DELTA);
+					activity.changeZoom(view.getFloatZoom() + 1 * ZOOM_DELTA);
 				}
 
 			}
