diff --git a/src/main/java/net/minecraftforge/common/util/EnumHelper.java b/src/main/java/net/minecraftforge/common/util/EnumHelper.java
index f6586dc..066d0a8 100644
--- a/src/main/java/net/minecraftforge/common/util/EnumHelper.java
+++ b/src/main/java/net/minecraftforge/common/util/EnumHelper.java
@@ -35,7 +35,7 @@
     private static Class[][] commonTypes =
     {
         {EnumAction.class},
-        {ArmorMaterial.class, int.class, int[].class, int.class},
+        {ArmorMaterial.class, String.class, int.class, int[].class, int.class},
         {EnumArt.class, String.class, int.class, int.class, int.class, int.class},
         {EnumCreatureAttribute.class},
         {EnumCreatureType.class, Class.class, int.class, Material.class, boolean.class, boolean.class},
@@ -53,9 +53,9 @@
     {
         return addEnum(EnumAction.class, name);
     }
-    public static ArmorMaterial addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
+    public static ArmorMaterial addArmorMaterial(String name, String textureName, int durability, int[] reductionAmounts, int enchantability)
     {
-        return addEnum(ArmorMaterial.class, name, durability, reductionAmounts, enchantability);
+        return addEnum(ArmorMaterial.class, name, textureName, durability, reductionAmounts, enchantability);
     }
     public static EnumArt addArt(String name, String tile, int sizeX, int sizeY, int offsetX, int offsetY)
     {
