diff --git a/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java b/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
index 212d118..99ffef3 100644
--- a/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
+++ b/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
@@ -32,13 +32,13 @@
 
 public class VanillaInventoryCodeHooks
 {
-
-    public static boolean extractHook(IHopper dest)
+    //Return: Null if we did nothing {no IItemHandler}, True if we moved an item, False if we moved no items
+    public static Boolean extractHook(IHopper dest)
     {
         TileEntity tileEntity = dest.getWorld().getTileEntity(new BlockPos(dest.getXPos(), dest.getYPos() + 1, dest.getZPos()));
 
         if (tileEntity == null || !tileEntity.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN))
-            return false;
+            return null;
 
         IItemHandler handler = tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);
 
@@ -67,7 +67,7 @@
             }
         }
 
-        return true;
+        return false;
     }
 
     public static boolean dropperInsertHook(World world, BlockPos pos, TileEntityDispenser dropper, int slot, ItemStack stack)
