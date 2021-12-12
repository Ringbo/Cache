diff --git a/services/core/java/com/android/server/display/DisplayPowerController.java b/services/core/java/com/android/server/display/DisplayPowerController.java
index 1be507e..3c66526 100644
--- a/services/core/java/com/android/server/display/DisplayPowerController.java
+++ b/services/core/java/com/android/server/display/DisplayPowerController.java
@@ -815,7 +815,7 @@
             mAppliedTemporaryAutoBrightnessAdjustment = true;
         } else {
             autoBrightnessAdjustment = mAutoBrightnessAdjustment;
-            mAppliedTemporaryAutoBrightnessAdjustment = true;
+            mAppliedTemporaryAutoBrightnessAdjustment = false;
         }
 
         // Apply brightness boost.
