diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index f6e771a..5e8ec47 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -10918,7 +10918,7 @@
             final boolean ltrLine =
                     mLayout.getParagraphDirection(line) == Layout.DIR_LEFT_TO_RIGHT;
             final float[] widths = new float[offsetEnd - offsetStart];
-            mLayout.getPaint().getTextWidths(mText, offsetStart, offsetEnd, widths);
+            mLayout.getPaint().getTextWidths(mTransformed, offsetStart, offsetEnd, widths);
             final float top = mLayout.getLineTop(line);
             final float bottom = mLayout.getLineBottom(line);
             for (int offset = offsetStart; offset < offsetEnd; ++offset) {
