diff --git a/src/main/java/org/bukkit/inventory/ItemStack.java b/src/main/java/org/bukkit/inventory/ItemStack.java
index 36cb83d..9118194 100644
--- a/src/main/java/org/bukkit/inventory/ItemStack.java
+++ b/src/main/java/org/bukkit/inventory/ItemStack.java
@@ -398,7 +398,7 @@
                     Enchantment enchantment = Enchantment.getByName(entry.getKey().toString());
 
                     if ((enchantment != null) && (entry.getValue() instanceof Integer)) {
-                        result.addEnchantment(enchantment, (Integer) entry.getValue());
+                        result.addUnsafeEnchantment(enchantment, (Integer) entry.getValue());
                     }
                 }
             }
