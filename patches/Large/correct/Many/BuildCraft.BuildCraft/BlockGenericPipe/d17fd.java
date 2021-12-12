diff --git a/common/buildcraft/transport/BlockGenericPipe.java b/common/buildcraft/transport/BlockGenericPipe.java
index 25e5297..e2b6fd4 100644
--- a/common/buildcraft/transport/BlockGenericPipe.java
+++ b/common/buildcraft/transport/BlockGenericPipe.java
@@ -1007,7 +1007,7 @@
 		if (world.isRemote)
 			return true;
 
-		boolean placed = world.setBlock(i, j, k, blockId, meta, 1);
+		boolean placed = world.setBlock(i, j, k, blockId, meta, 3);
 
 		if (placed) {
 			TileGenericPipe tile = (TileGenericPipe) world.getBlockTileEntity(i, j, k);
