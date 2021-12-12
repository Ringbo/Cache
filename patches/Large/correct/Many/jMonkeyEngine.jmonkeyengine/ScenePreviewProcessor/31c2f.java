diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
index 8f7e822..66147af 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/ScenePreviewProcessor.java
@@ -83,7 +83,7 @@
         // create a pre-view. a view that is rendered before the main view
         offView = SceneApplication.getApplication().getRenderManager().createPreView("Offscreen View", offCamera);
         offView.setBackgroundColor(ColorRGBA.DarkGray);
-        offView.setClearEnabled(true);
+        offView.setClearFlags(true, true, true);
         
         offView.addProcessor(this);
 
