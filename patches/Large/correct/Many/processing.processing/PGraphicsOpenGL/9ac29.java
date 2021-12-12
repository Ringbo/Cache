diff --git a/core/src/processing/opengl/PGraphicsOpenGL.java b/core/src/processing/opengl/PGraphicsOpenGL.java
index 63d7419..54b4192 100644
--- a/core/src/processing/opengl/PGraphicsOpenGL.java
+++ b/core/src/processing/opengl/PGraphicsOpenGL.java
@@ -3115,7 +3115,7 @@
                       ambientColor, specularColor, emissiveColor, shininess);
     inGeo.setNormal(normalX, normalY, normalZ);
     inGeo.addRect(x1, y1, x2, y2, tl, tr, br, bl, stroke);
-    endShape();
+    endShape(CLOSE);
   }
 
 
