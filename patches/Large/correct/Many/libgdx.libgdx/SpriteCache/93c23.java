diff --git a/gdx/src/com/badlogic/gdx/graphics/SpriteCache.java b/gdx/src/com/badlogic/gdx/graphics/SpriteCache.java
index 36a90f3..4a62d3c 100644
--- a/gdx/src/com/badlogic/gdx/graphics/SpriteCache.java
+++ b/gdx/src/com/badlogic/gdx/graphics/SpriteCache.java
@@ -99,7 +99,7 @@
 	 */
 	public void beginCache () {
 		if (currentCache != null) throw new IllegalStateException("endCache must be called before begin.");
-		currentCache = new Cache(caches.size(), mesh.getNumVertices() / 2 * 6);
+		currentCache = new Cache(caches.size(), mesh.getNumVertices() / 4 * 6);
 		caches.add(currentCache);
 		mesh.getVerticesBuffer().compact();
 	}
@@ -536,7 +536,7 @@
 		if (!drawing) throw new IllegalStateException("SpriteCache.begin must be called before draw.");
 
 		Cache cache = caches.get(cacheID);
-		offset = offset * 12 + cache.offset;
+		offset = offset * 6 + cache.offset;
 		length *= 6;
 		Texture[] textures = cache.textures;
 		int[] counts = cache.counts;
