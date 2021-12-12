diff --git a/src/main/java/org/bukkit/inventory/ItemStack.java b/src/main/java/org/bukkit/inventory/ItemStack.java
index 95dc1f1..c730db6 100644
--- a/src/main/java/org/bukkit/inventory/ItemStack.java
+++ b/src/main/java/org/bukkit/inventory/ItemStack.java
@@ -211,7 +211,7 @@
     @Override
     public ItemStack clone() {
         ItemStack result = new ItemStack(type, amount, durability);
-        result.addEnchantments(getEnchantments());
+        result.addUnsafeEnchantments(getEnchantments());
 
         return result;
     }
