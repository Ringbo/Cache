diff --git a/engine/src/main/java/org/terasology/world/block/loader/AutoBlockProvider.java b/engine/src/main/java/org/terasology/world/block/loader/AutoBlockProvider.java
index c8a0436..0fd2c60 100644
--- a/engine/src/main/java/org/terasology/world/block/loader/AutoBlockProvider.java
+++ b/engine/src/main/java/org/terasology/world/block/loader/AutoBlockProvider.java
@@ -60,7 +60,7 @@
         assetManager.resolve(resourceName.toString(), BlockTile.class).stream()
                 .map(urn -> assetManager.getAsset(urn, BlockTile.class).get())
                 .filter(BlockTile::isAutoBlock)
-                .forEach(tile -> result.add(tile.getUrn().getResourceName()));
+                .forEach(tile -> result.add(tile.getUrn().getModuleName()));
         return result;
     }
 
