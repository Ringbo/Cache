diff --git a/engine/src/main/java/org/terasology/rendering/dag/nodes/SimpleBlendMaterialsNode.java b/engine/src/main/java/org/terasology/rendering/dag/nodes/SimpleBlendMaterialsNode.java
index 941d2f1..adda6ff 100644
--- a/engine/src/main/java/org/terasology/rendering/dag/nodes/SimpleBlendMaterialsNode.java
+++ b/engine/src/main/java/org/terasology/rendering/dag/nodes/SimpleBlendMaterialsNode.java
@@ -43,7 +43,7 @@
 
     @Override
     public void initialise() {
-        addDesiredStateChange(new BindFBO(SCENE_OPAQUE_FBO, frameBuffersManager));
+        addDesiredStateChange(new BindFBO(SCENE_OPAQUE_FBO));
         // TODO: review - might be redundant to setRenderBufferMask(sceneOpaque) again at the end of the process() method
     }
 
