diff --git a/engine/src/core/com/jme3/renderer/Camera.java b/engine/src/core/com/jme3/renderer/Camera.java
index 74ba6cf..0b04896 100644
--- a/engine/src/core/com/jme3/renderer/Camera.java
+++ b/engine/src/core/com/jme3/renderer/Camera.java
@@ -1169,11 +1169,11 @@
             float topSquared = frustumTop * frustumTop;
 
             float inverseLength = FastMath.invSqrt(nearSquared + leftSquared);
-            coeffLeft[0] = frustumNear * inverseLength;
+            coeffLeft[0] = -frustumNear * inverseLength;
             coeffLeft[1] = -frustumLeft * inverseLength;
 
             inverseLength = FastMath.invSqrt(nearSquared + rightSquared);
-            coeffRight[0] = -frustumNear * inverseLength;
+            coeffRight[0] = frustumNear * inverseLength;
             coeffRight[1] = frustumRight * inverseLength;
 
             inverseLength = FastMath.invSqrt(nearSquared + bottomSquared);
