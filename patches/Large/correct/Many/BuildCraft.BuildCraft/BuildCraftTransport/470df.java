diff --git a/common/buildcraft/BuildCraftTransport.java b/common/buildcraft/BuildCraftTransport.java
index 38fca05..6732d0f 100644
--- a/common/buildcraft/BuildCraftTransport.java
+++ b/common/buildcraft/BuildCraftTransport.java
@@ -556,7 +556,7 @@
 		// Add base recipe for pipe waterproof.
 		GameRegistry.addShapelessRecipe(new ItemStack(pipeWaterproof, 1), new ItemStack(Items.dye, 1, 2));
 		if (additionalWaterproofingRecipe) {
-			GameRegistry.addShapelessRecipe(new ItemStack(pipeWaterproof, 1), new ItemStack(Items.slime_ball, 1, 2));
+			GameRegistry.addShapelessRecipe(new ItemStack(pipeWaterproof, 1), new ItemStack(Items.slime_ball));
 		}
 
 		// Add pipe recipes
