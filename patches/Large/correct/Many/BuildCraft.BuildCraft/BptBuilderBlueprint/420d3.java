diff --git a/common/buildcraft/core/blueprints/BptBuilderBlueprint.java b/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
index 732a7cc..99ad196 100644
--- a/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
+++ b/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
@@ -611,7 +611,7 @@
 				FluidStack fluidStack = fluid != null ? FluidContainerRegistry.getFluidForFilledItem(invStk) : null;
 				boolean fluidFound = fluidStack != null && fluidStack.getFluid() == fluid && fluidStack.amount >= FluidContainerRegistry.BUCKET_VOLUME;
 
-				if (fluidFound || StackHelper.isCraftingEquivalent(reqStk, invStk, true)) {
+				if (fluidFound || StackHelper.isMatchingItem(reqStk, invStk, true, true)) {
 					try {
 						usedStack = slot.getSchematic().useItem(context, reqStk, slotInv);
 						slot.addStackConsumed (usedStack);
