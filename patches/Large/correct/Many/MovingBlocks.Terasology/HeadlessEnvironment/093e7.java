diff --git a/engine-tests/src/main/java/org/terasology/HeadlessEnvironment.java b/engine-tests/src/main/java/org/terasology/HeadlessEnvironment.java
index d5b5e0a..ae37cd9 100644
--- a/engine-tests/src/main/java/org/terasology/HeadlessEnvironment.java
+++ b/engine-tests/src/main/java/org/terasology/HeadlessEnvironment.java
@@ -216,7 +216,7 @@
         assetTypeManager.registerCoreAssetType(StaticSound.class, NullSound::new, "sounds");
         assetTypeManager.registerCoreAssetType(StreamingSound.class, NullStreamingSound::new, "music");
 
-        BlockFamilyRegistryImpl blockFamilyFactoryRegistry = new BlockFamilyRegistryImpl(context);
+        BlockFamilyRegistryImpl blockFamilyFactoryRegistry = new BlockFamilyRegistryImpl();
         blockFamilyFactoryRegistry.setBlockFamily("horizontal", HorizontalBlockFamily.class);
         blockFamilyFactoryRegistry.setBlockFamily("alignToSurface", AttachedToSurfaceFamily.class);
         assetTypeManager.registerCoreFormat(BlockFamilyDefinition.class,
