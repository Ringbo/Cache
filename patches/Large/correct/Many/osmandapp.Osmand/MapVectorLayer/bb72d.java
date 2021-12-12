diff --git a/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java b/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
index 0e5d6a7..187251e 100644
--- a/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
+++ b/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
@@ -93,7 +93,7 @@
 			if (mapRenderer != null) {
 				// opengl renderer
 				mapRenderer.setTarget(new PointI(tilesRect.getCenter31X(), tilesRect.getCenter31Y()));
-				mapRenderer.setAzimuth(tilesRect.getRotate());
+				mapRenderer.setAzimuth(-tilesRect.getRotate());
 				mapRenderer.setZoom((float) (tilesRect.getZoom() /*+ tilesRect.getZoomScale() */+ tilesRect.getZoomAnimation()));
 			} else {
 				if (!view.isZooming()) {
