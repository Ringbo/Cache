diff --git a/common/buildcraft/factory/block/BlockTank.java b/common/buildcraft/factory/block/BlockTank.java
index cb5e467..fd2af14 100644
--- a/common/buildcraft/factory/block/BlockTank.java
+++ b/common/buildcraft/factory/block/BlockTank.java
@@ -89,7 +89,7 @@
     @Override
     public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
         if (world.isRemote) {
-            return false;
+            return true;
         }
         ItemStack heldItem = player.getHeldItem(hand);
         if (heldItem.isEmpty()) {
