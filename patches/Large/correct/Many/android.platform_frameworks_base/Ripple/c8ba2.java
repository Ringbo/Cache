diff --git a/graphics/java/android/graphics/drawable/Ripple.java b/graphics/java/android/graphics/drawable/Ripple.java
index ba1e86c..bb1d3cb 100644
--- a/graphics/java/android/graphics/drawable/Ripple.java
+++ b/graphics/java/android/graphics/drawable/Ripple.java
@@ -214,7 +214,7 @@
         final boolean canUseHardware = c.isHardwareAccelerated();
         if (mCanUseHardware != canUseHardware && mCanUseHardware) {
             // We've switched from hardware to non-hardware mode. Panic.
-            cancelHardwareAnimations(false);
+            cancelHardwareAnimations(true);
         }
         mCanUseHardware = canUseHardware;
 
