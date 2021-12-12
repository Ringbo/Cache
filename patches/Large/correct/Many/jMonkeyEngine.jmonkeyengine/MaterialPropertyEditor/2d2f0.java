diff --git a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
index ff5dc08..d8afcf9 100644
--- a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
+++ b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/MaterialPropertyEditor.java
@@ -137,7 +137,7 @@
 
                 public Void call() throws Exception {
                     SceneRequest request = SceneApplication.getApplication().getCurrentSceneRequest();
-                    ((DesktopAssetManager) request.getManager()).deleteFromCache(new AssetKey(text));
+                    ((DesktopAssetManager) request.getManager()).deleteFromCache(new MaterialKey(text));
                     Material localMaterial = (Material) request.getManager().loadMaterial(text);
                     if (localMaterial != null) {
                         material = localMaterial;
