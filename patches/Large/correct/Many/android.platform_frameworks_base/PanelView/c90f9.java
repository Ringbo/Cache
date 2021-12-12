diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
index 7261ea1..2f21781 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PanelView.java
@@ -684,7 +684,7 @@
                 removeCallbacks(mPeekRunnable);
                 mPeekRunnable.run();
             }
-        } else if (!isFullyCollapsed() && !mTracking) {
+        } else if (!isFullyCollapsed() && !mTracking && !mClosing) {
             if (mHeightAnimator != null) {
                 mHeightAnimator.cancel();
             }
