diff --git a/jme3-examples/src/main/java/jme3test/post/TestRenderToCubemap.java b/jme3-examples/src/main/java/jme3test/post/TestRenderToCubemap.java
index 5eced13..e5aa79d 100644
--- a/jme3-examples/src/main/java/jme3test/post/TestRenderToCubemap.java
+++ b/jme3-examples/src/main/java/jme3test/post/TestRenderToCubemap.java
@@ -97,7 +97,7 @@
         offView.setOutputFrameBuffer(offBuffer);
  
         // setup framebuffer's scene
-        Box boxMesh = new Box(Vector3f.ZERO, 1,1,1);
+        Box boxMesh = new Box( 1,1,1);
         Material material = assetManager.loadMaterial("Interface/Logo/Logo.j3m");
         offBox = new Geometry("box", boxMesh);
         offBox.setMaterial(material);
