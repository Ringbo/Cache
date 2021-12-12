diff --git a/library/src/main/java/com/google/android/exoplayer2/ui/SubtitlePainter.java b/library/src/main/java/com/google/android/exoplayer2/ui/SubtitlePainter.java
index 6a1f31d..5ca9740 100644
--- a/library/src/main/java/com/google/android/exoplayer2/ui/SubtitlePainter.java
+++ b/library/src/main/java/com/google/android/exoplayer2/ui/SubtitlePainter.java
@@ -325,7 +325,7 @@
   }
 
   private void drawTextLayout(Canvas canvas) {
-    final StaticLayout layout = textLayout;
+    StaticLayout layout = textLayout;
     if (layout == null) {
       // Nothing to draw.
       return;
