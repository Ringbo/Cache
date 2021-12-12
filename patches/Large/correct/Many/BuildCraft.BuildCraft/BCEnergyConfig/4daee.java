diff --git a/common/buildcraft/energy/BCEnergyConfig.java b/common/buildcraft/energy/BCEnergyConfig.java
index 7ee5e06..456c4a6 100644
--- a/common/buildcraft/energy/BCEnergyConfig.java
+++ b/common/buildcraft/energy/BCEnergyConfig.java
@@ -84,7 +84,7 @@
             addBiomeNames(propExcessiveBiomes, excessiveBiomes);
             addBiomeNames(propSurfaceDepositBiomes, surfaceDepositBiomes);
             excludedDimensions.clear();
-            excludedDimensions.addAll(propExcludedBiomes.getIntList());
+            excludedDimensions.addAll(propExcludedDimensions.getIntList());
 
             if (EnumRestartRequirement.GAME.hasBeenRestarted(restarted)) {
                 enableOilGeneration = propEnableOilGeneration.getBoolean();
