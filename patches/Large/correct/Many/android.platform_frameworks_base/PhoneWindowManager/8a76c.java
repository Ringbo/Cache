diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 671c44e..6a63aab 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -4264,7 +4264,7 @@
             // that is being hidden in an animation - keep the
             // keyguard hidden until the new window shows up and
             // we know whether to show the keyguard or not.
-            if (win.isAnimatingLw() && appWindow && showWhenLocked) {
+            if (win.isAnimatingLw() && appWindow && showWhenLocked && mKeyguardHidden) {
                 mHideLockScreen = true;
                 mWinShowWhenLocked = win;
             }
