diff --git a/services/core/java/com/android/server/wm/SurfaceControlWithBackground.java b/services/core/java/com/android/server/wm/SurfaceControlWithBackground.java
index 9eb2b46..d3c2c80 100644
--- a/services/core/java/com/android/server/wm/SurfaceControlWithBackground.java
+++ b/services/core/java/com/android/server/wm/SurfaceControlWithBackground.java
@@ -189,7 +189,7 @@
         // for background width/height then screen size at the end of the animation. Will round when
         // the value is smaller then some empiric epsilon. However, this should be fixed by
         // computing correct frames for letterboxed windows in WindowState.
-        d = d < 0.02f ? 0 : d;
+        d = d < 0.025f ? 0 : d;
         mWindowSurfaceController.getContainerRect(mTmpContainerRect);
         final int backgroundWidth =
                 (int) (crop.width() + (mTmpContainerRect.width() - mLastWidth) * (1 - d) + 0.5);
