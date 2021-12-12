diff --git a/OsmAnd/src/net/osmand/plus/views/OsmandMapLayer.java b/OsmAnd/src/net/osmand/plus/views/OsmandMapLayer.java
index 866c54e..d4f3fb4 100644
--- a/OsmAnd/src/net/osmand/plus/views/OsmandMapLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/OsmandMapLayer.java
@@ -383,7 +383,7 @@
 			OsmandRenderer renderer = app.getResourceManager().getRenderer().getRenderer();
 			RenderingRulesStorage rrs = app.getRendererRegistry().getCurrentSelectedRenderer();
 			final boolean isNight = settings != null && settings.isNightMode();
-			int hsh = calculateHash(rrs, isNight, tileBox.getMapDensity());
+			int hsh = calculateHash(rrs, isNight, tileBox.getDensity());
 			if (hsh != cachedHash) {
 				cachedHash = hsh;
 				if (rrs != null) {
@@ -391,7 +391,7 @@
 					req.setBooleanFilter(rrs.PROPS.R_NIGHT_MODE, isNight);
 					if (req.searchRenderingAttribute(renderingAttribute)) {
 						RenderingContext rc = new OsmandRenderer.RenderingContext(app);
-						rc.setDensityValue((float) tileBox.getMapDensity());
+						rc.setDensityValue((float) tileBox.getDensity());
 						// cachedColor = req.getIntPropertyValue(rrs.PROPS.R_COLOR);
 						renderer.updatePaint(req, paint, 0, false, rc);
 						isPaint2 = renderer.updatePaint(req, paint2, 1, false, rc);
