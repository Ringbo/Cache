diff --git a/services/java/com/android/server/ScreenRotationAnimation.java b/services/java/com/android/server/ScreenRotationAnimation.java
index bef64b3..90318f1 100644
--- a/services/java/com/android/server/ScreenRotationAnimation.java
+++ b/services/java/com/android/server/ScreenRotationAnimation.java
@@ -102,7 +102,7 @@
                 Slog.w(TAG, "Unable to allocate freeze surface", e);
             }
 
-            if (false) {
+            if (true) {
                 try {
                     int size = mOriginalWidth > mOriginalHeight ? mOriginalWidth : mOriginalHeight;
                     mBlackSurface = new Surface(session, 0, "BlackSurface",
