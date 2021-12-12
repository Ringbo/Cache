diff --git a/common/buildcraft/core/utils/BlockUtil.java b/common/buildcraft/core/utils/BlockUtil.java
index 24ae78b..c318665 100644
--- a/common/buildcraft/core/utils/BlockUtil.java
+++ b/common/buildcraft/core/utils/BlockUtil.java
@@ -163,7 +163,7 @@
 	public static FluidStack drainBlock(Block block, World world, int x, int y, int z, boolean doDrain) {
 		Fluid fluid = FluidRegistry.lookupFluidForBlock(block);
 
-		if (fluid != null) {
+		if (fluid != null && FluidRegistry.isFluidRegistered(fluid)) {
 			int meta = world.getBlockMetadata(x, y, z);
 
 			if (meta != 0) {
