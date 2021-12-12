diff --git a/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java b/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
index 73e799d..a942dc4 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapControlsLayer.java
@@ -45,7 +45,7 @@
 	private static final int SHOW_ZOOM_LEVEL_MSG_ID = OsmAndConstants.UI_HANDLER_MAP_CONTROLS + 1;
 	private static final int SHOW_ZOOM_BUTTON_MSG_ID = OsmAndConstants.UI_HANDLER_MAP_CONTROLS + 2;
 	private static final int SHOW_ZOOM_LEVEL_DELAY = 1000;
-	private static final int SHOW_ZOOM_LEVEL_BUTTON_DELAY = 2500;
+	private static final int SHOW_ZOOM_LEVEL_BUTTON_DELAY = 1500;
 	
 
 	private OsmandMapTileView view;
@@ -274,7 +274,7 @@
 			}
 
 		});
-		msg.what = SHOW_ZOOM_LEVEL_BUTTON_DELAY;
+		msg.what = SHOW_ZOOM_BUTTON_MSG_ID;
 		showUIHandler.sendMessageDelayed(msg, SHOW_ZOOM_LEVEL_BUTTON_DELAY);
 	}
 
