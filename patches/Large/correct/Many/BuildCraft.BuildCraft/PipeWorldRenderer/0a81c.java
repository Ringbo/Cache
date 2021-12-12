diff --git a/common/buildcraft/transport/render/PipeWorldRenderer.java b/common/buildcraft/transport/render/PipeWorldRenderer.java
index 5e013b7..973fa6e 100644
--- a/common/buildcraft/transport/render/PipeWorldRenderer.java
+++ b/common/buildcraft/transport/render/PipeWorldRenderer.java
@@ -361,7 +361,7 @@
 		zeroState[0][1] = 0.75F - zFightOffset;
 		// Y START - END
 		zeroState[1][0] = 0.125F;
-		zeroState[1][1] = 0.25F;
+		zeroState[1][1] = 0.251F;
 		// Z START - END
 		zeroState[2][0] = 0.25F + zFightOffset;
 		zeroState[2][1] = 0.75F - zFightOffset;
@@ -537,37 +537,37 @@
 		float max = Utils.pipeMaxPos - 0.05F;
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.WEST)) {
-			block.setBlockBounds(Utils.pipeMinPos - 0.10F, min, min, Utils.pipeMinPos, max, max);
+			block.setBlockBounds(Utils.pipeMinPos - 0.10F, min, min, Utils.pipeMinPos + 0.001F, max, max);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.EAST)) {
-			block.setBlockBounds(Utils.pipeMaxPos, min, min, Utils.pipeMaxPos + 0.10F, max, max);
+			block.setBlockBounds(Utils.pipeMaxPos + 0.001F, min, min, Utils.pipeMaxPos + 0.10F, max, max);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.DOWN)) {
-			block.setBlockBounds(min, Utils.pipeMinPos - 0.10F, min, max, Utils.pipeMinPos, max);
+			block.setBlockBounds(min, Utils.pipeMinPos - 0.10F, min, max, Utils.pipeMinPos + 0.001F, max);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.UP)) {
-			block.setBlockBounds(min, Utils.pipeMaxPos, min, max, Utils.pipeMaxPos + 0.10F, max);
+			block.setBlockBounds(min, Utils.pipeMaxPos + 0.001F, min, max, Utils.pipeMaxPos + 0.10F, max);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.NORTH)) {
-			block.setBlockBounds(min, min, Utils.pipeMinPos - 0.10F, max, max, Utils.pipeMinPos);
+			block.setBlockBounds(min, min, Utils.pipeMinPos - 0.10F, max, max, Utils.pipeMinPos + 0.001F);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
 
 		if (shouldRenderNormalPipeSide(state, ForgeDirection.SOUTH)) {
-			block.setBlockBounds(min, min, Utils.pipeMaxPos, max, max, Utils.pipeMaxPos + 0.10F);
+			block.setBlockBounds(min, min, Utils.pipeMaxPos + 0.001F, max, max, Utils.pipeMaxPos + 0.10F);
 			renderblocks.setRenderBoundsFromBlock(block);
 			renderblocks.renderStandardBlock(block, x, y, z);
 		}
