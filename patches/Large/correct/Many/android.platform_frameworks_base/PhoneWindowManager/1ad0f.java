diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index e4ca8d8..3351e61 100755
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -2925,14 +2925,14 @@
                 mNoDreamEnterAnim = true;
             }
             if (((attrs.type >= FIRST_APPLICATION_WINDOW && attrs.type <= LAST_APPLICATION_WINDOW)
-                        || attrs.type == TYPE_DREAM)
+                        || (attrs.type == TYPE_DREAM && win.isVisibleLw()))
                     && attrs.x == 0 && attrs.y == 0
                     && attrs.width == WindowManager.LayoutParams.MATCH_PARENT
                     && attrs.height == WindowManager.LayoutParams.MATCH_PARENT) {
                 if (DEBUG_LAYOUT) Log.v(TAG, "Fullscreen window: " + win);
                 mTopFullscreenOpaqueWindowState = win;
                 if (attrs.type == TYPE_DREAM) {
-                    mNoDreamEnterAnim = true;
+                    mForceStatusBarFromKeyguard = true;
                 }
                 if ((attrs.flags & FLAG_SHOW_WHEN_LOCKED) != 0) {
                     if (DEBUG_LAYOUT) Log.v(TAG, "Setting mHideLockScreen to true by win " + win);
