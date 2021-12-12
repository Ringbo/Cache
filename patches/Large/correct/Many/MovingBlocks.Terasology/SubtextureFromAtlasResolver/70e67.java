diff --git a/engine/src/main/java/org/terasology/rendering/assets/texture/subtexture/SubtextureFromAtlasResolver.java b/engine/src/main/java/org/terasology/rendering/assets/texture/subtexture/SubtextureFromAtlasResolver.java
index 5e83672..601559c 100644
--- a/engine/src/main/java/org/terasology/rendering/assets/texture/subtexture/SubtextureFromAtlasResolver.java
+++ b/engine/src/main/java/org/terasology/rendering/assets/texture/subtexture/SubtextureFromAtlasResolver.java
@@ -30,7 +30,7 @@
 
     @Override
     public AssetUri resolve(Name partialUri) {
-        String[] parts = partialUri.toString().split("\\.", 2);
+        String[] parts = partialUri.toLowerCase().split("\\.", 2);
         if (parts.length == 2) {
             AssetUri uri = Assets.resolveAssetUri(AssetType.ATLAS, parts[0]);
             if (uri != null) {
@@ -42,7 +42,7 @@
 
     @Override
     public Subtexture resolve(AssetUri uri, AssetFactory<SubtextureData, Subtexture> factory) {
-        String[] parts = uri.getAssetName().toString().split("\\.", 2);
+        String[] parts = uri.getAssetName().toLowerCase().split("\\.", 2);
         if (parts.length == 2) {
             Atlas atlas = Assets.get(new AssetUri(AssetType.ATLAS, uri.getModuleName(), parts[0]), Atlas.class);
             if (atlas == null) {
