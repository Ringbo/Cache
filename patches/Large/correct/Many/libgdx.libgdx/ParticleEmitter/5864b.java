diff --git a/gdx/src/com/badlogic/gdx/graphics/g2d/ParticleEmitter.java b/gdx/src/com/badlogic/gdx/graphics/g2d/ParticleEmitter.java
index c627724..30bcee1 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g2d/ParticleEmitter.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g2d/ParticleEmitter.java
@@ -533,7 +533,7 @@
 				float radius2 = radiusX * radiusX;
 				while (true) {
 					float px = MathUtils.random(width) - radiusX;
-					float py = MathUtils.random(height) - radiusY;
+					float py = MathUtils.random(width) - radiusX;
 					if (px * px + py * py <= radius2) {
 						x += px;
 						y += py / scaleY;
