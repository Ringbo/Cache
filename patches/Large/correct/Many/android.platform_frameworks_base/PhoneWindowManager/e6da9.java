diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 9ddbcca..48e205f 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -4462,7 +4462,7 @@
                     if (mAppsToBeHidden.isEmpty()) {
                         if (dismissKeyguard && !mKeyguardSecure) {
                             mAppsThatDismissKeyguard.add(appToken);
-                        } else if (win.isDrawnLw()) {
+                        } else if (win.isDrawnLw() || win.hasAppShownWindows()) {
                             mWinShowWhenLocked = win;
                             mHideLockScreen = true;
                             mForceStatusBarFromKeyguard = false;
@@ -4496,7 +4496,8 @@
                         mWinDismissingKeyguard = win;
                         mSecureDismissingKeyguard = mKeyguardSecure;
                         mForceStatusBarFromKeyguard = mShowingLockscreen && mKeyguardSecure;
-                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked && win.isDrawnLw()) {
+                    } else if (mAppsToBeHidden.isEmpty() && showWhenLocked
+                            && (win.isDrawnLw() || win.hasAppShownWindows())) {
                         if (DEBUG_LAYOUT) Slog.v(TAG,
                                 "Setting mHideLockScreen to true by win " + win);
                         mHideLockScreen = true;
