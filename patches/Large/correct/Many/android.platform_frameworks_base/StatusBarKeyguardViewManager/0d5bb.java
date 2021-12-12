diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
index 1a64b00..5975608 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
@@ -154,7 +154,7 @@
             if (expansion == 1) {
                 mBouncer.onFullyHidden();
             } else if (!mBouncer.isShowing() && !mBouncer.isAnimatingAway()) {
-                mBouncer.show(true /* resetSecuritySelection */, false /* notifyFalsing */);
+                mBouncer.show(false /* resetSecuritySelection */, false /* notifyFalsing */);
             } else if (noLongerTracking) {
                 // Notify that falsing manager should stop its session when user stops touching,
                 // even before the animation ends, to guarantee that we're not recording sensitive
