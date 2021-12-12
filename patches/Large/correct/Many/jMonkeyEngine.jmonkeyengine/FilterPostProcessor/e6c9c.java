diff --git a/engine/src/core/com/jme3/post/FilterPostProcessor.java b/engine/src/core/com/jme3/post/FilterPostProcessor.java
index 3be4a7d..8a08b7a 100644
--- a/engine/src/core/com/jme3/post/FilterPostProcessor.java
+++ b/engine/src/core/com/jme3/post/FilterPostProcessor.java
@@ -316,7 +316,7 @@
         height = (int) (h * (Math.abs(bottom - top)));
         width = Math.max(1, width);
         height = Math.max(1, height);
-        vp.getCamera().resize(width, height, true);
+        vp.getCamera().resize(width, height, false);
         cameraInit = true;
         computeDepth = false;
 
