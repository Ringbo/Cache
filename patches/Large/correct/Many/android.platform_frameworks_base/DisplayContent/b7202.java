diff --git a/services/core/java/com/android/server/wm/DisplayContent.java b/services/core/java/com/android/server/wm/DisplayContent.java
index 5cd4fc4..37695cb 100644
--- a/services/core/java/com/android/server/wm/DisplayContent.java
+++ b/services/core/java/com/android/server/wm/DisplayContent.java
@@ -3020,7 +3020,7 @@
                 final boolean foundTargetWs =
                         (w.mAppToken != null && w.mAppToken.token == appToken)
                                 || (mScreenshotApplicationState.appWin != null && wallpaperOnly);
-                if (foundTargetWs && winAnim.getShown()) {
+                if (foundTargetWs && winAnim.getShown() && winAnim.mLastAlpha > 0f) {
                     mScreenshotApplicationState.screenshotReady = true;
                 }
 
