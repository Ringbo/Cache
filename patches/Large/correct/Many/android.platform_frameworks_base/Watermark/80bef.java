diff --git a/services/core/java/com/android/server/wm/Watermark.java b/services/core/java/com/android/server/wm/Watermark.java
index e226e3d..ba3ce36 100644
--- a/services/core/java/com/android/server/wm/Watermark.java
+++ b/services/core/java/com/android/server/wm/Watermark.java
@@ -84,7 +84,7 @@
         int fontSize = WindowManagerService.getPropertyInt(tokens, 1,
                 TypedValue.COMPLEX_UNIT_DIP, 20, dm);
 
-        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mTextPaint = new Paint();
         mTextPaint.setTextSize(fontSize);
         mTextPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
 
