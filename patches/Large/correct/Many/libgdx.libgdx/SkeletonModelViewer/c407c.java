diff --git a/extensions/model-loaders/model-loaders/src/com/badlogic/gdx/graphics/g3d/test/SkeletonModelViewer.java b/extensions/model-loaders/model-loaders/src/com/badlogic/gdx/graphics/g3d/test/SkeletonModelViewer.java
index bc3ccf0..93a0d10 100644
--- a/extensions/model-loaders/model-loaders/src/com/badlogic/gdx/graphics/g3d/test/SkeletonModelViewer.java
+++ b/extensions/model-loaders/model-loaders/src/com/badlogic/gdx/graphics/g3d/test/SkeletonModelViewer.java
@@ -75,7 +75,7 @@
 		cam = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
 		cam.position.set(bounds.getCenter().cpy().add(len, len, len));
 		cam.lookAt(bounds.getCenter().x, bounds.getCenter().y, bounds.getCenter().z);
-		cam.near = 0.1f;
+		cam.near = 1f;
 		cam.far = 1000;
 
 		renderer = new ImmediateModeRenderer10();
