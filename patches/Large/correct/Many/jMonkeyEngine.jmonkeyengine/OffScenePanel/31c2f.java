diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
index e511da1..093193b 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/OffScenePanel.java
@@ -191,7 +191,7 @@
         // create a pre-view. a view that is rendered before the main view
         viewPort = SceneApplication.getApplication().getRenderManager().createPreView("Offscreen View", camera);
         viewPort.setBackgroundColor(ColorRGBA.DarkGray);
-        viewPort.setClearEnabled(true);
+        viewPort.setClearFlags(true, true, true);
         viewPort.addProcessor(this);
     }
 
