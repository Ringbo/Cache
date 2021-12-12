diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 573a4e7..056d10c 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -5001,7 +5001,10 @@
                                 break;
                             }
                         } else {
-                            if (mTouchMode == TOUCH_INIT_MODE) {
+                            // only trigger double tap if the WebView is
+                            // scalable
+                            if (mTouchMode == TOUCH_INIT_MODE
+                                    && (canZoomIn() || canZoomOut())) {
                                 mPrivateHandler.sendEmptyMessageDelayed(
                                         RELEASE_SINGLE_TAP, ViewConfiguration
                                                 .getDoubleTapTimeout());
