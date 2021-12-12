diff --git a/jme3-core/src/tools/java/jme3tools/optimize/TextureAtlas.java b/jme3-core/src/tools/java/jme3tools/optimize/TextureAtlas.java
index 48e809a..9834706 100644
--- a/jme3-core/src/tools/java/jme3tools/optimize/TextureAtlas.java
+++ b/jme3-core/src/tools/java/jme3tools/optimize/TextureAtlas.java
@@ -155,7 +155,7 @@
                 return false;
             } else {
                 if (normal != null && normal.getKey() != null) {
-                    addTexture(diffuse, "NormalMap", keyName);
+                    addTexture(normal, "NormalMap", keyName);
                 }
                 if (specular != null && specular.getKey() != null) {
                     addTexture(specular, "SpecularMap", keyName);
