diff --git a/packages/SystemUI/src/com/android/systemui/stackdivider/DividerView.java b/packages/SystemUI/src/com/android/systemui/stackdivider/DividerView.java
index 0c77036..ecfa4ff 100644
--- a/packages/SystemUI/src/com/android/systemui/stackdivider/DividerView.java
+++ b/packages/SystemUI/src/com/android/systemui/stackdivider/DividerView.java
@@ -825,7 +825,10 @@
                 .setDuration(animDuration)
                 .start();
         mAdjustedForIme = adjustedForIme;
-        if (mHomeStackResizable && adjustedForIme) {
+
+        // Only get new position if home stack is resizable, ime is open and not minimized
+        // (including the animation)
+        if (mHomeStackResizable && adjustedForIme && !mIsInMinimizeInteraction) {
             mDividerPositionBeforeMinimized = getCurrentPosition();
         }
     }
