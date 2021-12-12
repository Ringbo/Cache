diff --git a/library/core/src/main/java/com/google/android/exoplayer2/ExoPlayerImpl.java b/library/core/src/main/java/com/google/android/exoplayer2/ExoPlayerImpl.java
index 06c9597..b7b9afd 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/ExoPlayerImpl.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/ExoPlayerImpl.java
@@ -380,7 +380,7 @@
   @Override
   public @Nullable Object getCurrentTag() {
     int windowIndex = getCurrentWindowIndex();
-    return windowIndex > playbackInfo.timeline.getWindowCount()
+    return windowIndex >= playbackInfo.timeline.getWindowCount()
         ? null
         : playbackInfo.timeline.getWindow(windowIndex, window, /* setTag= */ true).tag;
   }
