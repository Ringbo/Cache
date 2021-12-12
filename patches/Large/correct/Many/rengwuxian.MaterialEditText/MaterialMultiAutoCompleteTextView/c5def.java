diff --git a/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java b/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
index 4e5ed35..01ace01 100644
--- a/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
+++ b/library/src/main/java/com/rengwuxian/materialedittext/MaterialMultiAutoCompleteTextView.java
@@ -628,10 +628,10 @@
     int destBottomLines;
     textPaint.setTextSize(bottomTextSize);
     if (tempErrorText != null) {
-      textLayout = new StaticLayout(tempErrorText, textPaint, getWidth() - getBottomTextLeftOffset() - getBottomTextRightOffset() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
+      textLayout = new StaticLayout(tempErrorText, textPaint, getMeasuredWidth() - getBottomTextLeftOffset() - getBottomTextRightOffset() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
       destBottomLines = Math.max(textLayout.getLineCount(), minBottomTextLines);
     } else if (helperText != null) {
-      textLayout = new StaticLayout(helperText, textPaint, getWidth() - getBottomTextLeftOffset() - getBottomTextRightOffset() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
+      textLayout = new StaticLayout(helperText, textPaint, getMeasuredWidth() - getBottomTextLeftOffset() - getBottomTextRightOffset() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
       destBottomLines = Math.max(textLayout.getLineCount(), minBottomTextLines);
     } else {
       destBottomLines = minBottomLines;
