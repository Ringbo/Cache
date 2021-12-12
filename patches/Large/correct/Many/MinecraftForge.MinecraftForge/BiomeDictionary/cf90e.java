diff --git a/common/net/minecraftforge/common/BiomeDictionary.java b/common/net/minecraftforge/common/BiomeDictionary.java
index 3703a58..d02a09c 100644
--- a/common/net/minecraftforge/common/BiomeDictionary.java
+++ b/common/net/minecraftforge/common/BiomeDictionary.java
@@ -98,7 +98,7 @@
     {
         if(typeInfoList[type.ordinal()] != null)
         {
-            return (BiomeGenBase[])typeInfoList[type.ordinal()].toArray();
+            return (BiomeGenBase[])typeInfoList[type.ordinal()].toArray(new BiomeGenBase[0]);
         }
 
         return new BiomeGenBase[0];
@@ -116,7 +116,7 @@
 
         if(biomeList[biome.biomeID] != null)
         {
-            return (Type[])biomeList[biome.biomeID].typeList.toArray();
+            return (Type[])biomeList[biome.biomeID].typeList.toArray(new Type[0]);
         }
 
         return new Type[0];
