diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java b/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
index 1c4a870..dc228a6 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/shaders/DefaultShader.java
@@ -806,7 +806,7 @@
 			set(u_fogColor, ((ColorAttribute)attributes.get(ColorAttribute.Fog)).color);
 		}
 
-		if (lights.shadowMap != null) {
+		if (lights != null && lights.shadowMap != null) {
 			set(u_shadowMapProjViewTrans, lights.shadowMap.getProjViewTrans());
 			set(u_shadowTexture, lights.shadowMap.getDepthMap());
 			set(u_shadowPCFOffset, 1.f / (float)(2f * lights.shadowMap.getDepthMap().texture.getWidth()));
