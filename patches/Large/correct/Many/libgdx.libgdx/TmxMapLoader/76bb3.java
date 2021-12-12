diff --git a/gdx/src/com/badlogic/gdx/maps/tiled/TmxMapLoader.java b/gdx/src/com/badlogic/gdx/maps/tiled/TmxMapLoader.java
index 40007f0..926da82 100644
--- a/gdx/src/com/badlogic/gdx/maps/tiled/TmxMapLoader.java
+++ b/gdx/src/com/badlogic/gdx/maps/tiled/TmxMapLoader.java
@@ -228,7 +228,7 @@
 				int localtid = tileElement.getIntAttribute("id", 0);
 				TiledMapTile tile = tileset.getTile(firstgid + localtid);
 				if (tile!= null) {
-					Element properties = element.getChildByName("properties");
+					Element properties = tileElement.getChildByName("properties");
 					if (properties != null) {
 						loadProperties(tile.getProperties(), properties);
 					}
