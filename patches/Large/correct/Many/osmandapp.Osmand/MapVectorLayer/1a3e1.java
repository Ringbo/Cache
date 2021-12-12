diff --git a/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java b/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
index 8790f61..822c331 100644
--- a/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
+++ b/OsmAnd/src/net/osmand/plus/render/MapVectorLayer.java
@@ -117,7 +117,7 @@
 				if (st.MAP_TRANSPARENCY.get() != cachedMapTransparency) {
 					cachedMapTransparency = st.MAP_TRANSPARENCY.get();
 					MapLayerConfiguration mapLayerConfiguration = new MapLayerConfiguration();
-					mapLayerConfiguration.setOpacity(((float)cachedMapTransparency) / 255.0f);
+					mapLayerConfiguration.setOpacityFactor(((float)cachedMapTransparency) / 255.0f);
 					mapRenderer.setMapLayerConfiguration(0, mapLayerConfiguration);
 				}
 				if (!Algorithms.objectEquals(st.MAP_OVERLAY.get(), cachedOverlay)) {
@@ -135,7 +135,7 @@
 				if (st.MAP_OVERLAY_TRANSPARENCY.get() != cachedOverlayTransparency) {
 					cachedOverlayTransparency = st.MAP_OVERLAY_TRANSPARENCY.get();
 					MapLayerConfiguration mapLayerConfiguration = new MapLayerConfiguration();
-					mapLayerConfiguration.setOpacity(((float)cachedOverlayTransparency) / 255.0f);
+					mapLayerConfiguration.setOpacityFactor(((float)cachedOverlayTransparency) / 255.0f);
 					mapRenderer.setMapLayerConfiguration(1, mapLayerConfiguration);
 				}
 				// opengl renderer
