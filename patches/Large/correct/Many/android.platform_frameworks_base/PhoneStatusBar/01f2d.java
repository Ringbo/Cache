diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
index ea59ecd..a078519 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/PhoneStatusBar.java
@@ -1706,7 +1706,10 @@
                     Log.v(TAG, "DEBUG_MEDIA: Fading out album artwork");
                 }
                 mBackdrop.animate()
-                        .alpha(0f)
+                        // Never let the alpha become zero - otherwise the RenderNode
+                        // won't draw anything and uninitialized memory will show through
+                        // if mScrimSrcModeEnabled. Note that 0.001 is rounded down to 0 in libhwui.
+                        .alpha(0.002f)
                         .setInterpolator(mBackdropInterpolator)
                         .setDuration(300)
                         .setStartDelay(0)
