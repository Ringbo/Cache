diff --git a/graphics/java/android/graphics/drawable/RippleBackground.java b/graphics/java/android/graphics/drawable/RippleBackground.java
index cc42aac..fae4902 100644
--- a/graphics/java/android/graphics/drawable/RippleBackground.java
+++ b/graphics/java/android/graphics/drawable/RippleBackground.java
@@ -148,7 +148,7 @@
         final boolean canUseHardware = c.isHardwareAccelerated();
         if (mCanUseHardware != canUseHardware && mCanUseHardware) {
             // We've switched from hardware to non-hardware mode. Panic.
-            cancelHardwareAnimations(false);
+            cancelHardwareAnimations(true);
         }
         mCanUseHardware = canUseHardware;
 
