diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
index d296498..f5c5e56 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/StatusBarKeyguardViewManager.java
@@ -48,7 +48,7 @@
 public class StatusBarKeyguardViewManager implements RemoteInputController.Callback {
 
     // When hiding the Keyguard with timing supplied from WindowManager, better be early than late.
-    private static final long HIDE_TIMING_CORRECTION_MS = -3 * 16;
+    private static final long HIDE_TIMING_CORRECTION_MS = - 16 * 3;
 
     // Delay for showing the navigation bar when the bouncer appears. This should be kept in sync
     // with the appear animations of the PIN/pattern/password views.
@@ -396,7 +396,8 @@
                 if (endRunnable != null) {
                     endRunnable.run();
                 }
-                mStatusBarWindowManager.setKeyguardFadingAway(false);
+                mContainer.postDelayed(() -> mStatusBarWindowManager.setKeyguardFadingAway(false),
+                        100);
                 mPhoneStatusBar.finishKeyguardFadingAway();
                 mFingerprintUnlockController.finishKeyguardFadingAway();
                 WindowManagerGlobal.getInstance().trimMemory(
