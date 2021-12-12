diff --git a/common/buildcraft/builders/item/ItemSchematicSingle.java b/common/buildcraft/builders/item/ItemSchematicSingle.java
index 35910d9..d79cdc6 100644
--- a/common/buildcraft/builders/item/ItemSchematicSingle.java
+++ b/common/buildcraft/builders/item/ItemSchematicSingle.java
@@ -83,7 +83,7 @@
         ItemStack stack = player.getHeldItem(hand);
         if (player.isSneaking()) {
             NBTTagCompound itemData = NBTUtilBC.getItemData(StackUtil.asNonNull(stack));
-            itemData.removeTag("schematic");
+            itemData.removeTag(NBT_KEY);
             if (itemData.hasNoTags()) {
                 stack.setTagCompound(null);
             }
@@ -103,7 +103,7 @@
         } else {
             BlockPos placePos = pos.offset(side);
             if (!world.isAirBlock(placePos)) {
-                player.sendMessage(new TextComponentString("Not an air block @" + placePos));
+                player.sendStatusMessage(new TextComponentString("Not an air block @" + placePos), true);
                 return EnumActionResult.FAIL;
             }
             try {
@@ -118,7 +118,7 @@
                     return EnumActionResult.FAIL;
                 }
             } catch (InvalidInputDataException e) {
-                player.sendMessage(new TextComponentString("Invalid schematic: " + e.getMessage()));
+                player.sendStatusMessage(new TextComponentString("Invalid schematic: " + e.getMessage()), true);
                 e.printStackTrace();
                 return EnumActionResult.FAIL;
             }
