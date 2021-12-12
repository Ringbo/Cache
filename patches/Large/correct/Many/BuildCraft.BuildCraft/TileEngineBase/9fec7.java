diff --git a/common/buildcraft/core/lib/engines/TileEngineBase.java b/common/buildcraft/core/lib/engines/TileEngineBase.java
index f7f00af..ecc4019 100644
--- a/common/buildcraft/core/lib/engines/TileEngineBase.java
+++ b/common/buildcraft/core/lib/engines/TileEngineBase.java
@@ -383,7 +383,7 @@
 		for (int i = orientation.ordinal() + 1; i <= orientation.ordinal() + 6; ++i) {
 			ForgeDirection o = ForgeDirection.VALID_DIRECTIONS[i % 6];
 
-			TileEntity tile = getTile(o);
+			Object tile = getEnergyProvider(o);
 
 			if ((!pipesOnly || tile instanceof IPipeTile) && isPoweredTile(tile, o)) {
 				orientation = o;
