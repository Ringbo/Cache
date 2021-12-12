diff --git a/common/net/minecraftforge/fluids/BlockFluidBase.java b/common/net/minecraftforge/fluids/BlockFluidBase.java
index 7961b0a..826ec6c 100644
--- a/common/net/minecraftforge/fluids/BlockFluidBase.java
+++ b/common/net/minecraftforge/fluids/BlockFluidBase.java
@@ -341,7 +341,7 @@
     public static double getFlowDirection(IBlockAccess world, int x, int y, int z)
     {
         Block block = Block.blocksList[world.getBlockId(x, y, z)];
-        if (world.getBlockMaterial(x, y, z).isLiquid())
+        if (!world.getBlockMaterial(x, y, z).isLiquid())
         {
             return -1000.0;
         }
