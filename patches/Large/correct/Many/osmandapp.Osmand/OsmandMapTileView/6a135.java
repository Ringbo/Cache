diff --git a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
index 5148160..653124b 100644
--- a/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
+++ b/OsmAnd/src/net/osmand/plus/views/OsmandMapTileView.java
@@ -1061,13 +1061,13 @@
 		if (baseZoom > getMaxZoom()) {
 			return false;
 		}
-		if (baseZoom > getMaxZoom() - 1 && dz > 1) {
+		if (baseZoom > getMaxZoom() - 1 && dz >= 1) {
 			return false;
 		}
 		if (baseZoom < getMinZoom()) {
 			return false;
 		}
-		if (baseZoom < getMinZoom() + 1 && dz < -1) {
+		if (baseZoom < getMinZoom() + 1 && dz <= -1) {
 			return false;
 		}
 		return true;
