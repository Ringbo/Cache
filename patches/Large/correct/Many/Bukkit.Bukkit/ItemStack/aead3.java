diff --git a/src/main/java/org/bukkit/inventory/ItemStack.java b/src/main/java/org/bukkit/inventory/ItemStack.java
index 41db221..165eca6 100644
--- a/src/main/java/org/bukkit/inventory/ItemStack.java
+++ b/src/main/java/org/bukkit/inventory/ItemStack.java
@@ -20,11 +20,11 @@
     private Map<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
 
     public ItemStack(final int type) {
-        this(type, 0);
+        this(type, 1);
     }
 
     public ItemStack(final Material type) {
-        this(type, 0);
+        this(type, 1);
     }
 
     public ItemStack(final int type, final int amount) {
