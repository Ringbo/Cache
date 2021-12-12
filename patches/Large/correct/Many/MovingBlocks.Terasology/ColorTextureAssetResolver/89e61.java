diff --git a/engine/src/main/java/org/terasology/rendering/assets/texture/ColorTextureAssetResolver.java b/engine/src/main/java/org/terasology/rendering/assets/texture/ColorTextureAssetResolver.java
index 32098e5..465df11 100644
--- a/engine/src/main/java/org/terasology/rendering/assets/texture/ColorTextureAssetResolver.java
+++ b/engine/src/main/java/org/terasology/rendering/assets/texture/ColorTextureAssetResolver.java
@@ -38,7 +38,7 @@
 
     @Override
     public AssetUri resolve(Name partialUri) {
-        String[] parts = partialUri.toString().split("\\.", 2);
+        String[] parts = partialUri.toLowerCase().split("\\.", 2);
         if (parts.length != 2) {
             return null;
         }
@@ -56,7 +56,7 @@
             return null;
         }
 
-        String[] parts = uri.getAssetName().toString().split("\\.", 2);
+        String[] parts = uri.getAssetName().toLowerCase().split("\\.", 2);
         if (parts.length != 2) {
             return null;
         }
