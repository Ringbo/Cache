diff --git a/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java b/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
index ffe7df7..577adeb 100644
--- a/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
@@ -390,7 +390,7 @@
 					r.setMinZoom(Integer.parseInt(minZoom.getText().toString()));
 					r.setMaxZoom(Integer.parseInt(maxZoom.getText().toString()));
 					r.setEllipticYTile(elliptic.isChecked());
-					r.setUrlToLoad(urlToLoad.getText().toString().isEmpty() ? null : urlToLoad.getText().toString().replace("{$x}", "{1}")
+					r.setUrlToLoad(urlToLoad.getText().toString().equals("") ? null : urlToLoad.getText().toString().replace("{$x}", "{1}")
 							.replace("{$y}", "{2}").replace("{$z}", "{0}"));
 					if (r != null && r.getName().length() > 0) {
 						if (settings.installTileSource(r)) {
