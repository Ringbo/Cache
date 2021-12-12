diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/superkoalio/SuperKoalio.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/superkoalio/SuperKoalio.java
index ec80980..73f13c3 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/superkoalio/SuperKoalio.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/superkoalio/SuperKoalio.java
@@ -141,7 +141,7 @@
 		koala.stateTime += deltaTime;
 
 		// check input and apply to velocity & state
-		if ((Gdx.input.isKeyPressed(Keys.SPACE) || isTouched(0.75f, 1)) && koala.grounded) {
+		if ((Gdx.input.isKeyPressed(Keys.SPACE) || isTouched(0.5f, 1)) && koala.grounded) {
 			koala.velocity.y += Koala.JUMP_VELOCITY;
 			koala.state = Koala.State.Jumping;
 			koala.grounded = false;
@@ -219,7 +219,7 @@
 				if (koala.velocity.y > 0) {
 					koala.position.y = tile.y - Koala.HEIGHT;
 					// we hit a block jumping upwards, let's destroy it!
-					TiledMapTileLayer layer = (TiledMapTileLayer)map.getLayers().get(1);
+					TiledMapTileLayer layer = (TiledMapTileLayer)map.getLayers().get("walls");
 					layer.setCell((int)tile.x, (int)tile.y, null);
 				} else {
 					koala.position.y = tile.y + tile.height;
@@ -247,7 +247,7 @@
 		// check if any finge is touch the area between startX and endX
 		// startX/endX are given between 0 (left edge of the screen) and 1 (right edge of the screen)
 		for (int i = 0; i < 2; i++) {
-			float x = Gdx.input.getX() / (float)Gdx.graphics.getWidth();
+			float x = Gdx.input.getX(i) / (float)Gdx.graphics.getWidth();
 			if (Gdx.input.isTouched(i) && (x >= startX && x <= endX)) {
 				return true;
 			}
@@ -256,7 +256,7 @@
 	}
 
 	private void getTiles (int startX, int startY, int endX, int endY, Array<Rectangle> tiles) {
-		TiledMapTileLayer layer = (TiledMapTileLayer)map.getLayers().get(1);
+		TiledMapTileLayer layer = (TiledMapTileLayer)map.getLayers().get("walls");
 		rectPool.freeAll(tiles);
 		tiles.clear();
 		for (int y = startY; y <= endY; y++) {
