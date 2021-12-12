diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index d7c9c02..34737c1 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -4417,7 +4417,7 @@
                     if (mAppsToBeHidden.isEmpty()) {
                         if (dismissKeyguard && !mKeyguardSecure) {
                             mAppsThatDismissKeyguard.add(appToken);
-                        } else if (win.isDrawnLw()) {
+                        } else if (win.isDrawnLw() || win.hasAppShownWindows()) {
                             mWinShowWhenLocked = win;
                             mHideLockScreen = true;
                             mForceStatusBarFromKeyguard = false;
@@ -4451,7 +4451,8 @@
                         mWinDismissingKeyguard = win;
                         mSecureDismissingKeyguard = mKeyguardSecure;
                         mForceStatusBarFromKeyguard = mShowingLockscreen && mKeyguardSecure;
-                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked && win.isDrawnLw()) {
+                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked
+                            && (win.isDrawnLw() || win.hasAppShownWindows())) {
                         if (DEBUG_LAYOUT) Slog.v(TAG,
                                 "Setting mHideLockScreen to true by win " + win);
                         mHideLockScreen = true;
