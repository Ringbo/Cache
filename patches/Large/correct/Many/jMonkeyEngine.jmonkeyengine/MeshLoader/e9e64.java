diff --git a/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java b/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
index 92fb39d..0e63020 100644
--- a/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
+++ b/engine/src/ogre/com/jme3/scene/plugins/ogre/MeshLoader.java
@@ -767,7 +767,7 @@
             AnimControl ctrl = new AnimControl(animData.skeleton);
             ctrl.setAnimations(anims);
             model.addControl(ctrl);
-            SkeletonControl skeletonControl = new SkeletonControl(model, meshes, animData.skeleton);
+            SkeletonControl skeletonControl = new SkeletonControl(meshes, animData.skeleton);
             model.addControl(skeletonControl);
         }
 
