diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/BitmapFontFlipTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/BitmapFontFlipTest.java
index 4698dda..d86125a 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/BitmapFontFlipTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/BitmapFontFlipTest.java
@@ -147,7 +147,7 @@
 	}
 
 	private void renderCached () {
-		cache5.setColor(red);
+		cache5.setColors(red);
 		cache5.draw(spriteBatch);
 
 		cache1.draw(spriteBatch);
@@ -160,7 +160,7 @@
 	}
 
 	private void renderCachedScaled () {
-		cacheScaled5.setColor(red);
+		cacheScaled5.setColors(red);
 		cacheScaled5.draw(spriteBatch);
 
 		cacheScaled1.draw(spriteBatch);
