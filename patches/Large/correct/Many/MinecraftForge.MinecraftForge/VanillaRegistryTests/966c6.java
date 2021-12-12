diff --git a/src/test/java/net/minecraftforge/fml/common/registry/VanillaRegistryTests.java b/src/test/java/net/minecraftforge/fml/common/registry/VanillaRegistryTests.java
index 3c20842..696730a 100644
--- a/src/test/java/net/minecraftforge/fml/common/registry/VanillaRegistryTests.java
+++ b/src/test/java/net/minecraftforge/fml/common/registry/VanillaRegistryTests.java
@@ -34,7 +34,7 @@
         assertEquals("We have all the blocks via GameData",236,Block.REGISTRY.getKeys().size());
 
         // All the items loaded
-        assertEquals("We have all the items via GameData",391,Item.REGISTRY.getKeys().size());
+        assertEquals("We have all the items via GameData",392,Item.REGISTRY.getKeys().size());
 
         // Our lookups find the same stuff vanilla sees
         final IForgeRegistry<Block> blocks = PersistentRegistryManager.findRegistry(Blocks.AIR);
