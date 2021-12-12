diff --git a/packages/SystemUI/src/com/android/systemui/ScreenDecorations.java b/packages/SystemUI/src/com/android/systemui/ScreenDecorations.java
index 6a63b04..194679c 100644
--- a/packages/SystemUI/src/com/android/systemui/ScreenDecorations.java
+++ b/packages/SystemUI/src/com/android/systemui/ScreenDecorations.java
@@ -126,7 +126,8 @@
 
             @Override
             public void onDisplayChanged(int displayId) {
-                if (mRotation != RotationUtils.getExactRotation(mContext)) {
+                if (mOverlay != null && mBottomOverlay != null
+                        && mRotation != RotationUtils.getExactRotation(mContext)) {
                     // We cannot immediately update the orientation. Otherwise
                     // WindowManager is still deferring layout until it has finished dispatching
                     // the config changes, which may cause divergence between what we draw
