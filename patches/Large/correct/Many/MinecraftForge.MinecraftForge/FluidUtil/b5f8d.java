diff --git a/src/main/java/net/minecraftforge/fluids/FluidUtil.java b/src/main/java/net/minecraftforge/fluids/FluidUtil.java
index 52facc9..f5b000f 100644
--- a/src/main/java/net/minecraftforge/fluids/FluidUtil.java
+++ b/src/main/java/net/minecraftforge/fluids/FluidUtil.java
@@ -367,7 +367,7 @@
                 max = fluidContainer.getCapacity(container);
             }
             FluidStack drained = fluidContainer.drain(container, max, false);
-            if (drained != null)
+            if (drained != null && tank.canFill(side, drained.getFluid()))
             {
                 // check how much we can fill into the tank
                 int filled = tank.fill(side, drained, false);
