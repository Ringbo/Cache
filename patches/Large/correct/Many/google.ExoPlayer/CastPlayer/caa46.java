diff --git a/extensions/cast/src/main/java/com/google/android/exoplayer2/ext/cast/CastPlayer.java b/extensions/cast/src/main/java/com/google/android/exoplayer2/ext/cast/CastPlayer.java
index 65ae097..3c91b7a 100644
--- a/extensions/cast/src/main/java/com/google/android/exoplayer2/ext/cast/CastPlayer.java
+++ b/extensions/cast/src/main/java/com/google/android/exoplayer2/ext/cast/CastPlayer.java
@@ -495,7 +495,7 @@
   @Override
   public @Nullable Object getCurrentTag() {
     int windowIndex = getCurrentWindowIndex();
-    return windowIndex > currentTimeline.getWindowCount()
+    return windowIndex >= currentTimeline.getWindowCount()
         ? null
         : currentTimeline.getWindow(windowIndex, window, /* setTag= */ true).tag;
   }
