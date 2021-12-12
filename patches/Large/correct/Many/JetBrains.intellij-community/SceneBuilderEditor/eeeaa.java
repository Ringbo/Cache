diff --git a/plugins/javaFX/src/org/jetbrains/plugins/javaFX/sceneBuilder/SceneBuilderEditor.java b/plugins/javaFX/src/org/jetbrains/plugins/javaFX/sceneBuilder/SceneBuilderEditor.java
index 9f27ce0..8cd970c 100644
--- a/plugins/javaFX/src/org/jetbrains/plugins/javaFX/sceneBuilder/SceneBuilderEditor.java
+++ b/plugins/javaFX/src/org/jetbrains/plugins/javaFX/sceneBuilder/SceneBuilderEditor.java
@@ -100,7 +100,7 @@
       myErrorLabel.setHyperlinkText("Error: " + e.getMessage(), "", "");
       myErrorLabel.setIcon(Messages.getErrorIcon());
 
-      LOG.error(e);
+      LOG.info(e);
     }
     myLayout.show(myPanel, ERROR_CARD);
   }
