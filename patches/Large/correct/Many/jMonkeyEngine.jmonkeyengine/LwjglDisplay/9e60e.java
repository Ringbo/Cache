diff --git a/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglDisplay.java b/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglDisplay.java
index 8904ff8..adcb3a2 100644
--- a/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglDisplay.java
+++ b/engine/src/lwjgl/com/jme3/system/lwjgl/LwjglDisplay.java
@@ -87,7 +87,11 @@
                                          0,
                                          settings.getDepthBits(),
                                          settings.getStencilBits(),
-                                         samples);
+                                         samples, 
+                                         0, 
+                                         0, 
+                                         0, 
+                                         settings.useStereo3D());
 
         frameRate = settings.getFrameRate();
         logger.log(Level.INFO, "Selected display mode: {0}", displayMode);
