diff --git a/engine/src/bullet/com/jme3/bullet/control/KinematicRagdollControl.java b/engine/src/bullet/com/jme3/bullet/control/KinematicRagdollControl.java
index 08809f3..a7dd9dd 100644
--- a/engine/src/bullet/com/jme3/bullet/control/KinematicRagdollControl.java
+++ b/engine/src/bullet/com/jme3/bullet/control/KinematicRagdollControl.java
@@ -193,9 +193,9 @@
                 if (link.bone.getParent() == null) {
 
                     //offsetting the physic's position/rotation by the root bone inverse model space position/rotaion
-                    modelPosition.set(p).subtractLocal(link.bone.getInitialPos());
+                    modelPosition.set(p).subtractLocal(link.bone.getWorldBindPosition());
                     targetModel.getParent().getWorldTransform().transformInverseVector(modelPosition, modelPosition);
-                    modelRotation.set(q).multLocal(tmpRot2.set(link.bone.getInitialRot()).inverseLocal());
+                    modelRotation.set(q).multLocal(tmpRot2.set(link.bone.getWorldBindRotation()).inverseLocal());
 
 
                     //applying transforms to the model
