diff --git a/engine/src/core/com/jme3/post/FilterPostProcessor.java b/engine/src/core/com/jme3/post/FilterPostProcessor.java
index cd2fc47..637f393 100644
--- a/engine/src/core/com/jme3/post/FilterPostProcessor.java
+++ b/engine/src/core/com/jme3/post/FilterPostProcessor.java
@@ -361,7 +361,7 @@
                 return;
             }
         }
-        if (lastFilterIndex == -1) {
+        if (isInitialized() && lastFilterIndex == -1) {
             //There is no enabled filter, we restore the original framebuffer 
             //to the viewport to bypass the fpp.
             viewPort.setOutputFrameBuffer(outputBuffer);
