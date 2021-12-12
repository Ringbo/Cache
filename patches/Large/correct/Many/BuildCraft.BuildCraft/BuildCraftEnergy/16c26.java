diff --git a/common/buildcraft/BuildCraftEnergy.java b/common/buildcraft/BuildCraftEnergy.java
index 2546f5c..fd2105c 100644
--- a/common/buildcraft/BuildCraftEnergy.java
+++ b/common/buildcraft/BuildCraftEnergy.java
@@ -176,7 +176,7 @@
 				fluidFuel.setBlockID(blockFuel);
 			}
 		} else {
-			blockFuel = Block.blocksList[fluidOil.getBlockID()];
+			blockFuel = Block.blocksList[fluidFuel.getBlockID()];
 		}
 
 		// Buckets
