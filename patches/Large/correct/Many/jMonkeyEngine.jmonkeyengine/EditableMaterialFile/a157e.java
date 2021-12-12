diff --git a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/EditableMaterialFile.java b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/EditableMaterialFile.java
index 4c718c7..9b5cf61 100644
--- a/sdk/jme3-materialeditor/src/com/jme3/gde/materials/EditableMaterialFile.java
+++ b/sdk/jme3-materialeditor/src/com/jme3/gde/materials/EditableMaterialFile.java
@@ -532,7 +532,7 @@
                             //TODO: seems like flip is removed due to ImageToAwt
                             texKey.setFlipY(false);
                             Texture texture = manager.loadTexture(texKey);
-                            MatParamTexture newParam = new MatParamTexture(texParam.getVarType(), texParam.getName(), texture, texParam.getUnit());
+                            MatParamTexture newParam = new MatParamTexture(texParam.getVarType(), texParam.getName(), texture, texParam.getUnit(), null);
                             materialParameters.put(newParam.getName(), new MaterialProperty(newParam));
                         } catch (Exception ex) {
                             Exceptions.printStackTrace(ex);
