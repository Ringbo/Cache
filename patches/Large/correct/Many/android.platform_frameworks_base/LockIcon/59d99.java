diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
index bccc5d5..c241290 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
@@ -178,7 +178,7 @@
                     : 0);
             setRestingAlpha(
                     anyFingerprintIcon ? 1f : KeyguardAffordanceHelper.SWIPE_RESTING_ALPHA_AMOUNT);
-            setImageDrawable(icon);
+            setImageDrawable(icon, false);
             mHasFingerPrintIcon = anyFingerprintIcon;
             if (animation != null && isAnim) {
                 animation.forceAnimationOnUI();
