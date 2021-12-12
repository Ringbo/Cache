diff --git a/jme3-core/src/main/java/com/jme3/post/FilterPostProcessor.java b/jme3-core/src/main/java/com/jme3/post/FilterPostProcessor.java
index cf51ad0..e951514 100644
--- a/jme3-core/src/main/java/com/jme3/post/FilterPostProcessor.java
+++ b/jme3-core/src/main/java/com/jme3/post/FilterPostProcessor.java
@@ -448,7 +448,7 @@
         cameraInit = true;
         computeDepth = false;
 
-        if (renderFrameBuffer == null) {
+        if (renderFrameBuffer == null && renderFrameBufferMS == null) {
             outputBuffer = viewPort.getOutputFrameBuffer();
         }
 
