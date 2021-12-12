diff --git a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
index 6a05bca..ff5dc08 100644
--- a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
+++ b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
@@ -138,7 +138,7 @@
                 public Void call() throws Exception {
                     SceneRequest request = SceneApplication.getApplication().getCurrentSceneRequest();
                     ((DesktopAssetManager) request.getManager()).deleteFromCache(new AssetKey(text));
-                    Material localMaterial = (Material) request.getManager().loadAsset(text);
+                    Material localMaterial = (Material) request.getManager().loadMaterial(text);
                     if (localMaterial != null) {
                         material = localMaterial;
                     }
