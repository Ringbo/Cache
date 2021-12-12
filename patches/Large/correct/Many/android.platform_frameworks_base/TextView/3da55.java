diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 9941c95..3c63b17 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -11680,7 +11680,7 @@
                 highlight = null;
             }
 
-            if (canHaveDisplayList() && canvas.isHardwareAccelerated()) {
+            if (false /* TEMP patch for bugs 6198276 & 6193544 */ && canHaveDisplayList() && canvas.isHardwareAccelerated()) {
                 drawHardwareAccelerated(canvas, layout, highlight, cursorOffsetVertical);
             } else {
                 layout.draw(canvas, highlight, mHighlightPaint, cursorOffsetVertical);
