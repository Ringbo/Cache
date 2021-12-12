diff --git a/common/net/minecraftforge/common/ChestGenHooks.java b/common/net/minecraftforge/common/ChestGenHooks.java
index c3bfe7c..e598b04 100644
--- a/common/net/minecraftforge/common/ChestGenHooks.java
+++ b/common/net/minecraftforge/common/ChestGenHooks.java
@@ -77,7 +77,7 @@
     
     static void addDungeonLoot(ChestGenHooks dungeon, ItemStack item, int weight, int min, int max)
     {
-        dungeon.addItem(new WeightedRandomChestContent(item, weight, max, max));
+        dungeon.addItem(new WeightedRandomChestContent(item, max, max, weight));
     }
 
     private static void addInfo(String category, WeightedRandomChestContent[] items, int min, int max)
