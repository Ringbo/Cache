diff --git a/common/net/minecraftforge/common/DimensionManager.java b/common/net/minecraftforge/common/DimensionManager.java
index f394feb..2b0adde 100644
--- a/common/net/minecraftforge/common/DimensionManager.java
+++ b/common/net/minecraftforge/common/DimensionManager.java
@@ -175,7 +175,7 @@
     public static boolean shouldLoadSpawn(int dim)
     {
         int id = getProviderType(dim);
-        return spawnSettings.contains(id) && spawnSettings.get(id);
+        return spawnSettings.containsKey(id) && spawnSettings.get(id);
     }
 
     static
