diff --git a/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglCanvas.java b/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglCanvas.java
index 02e68ee..54e828b 100644
--- a/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglCanvas.java
+++ b/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglCanvas.java
@@ -304,7 +304,11 @@
                                                 0,
                                                 settings.getDepthBits(),
                                                 settings.getStencilBits(),
-                                                0);
+                                                0, // samples
+                                                0,
+                                                0, 
+                                                0, 
+                                                settings.useStereo3D());
             }
             return pbufferFormat;
         }else{
@@ -314,7 +318,11 @@
                                                0,
                                                settings.getDepthBits(),
                                                settings.getStencilBits(),
-                                               samples);
+                                               samples,
+                                               0,
+                                               0, 
+                                               0, 
+                                               settings.useStereo3D());
             }
             return canvasFormat;
         }
