diff --git a/common/buildcraft/transport/EnergyPulser.java b/common/buildcraft/transport/EnergyPulser.java
index 1910e2d..ff3e87e 100644
--- a/common/buildcraft/transport/EnergyPulser.java
+++ b/common/buildcraft/transport/EnergyPulser.java
@@ -27,7 +27,7 @@
 			if (!singlePulse || !hasPulsed) {
 				if (tick % 10 == 0 || !hasPulsed)
 				{
-					powerReceptor.getPowerProvider().receiveEnergy(Math.max(1 << (pulseCount-1),64), ForgeDirection.WEST);
+					powerReceptor.getPowerProvider().receiveEnergy(Math.min(1 << (pulseCount-1),64), ForgeDirection.WEST);
 					if (singlePulse) {
 						hasPulsed = true;
 					}
