diff --git a/common/buildcraft/transport/pipes/PipePowerWood.java b/common/buildcraft/transport/pipes/PipePowerWood.java
index f553669..456bdf8 100644
--- a/common/buildcraft/transport/pipes/PipePowerWood.java
+++ b/common/buildcraft/transport/pipes/PipePowerWood.java
@@ -111,7 +111,7 @@
                 if (source instanceof IEnergyProvider) {
                     int energyExtracted = battery.addEnergy(0, ((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyMaxExtract, true),
                             false);
-                    ((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyExtracted, true);
+                    ((IEnergyProvider) source).extractEnergy(o.getOpposite(), energyExtracted, false);
                 }
             }
         }
