diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
index 652e935..f39969a 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
@@ -219,7 +219,7 @@
 
     public void postFrame(FrameBuffer fb) {
 //        cpuBuf.clear();
-        SceneApplication.getApplication().getRenderer().readFrameBuffer(offBuffer, cpuBuf);
+        SceneApplication.getApplication().getRenderer().readFrameBufferWithFormat(offBuffer, cpuBuf,Format.BGRA8);
 //
 //        // copy native memory to java memory
 //        cpuBuf.clear();
