diff --git a/OsmAnd/src/net/osmand/plus/render/RendererRegistry.java b/OsmAnd/src/net/osmand/plus/render/RendererRegistry.java
index 56a1d1f..2c7f300 100644
--- a/OsmAnd/src/net/osmand/plus/render/RendererRegistry.java
+++ b/OsmAnd/src/net/osmand/plus/render/RendererRegistry.java
@@ -187,7 +187,7 @@
 	}
 
 	public File getFileForInternalStyle(String name) {
-		if(internalRenderers.containsKey(name)) {
+		if(!internalRenderers.containsKey(name)) {
 			return new File(app.getAppPath(IndexConstants.RENDERERS_DIR), "style.render.xml");
 		}
 		File fl = new File(app.getAppPath(IndexConstants.RENDERERS_DIR), internalRenderers.get(name));
