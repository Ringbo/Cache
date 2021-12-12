diff --git a/src/main/java/com/pahimar/ee3/handler/FuelHandler.java b/src/main/java/com/pahimar/ee3/handler/FuelHandler.java
index 10d6c30..a91a107 100644
--- a/src/main/java/com/pahimar/ee3/handler/FuelHandler.java
+++ b/src/main/java/com/pahimar/ee3/handler/FuelHandler.java
@@ -36,7 +36,7 @@
          */
         else if (fuel.itemID == MOBIUS_FUEL_STACK.itemID && fuel.getItemDamage() == MOBIUS_FUEL_STACK.getItemDamage())
         {
-            return 8 * getBurnTime(ALCHEMICAL_COAL_BLOCK_STACK);
+            return 8 * getBurnTime(ALCHEMICAL_COAL_STACK);
         }
         else if (fuel.itemID == MOBIUS_FUEL_BLOCK_STACK.itemID && fuel.getItemDamage() == MOBIUS_FUEL_BLOCK_STACK.getItemDamage())
         {
@@ -47,7 +47,7 @@
          */
         else if (fuel.itemID == AETERNALIS_FUEL_STACK.itemID && fuel.getItemDamage() == AETERNALIS_FUEL_STACK.getItemDamage())
         {
-            return 8 * getBurnTime(new ItemStack(ModItems.alchemicalFuelBlock.itemID, 1, 1));
+            return 8 * getBurnTime(MOBIUS_FUEL_STACK);
         }
         else if (fuel.itemID == AETERNALIS_FUEL_BLOCK_STACK.itemID && fuel.getItemDamage() == AETERNALIS_FUEL_BLOCK_STACK.getItemDamage())
         {
