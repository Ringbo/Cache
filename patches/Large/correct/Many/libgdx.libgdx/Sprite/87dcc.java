diff --git a/gdx/src/com/badlogic/gdx/graphics/Sprite.java b/gdx/src/com/badlogic/gdx/graphics/Sprite.java
index 7a71032..223b1e5 100644
--- a/gdx/src/com/badlogic/gdx/graphics/Sprite.java
+++ b/gdx/src/com/badlogic/gdx/graphics/Sprite.java
@@ -334,7 +334,7 @@
 				final float localYSin = localY * sin;
 				final float localX2Cos = localX2 * cos;
 				final float localX2Sin = localX2 * sin;
-				final float localY2Cos = localX2 * cos;
+				final float localY2Cos = localY2 * cos;
 				final float localY2Sin = localY2 * sin;
 
 				final float x1 = localXCos - localYSin + worldOriginX;
