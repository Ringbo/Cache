diff --git a/common/buildcraft/transport/client/render/PipeFlowRendererFluids.java b/common/buildcraft/transport/client/render/PipeFlowRendererFluids.java
index 9939663..6cb504a 100644
--- a/common/buildcraft/transport/client/render/PipeFlowRendererFluids.java
+++ b/common/buildcraft/transport/client/render/PipeFlowRendererFluids.java
@@ -74,7 +74,7 @@
             Vec3d min = center.subtract(radius);
             Vec3d max = center.add(radius);
 
-            FluidRenderer.renderFluid(FluidSpriteType.STILL, forRender, amounts[face.getIndex()] / flow.capacity, 1, min, max, vb, sides);
+            FluidRenderer.renderFluid(FluidSpriteType.STILL, forRender, amounts[face.getIndex()] / flow.capacity, 1, min, max, fluidBuffer, sides);
         }
         double amount = amounts[EnumPipePart.CENTER.getIndex()];
 
@@ -85,7 +85,7 @@
         if (horizontal | !vertical) {
             Vec3d min = new Vec3d(0.26, 0.26, 0.26);
             Vec3d max = new Vec3d(0.74, 0.74, 0.74);
-            FluidRenderer.renderFluid(FluidSpriteType.STILL, forRender, amount / flow.capacity, 1, min, max, vb, sides);
+            FluidRenderer.renderFluid(FluidSpriteType.STILL, forRender, amount / flow.capacity, 1, min, max, fluidBuffer, sides);
         }
 
         if (vertical) {
