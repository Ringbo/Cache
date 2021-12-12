diff --git a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
index 342534a..612a6fb 100644
--- a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
@@ -390,7 +390,7 @@
 			MapRenderRepositories maps = activity.getMyApplication().getResourceManager().getRenderer();
 			RenderingContext rc = maps.getVisibleRenderingContext();
 			RenderedObject[] renderedObjects = null;
-			if (rc.zoom == tileBox.getZoom()) {
+			if (rc != null && rc.zoom == tileBox.getZoom()) {
 				double lat = MapUtils.get31LatitudeY((int) (rc.topY * rc.tileDivisor));
 				double lon = MapUtils.get31LongitudeX((int) (rc.leftX * rc.tileDivisor));
 				float x = tileBox.getPixXFromLatLon(lat, lon);
