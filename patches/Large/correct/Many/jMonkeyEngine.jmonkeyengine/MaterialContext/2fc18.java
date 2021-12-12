diff --git a/engine/src/blender/com/jme3/scene/plugins/blender/materials/MaterialContext.java b/engine/src/blender/com/jme3/scene/plugins/blender/materials/MaterialContext.java
index 52bc4e8..986deb1 100644
--- a/engine/src/blender/com/jme3/scene/plugins/blender/materials/MaterialContext.java
+++ b/engine/src/blender/com/jme3/scene/plugins/blender/materials/MaterialContext.java
@@ -158,7 +158,7 @@
         boolean transparent = false;
         if (diffuseColor != null) {
             transparent = diffuseColor.a < 1.0f;
-            if (textureDataMap.size() > 0) {// texutre covers the material color
+            if (loadedTextures.size() > 0) {// texutre covers the material color
                 diffuseColor.set(1, 1, 1, 1);
             }
         }
