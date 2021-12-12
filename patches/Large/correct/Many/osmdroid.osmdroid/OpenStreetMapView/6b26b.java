diff --git a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
index 758ef5e..91cd0d7 100644
--- a/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
+++ b/osmdroid-android/src/org/andnav/osm/views/OpenStreetMapView.java
@@ -139,7 +139,7 @@
 		} else {
 			if (attrs != null) {
 				final String rendererAttr = attrs.getAttributeValue(null, "renderer");
-				if (renderer != null) {
+				if (rendererAttr != null) {
 					try {
 						final OpenStreetMapRendererInfo r = OpenStreetMapRendererInfo.valueOf(rendererAttr);
 						logger.info("Using renderer specified in layout attributes: " + r);
