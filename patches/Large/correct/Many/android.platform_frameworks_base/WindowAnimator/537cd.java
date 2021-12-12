diff --git a/services/core/java/com/android/server/wm/WindowAnimator.java b/services/core/java/com/android/server/wm/WindowAnimator.java
index 7630178..85a9624 100644
--- a/services/core/java/com/android/server/wm/WindowAnimator.java
+++ b/services/core/java/com/android/server/wm/WindowAnimator.java
@@ -500,7 +500,13 @@
                         mPostKeyguardExitAnimation.getStartOffset(),
                         mPostKeyguardExitAnimation.getDuration());
                 mKeyguardGoingAway = false;
-            } else if (mPostKeyguardExitAnimation.hasEnded()) {
+            }
+            // mPostKeyguardExitAnimation might either be ended normally, cancelled, or "orphaned",
+            // meaning that the window it was running on was removed. We check for hasEnded() for
+            // ended normally and cancelled case, and check the time for the "orphaned" case.
+            else if (mPostKeyguardExitAnimation.hasEnded()
+                    || mCurrentTime - mPostKeyguardExitAnimation.getStartTime()
+                            > mPostKeyguardExitAnimation.getDuration()) {
                 // Done with the animation, reset.
                 if (DEBUG_KEYGUARD) Slog.v(TAG, "Done with Keyguard exit animations.");
                 mPostKeyguardExitAnimation = null;
