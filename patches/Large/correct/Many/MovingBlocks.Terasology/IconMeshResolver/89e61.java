diff --git a/engine/src/main/java/org/terasology/rendering/iconmesh/IconMeshResolver.java b/engine/src/main/java/org/terasology/rendering/iconmesh/IconMeshResolver.java
index 3a2b9a7..42670d6 100644
--- a/engine/src/main/java/org/terasology/rendering/iconmesh/IconMeshResolver.java
+++ b/engine/src/main/java/org/terasology/rendering/iconmesh/IconMeshResolver.java
@@ -34,7 +34,7 @@
 
     @Override
     public AssetUri resolve(Name partialUri) {
-        String[] parts = partialUri.toString().split("\\.", 2);
+        String[] parts = partialUri.toLowerCase().split("\\.", 2);
         if (parts.length == 2 && parts[0].equals(ICON_DISCRIMINATOR)) {
             AssetUri uri = Assets.resolveAssetUri(AssetType.TEXTURE, parts[1]);
             if (uri == null) {
@@ -49,7 +49,7 @@
 
     @Override
     public Mesh resolve(AssetUri uri, AssetFactory<MeshData, Mesh> factory) {
-        String[] parts = uri.getAssetName().toString().split("\\.", 2);
+        String[] parts = uri.getAssetName().toLowerCase().split("\\.", 2);
         if (parts.length == 2 && parts[0].equals(ICON_DISCRIMINATOR)) {
             TextureRegion region = Assets.getTextureRegion(uri.getModuleName() + AssetUri.MODULE_SEPARATOR + parts[1]);
             if (region != null) {
