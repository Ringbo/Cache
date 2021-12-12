diff --git a/common/buildcraft/transport/pipes/PipePowerWood.java b/common/buildcraft/transport/pipes/PipePowerWood.java
index 6ccd9c3..2ef1e56 100644
--- a/common/buildcraft/transport/pipes/PipePowerWood.java
+++ b/common/buildcraft/transport/pipes/PipePowerWood.java
@@ -118,12 +118,12 @@
 					int energyExtracted = battery.addEnergy(0,
 							((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyMaxExtract, true),
 							false);
-					((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyExtracted, true);
+					((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyExtracted, false);
 				} else if (source instanceof IEnergyHandler) {
 					int energyExtracted = battery.addEnergy(0,
 							((IEnergyHandler) source).extractEnergy(o.getOpposite(), energyMaxExtract, true),
 							false);
-					((IEnergyHandler) source).extractEnergy(o.getOpposite(), energyExtracted, true);
+					((IEnergyHandler) source).extractEnergy(o.getOpposite(), energyExtracted, false);
 				}
 			}
 		}
