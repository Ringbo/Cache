diff --git a/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java b/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
index b89e0a2..2db3181 100644
--- a/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
+++ b/library/src/main/java/com/rengwuxian/materialedittext/MaterialAutoCompleteTextView.java
@@ -631,10 +631,10 @@
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
