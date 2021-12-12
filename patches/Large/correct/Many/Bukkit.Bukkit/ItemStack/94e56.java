diff --git a/src/main/java/org/bukkit/inventory/ItemStack.java b/src/main/java/org/bukkit/inventory/ItemStack.java
index 7a424c7..95dc1f1 100644
--- a/src/main/java/org/bukkit/inventory/ItemStack.java
+++ b/src/main/java/org/bukkit/inventory/ItemStack.java
@@ -356,18 +356,18 @@
 
     public static ItemStack deserialize(Map<String, Object> args) {
         Material type = Material.getMaterial((String) args.get("type"));
-        int damage = 0;
+        short damage = 0;
         int amount = 1;
 
         if (args.containsKey("damage")) {
-            damage = (Integer) args.get("damage");
+            damage = (Short) args.get("damage");
         }
 
         if (args.containsKey("amount")) {
             amount = (Integer) args.get("amount");
         }
 
-        ItemStack result = new ItemStack(type, amount, (short) damage);
+        ItemStack result = new ItemStack(type, amount, damage);
 
         if (args.containsKey("enchantments")) {
             Object raw = args.get("enchantments");
