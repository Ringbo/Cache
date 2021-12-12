diff --git a/src/main/java/net/minecraftforge/items/ItemStackHandler.java b/src/main/java/net/minecraftforge/items/ItemStackHandler.java
index 18b211a..91f6c71 100644
--- a/src/main/java/net/minecraftforge/items/ItemStackHandler.java
+++ b/src/main/java/net/minecraftforge/items/ItemStackHandler.java
@@ -39,7 +39,7 @@
 
     public ItemStackHandler(int size)
     {
-        stacks = NonNullList.func_191196_a();
+        stacks = NonNullList.func_191197_a(size, ItemStack.field_190927_a);
     }
 
     public ItemStackHandler(NonNullList<ItemStack> stacks)
