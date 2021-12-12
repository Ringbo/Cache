diff --git a/jme3-effects/src/main/java/com/jme3/water/WaterUtils.java b/jme3-effects/src/main/java/com/jme3/water/WaterUtils.java
index f232a65..0060d79 100644
--- a/jme3-effects/src/main/java/com/jme3/water/WaterUtils.java
+++ b/jme3-effects/src/main/java/com/jme3/water/WaterUtils.java
@@ -34,15 +34,15 @@
                 sceneCam.getFrustumBottom());
         reflectionCam.setParallelProjection(sceneCam.isParallelProjection());
 
-        sceneTarget.set(sceneCam.getLocation()).addLocal(sceneCam.getDirection());
+        sceneTarget.set(sceneCam.getLocation()).addLocal(sceneCam.getDirection(vars.vect6));
         reflectDirection = plane.reflect(sceneTarget, reflectDirection);
         reflectDirection.subtractLocal(camLoc);
 
-        sceneTarget.set(sceneCam.getLocation()).subtractLocal(sceneCam.getUp());
+        sceneTarget.set(sceneCam.getLocation()).subtractLocal(sceneCam.getUp(vars.vect6));
         reflectUp = plane.reflect(sceneTarget, reflectUp);
         reflectUp.subtractLocal(camLoc);
 
-        sceneTarget.set(sceneCam.getLocation()).addLocal(sceneCam.getLeft());
+        sceneTarget.set(sceneCam.getLocation()).addLocal(sceneCam.getLeft(vars.vect6));
         reflectLeft = plane.reflect(sceneTarget, reflectLeft);
         reflectLeft.subtractLocal(camLoc);
 
