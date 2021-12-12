diff --git a/services/java/com/android/server/wm/WindowManagerService.java b/services/java/com/android/server/wm/WindowManagerService.java
index c1a4bd0..1c5a70f 100644
--- a/services/java/com/android/server/wm/WindowManagerService.java
+++ b/services/java/com/android/server/wm/WindowManagerService.java
@@ -7661,7 +7661,7 @@
         }
         final int NEAT = mExitingAppTokens.size();
         for (i=0; i<NEAT; i++) {
-            final AppWindowToken appToken = mAppTokens.get(i);
+            final AppWindowToken appToken = mExitingAppTokens.get(i);
             if (appToken.startAndFinishAnimationLocked(currentTime, innerDw, innerDh)) {
                 mStepAnimators.add(appToken);
                 mInnerFields.mAnimating = true;
