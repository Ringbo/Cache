diff --git a/graphics/java/android/graphics/drawable/TransitionDrawable.java b/graphics/java/android/graphics/drawable/TransitionDrawable.java
index 4470356..9a3ca40 100644
--- a/graphics/java/android/graphics/drawable/TransitionDrawable.java
+++ b/graphics/java/android/graphics/drawable/TransitionDrawable.java
@@ -137,7 +137,7 @@
         final long time = SystemClock.uptimeMillis();
         // Animation is over
         if (time - mStartTimeMillis > mDuration) {
-            if (mAlpha == 0) {
+            if (mTo == 0) {
                 mFrom = 0;
                 mTo = 255;
                 mAlpha = 0;
