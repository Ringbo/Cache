diff --git a/android/core/src/processing/core/PGraphicsAndroid3D.java b/android/core/src/processing/core/PGraphicsAndroid3D.java
index a44aee5..95e869d 100644
--- a/android/core/src/processing/core/PGraphicsAndroid3D.java
+++ b/android/core/src/processing/core/PGraphicsAndroid3D.java
@@ -4126,7 +4126,7 @@
     lightSpecular[lightCount][0] = currentLightSpecular[0];
     lightSpecular[lightCount][1] = currentLightSpecular[1];
     lightSpecular[lightCount][2] = currentLightSpecular[2];
-    lightSpecular[lightCount][2] = currentLightSpecular[3];
+    lightSpecular[lightCount][3] = currentLightSpecular[3];
 
     float invn = 1.0f / PApplet.dist(0, 0, 0, nx, ny, nz);
     lightNormal[lightCount][0] = invn * nx;
