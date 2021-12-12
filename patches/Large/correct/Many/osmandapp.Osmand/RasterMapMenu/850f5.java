diff --git a/OsmAnd/src/net/osmand/plus/dialogs/RasterMapMenu.java b/OsmAnd/src/net/osmand/plus/dialogs/RasterMapMenu.java
index 5bb7c68..70f8d10 100644
--- a/OsmAnd/src/net/osmand/plus/dialogs/RasterMapMenu.java
+++ b/OsmAnd/src/net/osmand/plus/dialogs/RasterMapMenu.java
@@ -44,13 +44,13 @@
 			mapTransparencyPreference = settings.MAP_OVERLAY_TRANSPARENCY;
 			mapTypePreference = settings.MAP_OVERLAY;
 			mapTypeString = R.string.map_overlay;
-			mapTypeString = R.string.overlay_transparency;
+			mapTypeStringTransparency = R.string.overlay_transparency;
 		} else if (type == OsmandRasterMapsPlugin.RasterMapType.UNDERLAY){
 			rasterMapLayer = plugin.getUnderlayLayer();
 			mapTransparencyPreference = settings.MAP_TRANSPARENCY;
 			mapTypePreference = settings.MAP_UNDERLAY;
 			mapTypeString = R.string.map_underlay;
-			mapTypeString = R.string.map_transparency;
+			mapTypeStringTransparency = R.string.map_transparency;
 		} else {
 			throw new RuntimeException("Unexpected raster map type");
 		}
