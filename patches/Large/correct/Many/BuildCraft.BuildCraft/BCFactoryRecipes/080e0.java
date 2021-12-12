diff --git a/common/buildcraft/factory/BCFactoryRecipes.java b/common/buildcraft/factory/BCFactoryRecipes.java
index b2aef8c..565bb44 100644
--- a/common/buildcraft/factory/BCFactoryRecipes.java
+++ b/common/buildcraft/factory/BCFactoryRecipes.java
@@ -47,7 +47,7 @@
             GameRegistry.addRecipe(builder.build());
         }
 
-        if (BCFactoryBlocks.pump != null) {
+        if (BCFactoryBlocks.pump != null && BCFactoryBlocks.tank != null) {
             ItemStack out = new ItemStack(BCFactoryBlocks.pump);
             RecipeBuilderShaped builder = new RecipeBuilderShaped(out);
             builder.add("iri");
