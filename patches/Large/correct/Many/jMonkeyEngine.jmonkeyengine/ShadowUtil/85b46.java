diff --git a/engine/src/core/com/jme3/shadow/ShadowUtil.java b/engine/src/core/com/jme3/shadow/ShadowUtil.java
index ed34bee..eb6e381 100644
--- a/engine/src/core/com/jme3/shadow/ShadowUtil.java
+++ b/engine/src/core/com/jme3/shadow/ShadowUtil.java
@@ -473,7 +473,8 @@
         //from Practical Cascaded Shadow maps adapted to PSSM
         //scale stabilization
         float halfTextureSize = shadowMapSize * 0.5f;
-        if (halfTextureSize != 0) {
+
+        if (halfTextureSize != 0 && scaleX >0 && scaleY>0) {
             float scaleQuantizer = 0.1f;            
             scaleX = 1.0f / FastMath.ceil(1.0f / scaleX * scaleQuantizer) * scaleQuantizer;
             scaleY = 1.0f / FastMath.ceil(1.0f / scaleY * scaleQuantizer) * scaleQuantizer;
@@ -486,7 +487,7 @@
         //Shadow map stabilization approximation from shaderX 7
         //from Practical Cascaded Shadow maps adapted to PSSM
         //offset stabilization
-        if (halfTextureSize != 0) {
+        if (halfTextureSize != 0  && scaleX >0 && scaleY>0) {
             offsetX = FastMath.ceil(offsetX * halfTextureSize) / halfTextureSize;
             offsetY = FastMath.ceil(offsetY * halfTextureSize) / halfTextureSize;
         }
