diff --git a/common/buildcraft/transport/BCTransportRecipes.java b/common/buildcraft/transport/BCTransportRecipes.java
index bd49316..f98128e 100644
--- a/common/buildcraft/transport/BCTransportRecipes.java
+++ b/common/buildcraft/transport/BCTransportRecipes.java
@@ -321,7 +321,7 @@
             throw new NullPointerException("additional");
         }
 
-        IRecipe returnRecipe = new ShapelessOreRecipe(from.getRegistryName(), new ItemStack(from), new ItemStack(to)).setRegistryName(new ResourceLocation(from.getRegistryName() + "_undo"));
+        IRecipe returnRecipe = new ShapelessOreRecipe(to.getRegistryName(), new ItemStack(from), new ItemStack(to)).setRegistryName(new ResourceLocation(to.getRegistryName() + "_undo"));
         ForgeRegistries.RECIPES.register(returnRecipe);
 
         NonNullList<Ingredient> list = NonNullList.create();
@@ -334,7 +334,7 @@
         for (EnumDyeColor colour : ColourUtil.COLOURS) {
             ItemStack f = new ItemStack(from, 1, colour.getMetadata() + 1);
             ItemStack t = new ItemStack(to, 1, colour.getMetadata() + 1);
-            IRecipe returnRecipeColored = new ShapelessOreRecipe(from.getRegistryName(), f, t).setRegistryName(new ResourceLocation(from.getRegistryName() + colour.getName() + "_undo"));
+            IRecipe returnRecipeColored = new ShapelessOreRecipe(to.getRegistryName(), f, t).setRegistryName(new ResourceLocation(to.getRegistryName() + "_" + colour.getName() + "_undo"));
             ForgeRegistries.RECIPES.register(returnRecipeColored);
 
             NonNullList<Ingredient> colorList = NonNullList.create();
