diff --git a/services/core/java/com/android/server/wm/WindowStateAnimator.java b/services/core/java/com/android/server/wm/WindowStateAnimator.java
index e319407..a0784b5 100644
--- a/services/core/java/com/android/server/wm/WindowStateAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowStateAnimator.java
@@ -1448,7 +1448,7 @@
         // the same app again before the app's surface is destroyed or saved, the surface
         // is always ready in the whole process.) If we go ahead here, the opening app
         // will be shown with the full size before the correct animation spec arrives.
-        if (mService.mAppTransition.isReady() && isDummyAnimation() &&
+        if (mService.mAppTransition.isTransitionSet() && isDummyAnimation() &&
                 mService.mOpeningApps.contains(w.mAppToken)) {
             return;
         }
