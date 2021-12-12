diff --git a/common/net/minecraftforge/oredict/ShapedOreRecipe.java b/common/net/minecraftforge/oredict/ShapedOreRecipe.java
index 1f4d748..9c868ca 100644
--- a/common/net/minecraftforge/oredict/ShapedOreRecipe.java
+++ b/common/net/minecraftforge/oredict/ShapedOreRecipe.java
@@ -167,12 +167,12 @@
         {
             for (int y = 0; y <= MAX_CRAFT_GRID_HEIGHT - height; ++y)
             {
-                if (checkMatch(inv, x, y, true))
+                if (checkMatch(inv, x, y, false))
                 {
                     return true;
                 }
 
-                if (mirrored && checkMatch(inv, x, y, false))
+                if (mirrored && checkMatch(inv, x, y, true))
                 {
                     return true;
                 }
