diff --git a/common/buildcraft/transport/render/RenderPipe.java b/common/buildcraft/transport/render/RenderPipe.java
index a689bd8..3b06934 100644
--- a/common/buildcraft/transport/render/RenderPipe.java
+++ b/common/buildcraft/transport/render/RenderPipe.java
@@ -86,7 +86,7 @@
 		BlockInterface block = new BlockInterface();
 
 		Fluid fluid = FluidRegistry.getFluid(liquidId);
-		if (fluid.getBlockID() != 0) {
+		if (fluid.getBlockID() > 0) {
 			block.baseBlock = Block.blocksList[fluid.getBlockID()];
 		} else {
 			block.baseBlock = Block.waterStill;
