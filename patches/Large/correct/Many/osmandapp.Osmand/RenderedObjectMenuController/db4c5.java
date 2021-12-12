diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/RenderedObjectMenuController.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/RenderedObjectMenuController.java
index 75ee408..3c9d983 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/RenderedObjectMenuController.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/controllers/RenderedObjectMenuController.java
@@ -86,9 +86,9 @@
 		boolean osmEditingEnabled = OsmandPlugin.getEnabledPlugin(OsmEditingPlugin.class) != null;
 		if (osmEditingEnabled && renderedObject.getId() != null
 				&& renderedObject.getId() > 0 && 
-				(renderedObject.getId() % 2 == 0 || (renderedObject.getId() >> 7) < Integer.MAX_VALUE)) {
+				(renderedObject.getId() % 2 == 1 || (renderedObject.getId() >> 7) < Integer.MAX_VALUE)) {
 			String link;
-			if ((renderedObject.getId() >> 6) % 2 != 0) {
+			if ((renderedObject.getId() >> 6) % 2 == 1) {
 				link = "http://www.openstreetmap.org/node/";
 			} else {
 				link = "http://www.openstreetmap.org/way/";
