diff --git a/src/main/java/net/minecraftforge/oredict/OreDictionary.java b/src/main/java/net/minecraftforge/oredict/OreDictionary.java
index 0dbdcd2..dbcfdd3 100644
--- a/src/main/java/net/minecraftforge/oredict/OreDictionary.java
+++ b/src/main/java/net/minecraftforge/oredict/OreDictionary.java
@@ -319,7 +319,7 @@
         {
             for(ItemStack target : ore.getValue())
             {
-                if (itemMatches(itemStack, target, false))
+                if (itemMatches(target, itemStack, false))
                 {
                     ids.add(ore.getKey());
                 }
