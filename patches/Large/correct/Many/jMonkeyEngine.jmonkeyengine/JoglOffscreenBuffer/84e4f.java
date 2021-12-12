diff --git a/engine/src/jogl/com/jme3/system/jogl/JoglOffscreenBuffer.java b/engine/src/jogl/com/jme3/system/jogl/JoglOffscreenBuffer.java
index a4dcadd..006334b 100644
--- a/engine/src/jogl/com/jme3/system/jogl/JoglOffscreenBuffer.java
+++ b/engine/src/jogl/com/jme3/system/jogl/JoglOffscreenBuffer.java
@@ -75,7 +75,7 @@
         caps.setSampleBuffers(true);
         caps.setNumSamples(samples);
 
-        offscreenDrawable = GLDrawableFactory.getFactory(GLProfile.getMaxFixedFunc(true)).createOffscreenAutoDrawable(null, caps, null, width, width, null);
+        offscreenDrawable = GLDrawableFactory.getFactory(GLProfile.getMaxFixedFunc(true)).createOffscreenAutoDrawable(null, caps, null, width, height, null);
         
         offscreenDrawable.display();
         
