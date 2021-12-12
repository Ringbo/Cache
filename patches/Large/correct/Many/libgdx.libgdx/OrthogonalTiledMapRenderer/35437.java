diff --git a/gdx/src/com/badlogic/gdx/maps/tiled/renderers/OrthogonalTiledMapRenderer.java b/gdx/src/com/badlogic/gdx/maps/tiled/renderers/OrthogonalTiledMapRenderer.java
index 111d18a..26f95cd 100644
--- a/gdx/src/com/badlogic/gdx/maps/tiled/renderers/OrthogonalTiledMapRenderer.java
+++ b/gdx/src/com/badlogic/gdx/maps/tiled/renderers/OrthogonalTiledMapRenderer.java
@@ -86,11 +86,11 @@
 		final int row1 = Math.max(0, (int)(viewBounds.y / layerTileHeight));
 		final int row2 = Math.min(layerHeight, (int)((viewBounds.y + viewBounds.height + layerTileHeight) / layerTileHeight));
 
-		float y = row1 * layerTileHeight;
+		float y = row2 * layerTileHeight;
 		float xStart = col1 * layerTileWidth;
 		final float[] vertices = this.vertices;
 
-		for (int row = row1; row < row2; row++) {
+		for (int row = row2; row >= row1; row--) {
 			float x = xStart;
 			for (int col = col1; col < col2; col++) {
 				final TiledMapTileLayer.Cell cell = layer.getCell(col, row);
@@ -208,7 +208,7 @@
 				}
 				x += layerTileWidth;
 			}
-			y += layerTileHeight;
+			y -= layerTileHeight;
 		}
 	}
 }
