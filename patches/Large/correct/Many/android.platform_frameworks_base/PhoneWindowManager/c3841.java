diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 0423aa3..4d22a32 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -4410,7 +4410,7 @@
                     if (mAppsToBeHidden.isEmpty()) {
                         if (dismissKeyguard && !mKeyguardSecure) {
                             mAppsThatDismissKeyguard.add(appToken);
-                        } else if (win.isDrawnLw()) {
+                        } else if (win.isDrawnLw() || win.hasAppShownWindows()) {
                             mWinShowWhenLocked = win;
                             mHideLockScreen = true;
                             mForceStatusBarFromKeyguard = false;
@@ -4444,7 +4444,8 @@
                         mWinDismissingKeyguard = win;
                         mSecureDismissingKeyguard = mKeyguardSecure;
                         mForceStatusBarFromKeyguard = mShowingLockscreen && mKeyguardSecure;
-                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked && win.isDrawnLw()) {
+                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked
+                            && (win.isDrawnLw() || win.hasAppShownWindows())) {
                         if (DEBUG_LAYOUT) Slog.v(TAG,
                                 "Setting mHideLockScreen to true by win " + win);
                         mHideLockScreen = true;
