diff --git a/src/main/java/net/minecraftforge/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper.java b/src/main/java/net/minecraftforge/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper.java
index 635caeb..a79dfd3 100644
--- a/src/main/java/net/minecraftforge/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper.java
+++ b/src/main/java/net/minecraftforge/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper.java
@@ -450,7 +450,7 @@
         // generate maps for all parent objects
         for (String parentThing : allParents)
         {
-            if (!methodNameMaps.containsKey(parentThing))
+            if (!fieldNameMaps.containsKey(parentThing))
             {
                 findAndMergeSuperMaps(parentThing);
             }
