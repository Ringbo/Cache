diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
index 63068c0..f827eac 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
@@ -169,7 +169,7 @@
     public void postFrame(FrameBuffer fb) {
         if (currentPreviewRequest != null) {
             cpuBuf.clear();
-            SceneApplication.getApplication().getRenderer().readFrameBuffer(offBuffer, cpuBuf);
+            SceneApplication.getApplication().getRenderer().readFrameBufferWithFormat(offBuffer, cpuBuf, Format.BGRA8);
 
             // copy native memory to java memory
             cpuBuf.clear();
