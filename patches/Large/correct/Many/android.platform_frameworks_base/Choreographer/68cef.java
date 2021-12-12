diff --git a/core/java/android/view/Choreographer.java b/core/java/android/view/Choreographer.java
index 3072c67..78dc86f 100644
--- a/core/java/android/view/Choreographer.java
+++ b/core/java/android/view/Choreographer.java
@@ -493,7 +493,7 @@
             if (jitterNanos >= mFrameIntervalNanos) {
                 final long skippedFrames = jitterNanos / mFrameIntervalNanos;
                 if (skippedFrames >= SKIPPED_FRAME_WARNING_LIMIT) {
-                    Log.w(TAG, "Skipped " + skippedFrames + " frames!  "
+                    Log.i(TAG, "Skipped " + skippedFrames + " frames!  "
                             + "The application may be doing too much work on its main thread.");
                 }
                 final long lastFrameOffset = jitterNanos % mFrameIntervalNanos;
