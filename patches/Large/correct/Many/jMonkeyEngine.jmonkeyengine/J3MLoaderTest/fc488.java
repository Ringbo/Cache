diff --git a/jme3-core/src/test/java/com/jme3/material/plugins/J3MLoaderTest.java b/jme3-core/src/test/java/com/jme3/material/plugins/J3MLoaderTest.java
index f45eb9b..b501040 100644
--- a/jme3-core/src/test/java/com/jme3/material/plugins/J3MLoaderTest.java
+++ b/jme3-core/src/test/java/com/jme3/material/plugins/J3MLoaderTest.java
@@ -107,7 +107,7 @@
     }
 
     private TextureKey setupMockForTexture(final String paramName, final String path, final boolean flipY, final Texture texture) {
-        when(materialDef.getMaterialParam(paramName)).thenReturn(new MatParamTexture(VarType.Texture2D, paramName, texture, 0, null));
+        when(materialDef.getMaterialParam(paramName)).thenReturn(new MatParamTexture(VarType.Texture2D, paramName, texture, null));
 
         final TextureKey textureKey = new TextureKey(path, flipY);
         textureKey.setGenerateMips(true);
