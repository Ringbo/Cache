diff --git a/sdk/jme3-scenecomposer/src/com/jme3/gde/scenecomposer/SceneComposerTopComponent.java b/sdk/jme3-scenecomposer/src/com/jme3/gde/scenecomposer/SceneComposerTopComponent.java
index 8f140a3..7ed5922 100644
--- a/sdk/jme3-scenecomposer/src/com/jme3/gde/scenecomposer/SceneComposerTopComponent.java
+++ b/sdk/jme3-scenecomposer/src/com/jme3/gde/scenecomposer/SceneComposerTopComponent.java
@@ -777,7 +777,7 @@
                     result.removeLookupListener(inst);
                     addObjectButton.setEnabled(false);
                     addCursorButton.setEnabled(false);
-                    showSelectionToggleButton.setSelected(false);
+                    showSelectionToggleButton.setSelected(true);
                     showGridToggleButton.setSelected(false);
                     sceneInfoLabel1.setText("");
                     sceneInfoLabel2.setText("");
@@ -785,7 +785,7 @@
                     sceneInfoLabel2.setToolTipText("");
                     close();
                 } else {
-                    showSelectionToggleButton.setSelected(false);
+                    showSelectionToggleButton.setSelected(true);
                     showGridToggleButton.setSelected(false);
                     //TODO: threading
                     if (file != null) {
