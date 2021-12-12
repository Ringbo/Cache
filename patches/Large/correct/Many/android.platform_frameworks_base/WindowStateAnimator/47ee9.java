diff --git a/services/core/java/com/android/server/wm/WindowStateAnimator.java b/services/core/java/com/android/server/wm/WindowStateAnimator.java
index 9c25f63..140f381 100644
--- a/services/core/java/com/android/server/wm/WindowStateAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowStateAnimator.java
@@ -1288,7 +1288,7 @@
         }
 
         final WindowState winShowWhenLocked = (WindowState) mPolicy.getWinShowWhenLockedLw();
-        if (w == winShowWhenLocked) {
+        if (w == winShowWhenLocked && mPolicy.isKeyguardShowingOrOccluded()) {
             return;
         }
 
