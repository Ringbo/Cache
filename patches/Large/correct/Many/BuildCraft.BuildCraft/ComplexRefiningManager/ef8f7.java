diff --git a/common/buildcraft/factory/refining/ComplexRefiningManager.java b/common/buildcraft/factory/refining/ComplexRefiningManager.java
index 5d7b372..124f046 100644
--- a/common/buildcraft/factory/refining/ComplexRefiningManager.java
+++ b/common/buildcraft/factory/refining/ComplexRefiningManager.java
@@ -173,7 +173,7 @@
         addDistilationRecipe(fuelMixedHeavy[2], _light_dense, fuelLight[2], _light, fuelDense[2], _dense, 3);
         addDistilationRecipe(oilDense[3], _dense_residue, fuelDense[3], _dense, oilResidue[3], _residue, 3);
 
-        final int powerBase = 60;
+        final int powerBase = 40;
         // Minimum possible to make gas work the same as the others... :/ (1 tick per mB)
         final int timeBase = 128_000;
 
