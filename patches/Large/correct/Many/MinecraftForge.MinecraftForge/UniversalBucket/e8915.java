diff --git a/src/main/java/net/minecraftforge/fluids/UniversalBucket.java b/src/main/java/net/minecraftforge/fluids/UniversalBucket.java
index c8af1a2..c6f51a9 100644
--- a/src/main/java/net/minecraftforge/fluids/UniversalBucket.java
+++ b/src/main/java/net/minecraftforge/fluids/UniversalBucket.java
@@ -90,7 +90,7 @@
 
         if (StatCollector.canTranslate(unloc + "." + fluidStack.getFluid().getName()))
         {
-            return StatCollector.translateToFallback(unloc + "." + fluidStack.getFluid().getName());
+            return StatCollector.translateToLocal(unloc + "." + fluidStack.getFluid().getName());
         }
 
         return StatCollector.translateToLocalFormatted(unloc + ".name", fluidStack.getLocalizedName());
