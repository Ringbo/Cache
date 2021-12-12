diff --git a/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java b/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
index 4c9385c..2f35e9b 100644
--- a/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
+++ b/src/main/java/net/minecraftforge/items/VanillaInventoryCodeHooks.java
@@ -57,7 +57,7 @@
         BlockPos offsetPos = pos.offset(enumfacing);
         TileEntity tileEntity = world.getTileEntity(offsetPos);
         if (tileEntity == null)
-            return false;
+            return true;
         if (!tileEntity.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, enumfacing.getOpposite()))
             return true;
 
