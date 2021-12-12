diff --git a/src/main/java/net/minecraftforge/common/BiomeManager.java b/src/main/java/net/minecraftforge/common/BiomeManager.java
index 1b45176..debdec9 100644
--- a/src/main/java/net/minecraftforge/common/BiomeManager.java
+++ b/src/main/java/net/minecraftforge/common/BiomeManager.java
@@ -147,7 +147,7 @@
     public static ImmutableList<BiomeEntry> getBiomes(BiomeType type)
     {
         int idx = type.ordinal();
-        List<BiomeEntry> list = idx > biomes.length ? null : biomes[idx];
+        List<BiomeEntry> list = idx >= biomes.length ? null : biomes[idx];
 
         return list != null ? ImmutableList.copyOf(list) : null;
     }
@@ -179,7 +179,7 @@
 
             if (ret.ordinal() >= biomes.length)
             {
-                biomes = Arrays.copyOf(biomes, ret.ordinal());
+                biomes = Arrays.copyOf(biomes, ret.ordinal() + 1);
             }
 
             return ret;
