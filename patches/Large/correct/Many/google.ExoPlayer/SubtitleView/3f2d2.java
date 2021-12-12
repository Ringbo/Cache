diff --git a/library/ui/src/main/java/com/google/android/exoplayer2/ui/SubtitleView.java b/library/ui/src/main/java/com/google/android/exoplayer2/ui/SubtitleView.java
index 4dbd4d5..bb9c38d 100644
--- a/library/ui/src/main/java/com/google/android/exoplayer2/ui/SubtitleView.java
+++ b/library/ui/src/main/java/com/google/android/exoplayer2/ui/SubtitleView.java
@@ -251,7 +251,7 @@
     // Calculate the bounds after padding is taken into account.
     int left = getLeft() + getPaddingLeft();
     int top = rawTop + getPaddingTop();
-    int right = getRight() + getPaddingRight();
+    int right = getRight() - getPaddingRight();
     int bottom = rawBottom - getPaddingBottom();
     if (bottom <= top || right <= left) {
       // No space to draw subtitles.
