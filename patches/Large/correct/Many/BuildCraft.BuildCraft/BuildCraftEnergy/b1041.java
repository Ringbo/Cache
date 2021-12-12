diff --git a/common/buildcraft/BuildCraftEnergy.java b/common/buildcraft/BuildCraftEnergy.java
index 50937ba..85bf64b 100644
--- a/common/buildcraft/BuildCraftEnergy.java
+++ b/common/buildcraft/BuildCraftEnergy.java
@@ -177,7 +177,7 @@
 		IronEngineFuel.fuels.add(new IronEngineFuel(LiquidDictionary.getLiquid("Fuel", LiquidContainerRegistry.BUCKET_VOLUME), 6, 100000));
 
 		// Iron Engine Coolants
-		IronEngineCoolant.addCoolant(new LiquidStack(Block.waterStill, LiquidContainerRegistry.BUCKET_VOLUME), 0.0025F);
+		IronEngineCoolant.addCoolant(new LiquidStack(Block.waterStill, LiquidContainerRegistry.BUCKET_VOLUME), 0.0023F);
 		IronEngineCoolant.addCoolant(Block.ice.blockID, 0, new LiquidStack(Block.waterStill, LiquidContainerRegistry.BUCKET_VOLUME * 2));
 
 		LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Oil", LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(
