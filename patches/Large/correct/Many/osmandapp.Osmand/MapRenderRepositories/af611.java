diff --git a/OsmAnd/src/net/osmand/render/MapRenderRepositories.java b/OsmAnd/src/net/osmand/render/MapRenderRepositories.java
index caab9f6..8e1e8ed 100644
--- a/OsmAnd/src/net/osmand/render/MapRenderRepositories.java
+++ b/OsmAnd/src/net/osmand/render/MapRenderRepositories.java
@@ -196,7 +196,7 @@
 		return false;
 	}
 	
-	private boolean loadVectorData(RectF dataBox, final int zoom, BaseOsmandRender renderingType){
+	private boolean loadVectorData(RectF dataBox, final int zoom, final BaseOsmandRender renderingType){
 		double cBottomLatitude = dataBox.bottom;
 		double cTopLatitude = dataBox.top;
 		double cLeftLongitude = dataBox.left;
@@ -223,7 +223,7 @@
 			int bottomY = MapUtils.get31TileNumberY(cBottomLatitude);
 			int topY = MapUtils.get31TileNumberY(cTopLatitude);
 			searchRequest = BinaryMapIndexReader.buildSearchRequest(leftX, rightX, topY, bottomY, zoom);
-			if (zoom < 15) {
+			if (zoom < 17) {
 				searchRequest.setSearchFilter(new BinaryMapIndexReader.SearchFilter() {
 
 					@Override
@@ -232,7 +232,7 @@
 							int type = types.get(j);
 							int mask = type & 3;
 							TagValuePair pair = root.decodeType(type);
-							if (renderingType.isObjectVisible(pair.tag, pair.value, zoom, mask)) {
+							if (pair != null && renderingType.isObjectVisible(pair.tag, pair.value, zoom, mask)) {
 								return true;
 							}
 						}
@@ -328,7 +328,7 @@
 					dataBox.top -= hi;
 					dataBox.bottom += hi;
 				}
-				boolean loaded = loadVectorData(dataBox, requestedBox.getZoom(), MapRenderingTypes.getDefault());
+				boolean loaded = loadVectorData(dataBox, requestedBox.getZoom(), renderingType);
 				if (!loaded || checkWhetherInterrupted()) {
 					return;
 				}
