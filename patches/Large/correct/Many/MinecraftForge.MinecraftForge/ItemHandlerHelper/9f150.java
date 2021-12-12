diff --git a/src/main/java/net/minecraftforge/items/ItemHandlerHelper.java b/src/main/java/net/minecraftforge/items/ItemHandlerHelper.java
index b2caf47..9c1c320 100644
--- a/src/main/java/net/minecraftforge/items/ItemHandlerHelper.java
+++ b/src/main/java/net/minecraftforge/items/ItemHandlerHelper.java
@@ -142,7 +142,7 @@
         World world = player.worldObj;
 
         // try adding it into the inventory
-        ItemStack remainder = null;
+        ItemStack remainder = stack;
         // insert into preferred slot first
         if(preferredSlot >= 0)
         {
@@ -151,7 +151,7 @@
         // then into the inventory in general
         if(remainder != null)
         {
-            remainder = insertItemStacked(inventory, stack, false);
+            remainder = insertItemStacked(inventory, remainder, false);
         }
 
         // play sound if something got picked up
