diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index c58ed6f..cd8da69 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -3334,7 +3334,8 @@
         if (DEBUG_LAYOUT) Slog.i(TAG, "Win " + win + ": isVisibleOrBehindKeyguardLw="
                 + win.isVisibleOrBehindKeyguardLw());
         if (mTopFullscreenOpaqueWindowState == null && (win.getAttrs().privateFlags
-                &WindowManager.LayoutParams.PRIVATE_FLAG_FORCE_SHOW_NAV_BAR) != 0) {
+                &WindowManager.LayoutParams.PRIVATE_FLAG_FORCE_SHOW_NAV_BAR) != 0
+                || (win.isVisibleLw() && attrs.type == TYPE_INPUT_METHOD)) {
             if (mForcingShowNavBarLayer < 0) {
                 mForcingShowNavBar = true;
                 mForcingShowNavBarLayer = win.getSurfaceLayer();
