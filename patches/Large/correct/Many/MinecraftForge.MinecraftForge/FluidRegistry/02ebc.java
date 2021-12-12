diff --git a/src/main/java/net/minecraftforge/fluids/FluidRegistry.java b/src/main/java/net/minecraftforge/fluids/FluidRegistry.java
index 30d7774..cd9ef92 100644
--- a/src/main/java/net/minecraftforge/fluids/FluidRegistry.java
+++ b/src/main/java/net/minecraftforge/fluids/FluidRegistry.java
@@ -79,7 +79,7 @@
      */
     public static boolean registerFluid(Fluid fluid)
     {
-        if (fluidIDs.containsKey(fluid.getName()))
+        if (fluids.containsKey(fluid.getName()))
         {
             FMLLog.bigWarning("Duplicate registration attempt for fluid %s (type %s) has occurred. This is not a problem itself, but subsequent failed FluidStacks might be a result if not handled properly", fluid.getName(), fluid.getClass().getName());
             return false;
