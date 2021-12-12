diff --git a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
index e2e227d..84ddef5 100644
--- a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
@@ -811,7 +811,7 @@
 
 		boolean processed = hideVisibleMenues();
 		processed |= menu.onSingleTapOnMap();
-		if (!processed && activity.getMyApplication().getSettings().MAP_EMPTY_STATE_ENABLED.get()) {
+		if (!processed && activity.getMyApplication().getSettings().MAP_EMPTY_STATE_ALLOWED.get()) {
 			activity.getMapLayers().getMapControlsLayer().switchMapControlsVisibility(true);
 		}
 		return false;
