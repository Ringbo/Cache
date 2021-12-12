diff --git a/common/buildcraft/transport/PipeTransportPower.java b/common/buildcraft/transport/PipeTransportPower.java
index 55e6321..7d11c51 100644
--- a/common/buildcraft/transport/PipeTransportPower.java
+++ b/common/buildcraft/transport/PipeTransportPower.java
@@ -194,7 +194,7 @@
 				externalPower[out] = 0;
 
 				if (powerQuery[out] > 0 && internalPower[out] == 0) {
-					int powerConsumed = (int)Math.round((double)(powerQuery[out] * totalPowerContained) / totalPowerQuery);
+					int powerConsumed = (int)Math.floor((double)(powerQuery[out] * totalPowerContained) / totalPowerQuery);
 					boolean tilePowered = false;
 
 					if (tiles[out] instanceof TileGenericPipe) {
@@ -243,7 +243,7 @@
 
 		if (totalPowerConsumed > 0) {
 			for (int in = 0; in < 6; ++in) {
-				int powerConsumed = (int)Math.round(internalPower[in] / totalPowerContained * totalPowerConsumed);
+				int powerConsumed = (int)Math.floor(internalPower[in] / totalPowerContained * totalPowerConsumed);
 				displayPower[in] += powerConsumed;
 			}
 		}
