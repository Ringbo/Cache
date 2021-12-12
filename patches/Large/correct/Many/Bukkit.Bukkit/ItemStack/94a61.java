diff --git a/src/main/java/org/bukkit/inventory/ItemStack.java b/src/main/java/org/bukkit/inventory/ItemStack.java
index b814fbe..41db221 100644
--- a/src/main/java/org/bukkit/inventory/ItemStack.java
+++ b/src/main/java/org/bukkit/inventory/ItemStack.java
@@ -64,7 +64,7 @@
         if (stack.data != null) {
             this.data = stack.data.clone();
         }
-        enchantments.putAll(stack.enchantments);
+        this.addUnsafeEnchantments(stack.getEnchantments());
     }
 
     /**
