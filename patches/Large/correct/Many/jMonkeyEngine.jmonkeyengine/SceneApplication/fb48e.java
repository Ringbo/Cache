diff --git a/sdk/jme3-core/src/com/jme3/gde/core/scene/SceneApplication.java b/sdk/jme3-core/src/com/jme3/gde/core/scene/SceneApplication.java
index 663ddb3..e6a5f30 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/scene/SceneApplication.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/scene/SceneApplication.java
@@ -147,7 +147,7 @@
     public AwtPanel getMainPanel() {
         if (panel == null) {
             panel = ((AwtPanelsContext) getContext()).createPanel(true);
-            panel.attachTo(viewPort, guiViewPort, overlayView);
+            panel.attachTo(viewPort, overlayView, guiViewPort);
             ((AwtPanelsContext) getContext()).setInputSource(panel);
         }
         return panel;
