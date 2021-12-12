diff --git a/ee3_common/com/pahimar/ee3/core/helper/TransmutationHelper.java b/ee3_common/com/pahimar/ee3/core/helper/TransmutationHelper.java
index 8bbe9b4..995cd44 100644
--- a/ee3_common/com/pahimar/ee3/core/helper/TransmutationHelper.java
+++ b/ee3_common/com/pahimar/ee3/core/helper/TransmutationHelper.java
@@ -28,7 +28,7 @@
     public static boolean transmuteInWorld(World world, EntityPlayer player, ItemStack stack, int x, int y, int z, int targetID, int targetMeta) {
 
         if (Block.blocksList[targetID] != null) {
-            world.setBlockMetadataWithNotify(x, y, z, targetID, targetMeta);
+            world.setBlock(x, y, z, targetID, targetMeta, 2);
             return true;
         }
 
