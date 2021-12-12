diff --git a/common/net/minecraftforge/common/ForgeHooks.java b/common/net/minecraftforge/common/ForgeHooks.java
index 20c78ea..b0c4a74 100644
--- a/common/net/minecraftforge/common/ForgeHooks.java
+++ b/common/net/minecraftforge/common/ForgeHooks.java
@@ -272,7 +272,7 @@
         for (int x = 0; x < 9; x++)
         {
             ItemStack stack = player.inventory.getStackInSlot(x);
-            if (stack != null && stack.isItemEqual(result) && ItemStack.func_77970_a(stack, result))
+            if (stack != null && stack.isItemEqual(result) && ItemStack.areItemStackTagsEqual(stack, result))
             {
                 player.inventory.currentItem = x;
                 return true;
