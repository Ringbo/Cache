diff --git a/src/main/java/net/minecraftforge/fluids/capability/wrappers/BlockLiquidWrapper.java b/src/main/java/net/minecraftforge/fluids/capability/wrappers/BlockLiquidWrapper.java
index 7104c2e..00214b9 100644
--- a/src/main/java/net/minecraftforge/fluids/capability/wrappers/BlockLiquidWrapper.java
+++ b/src/main/java/net/minecraftforge/fluids/capability/wrappers/BlockLiquidWrapper.java
@@ -78,7 +78,7 @@
         if (doFill)
         {
             Material material = blockLiquid.getDefaultState().getMaterial();
-            BlockLiquid block = BlockLiquid.getStaticBlock(material);
+            BlockLiquid block = BlockLiquid.getFlowingBlock(material);
             world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockLiquid.LEVEL, 0), 11);
         }
 
