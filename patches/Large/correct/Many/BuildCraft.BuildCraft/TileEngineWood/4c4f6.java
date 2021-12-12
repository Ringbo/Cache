diff --git a/common/buildcraft/energy/TileEngineWood.java b/common/buildcraft/energy/TileEngineWood.java
index 8d9951e..8e0a256 100644
--- a/common/buildcraft/energy/TileEngineWood.java
+++ b/common/buildcraft/energy/TileEngineWood.java
@@ -83,7 +83,7 @@
 
 		if (isRedstonePowered) {
 			if (worldObj.getTotalWorldTime() % 16 == 0) {
-				addEnergy(1);
+				addEnergy(10);
 			}
 		}
 	}
@@ -110,7 +110,7 @@
 
 	@Override
 	public int maxEnergyExtracted() {
-		return 1;
+		return 10;
 	}
 
 	// TODO: HACK
