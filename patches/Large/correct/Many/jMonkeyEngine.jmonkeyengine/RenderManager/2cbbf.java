diff --git a/engine/src/core/com/jme3/renderer/RenderManager.java b/engine/src/core/com/jme3/renderer/RenderManager.java
index 9f067ee..cccd7b9 100644
--- a/engine/src/core/com/jme3/renderer/RenderManager.java
+++ b/engine/src/core/com/jme3/renderer/RenderManager.java
@@ -376,7 +376,7 @@
                     u.setValue(VarType.Matrix4, tempMat4);
                     break;
                 case WorldMatrixInverse:
-                    tempMat4.multLocal(worldMatrix);
+                    tempMat4.set(worldMatrix);
                     tempMat4.invertLocal();
                     u.setValue(VarType.Matrix4, tempMat4);
                     break;
