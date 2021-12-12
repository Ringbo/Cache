diff --git a/src/main/java/net/minecraftforge/oredict/OreDictionary.java b/src/main/java/net/minecraftforge/oredict/OreDictionary.java
index dbcfdd3..925f491 100644
--- a/src/main/java/net/minecraftforge/oredict/OreDictionary.java
+++ b/src/main/java/net/minecraftforge/oredict/OreDictionary.java
@@ -294,7 +294,7 @@
         {
             for(ItemStack target : ore.getValue())
             {
-                if (itemMatches(itemStack, target, false))
+                if (itemMatches(target, itemStack, false))
                 {
                     return ore.getKey();
                 }
