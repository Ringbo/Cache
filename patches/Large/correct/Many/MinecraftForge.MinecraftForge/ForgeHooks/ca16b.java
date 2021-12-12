diff --git a/common/net/minecraftforge/common/ForgeHooks.java b/common/net/minecraftforge/common/ForgeHooks.java
index b0c4a74..2273b5a 100644
--- a/common/net/minecraftforge/common/ForgeHooks.java
+++ b/common/net/minecraftforge/common/ForgeHooks.java
@@ -68,7 +68,7 @@
 
     public static boolean canHarvestBlock(Block block, EntityPlayer player, int metadata)
     {
-        if (block.blockMaterial.isHarvestable())
+        if (block.blockMaterial.isToolNotRequired())
         {
             return true;
         }
