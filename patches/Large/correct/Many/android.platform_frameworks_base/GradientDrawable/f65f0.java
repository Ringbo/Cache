diff --git a/graphics/java/android/graphics/drawable/GradientDrawable.java b/graphics/java/android/graphics/drawable/GradientDrawable.java
index dc9aa67..4c2817c 100644
--- a/graphics/java/android/graphics/drawable/GradientDrawable.java
+++ b/graphics/java/android/graphics/drawable/GradientDrawable.java
@@ -133,7 +133,7 @@
 
     private GradientState mGradientState;
 
-    private final Paint mFillPaint = new Paint();
+    private final Paint mFillPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
     private Rect mPadding;
     private Paint mStrokePaint;   // optional, set by the caller
     private ColorFilter mColorFilter;   // optional, set by the caller
@@ -323,7 +323,7 @@
 
     private void setStrokeInternal(int width, int color, float dashWidth, float dashGap) {
         if (mStrokePaint == null)  {
-            mStrokePaint = new Paint();
+            mStrokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
             mStrokePaint.setStyle(Paint.Style.STROKE);
         }
         mStrokePaint.setStrokeWidth(width);
@@ -1802,7 +1802,7 @@
         mPadding = state.mPadding;
 
         if (state.mStrokeWidth >= 0) {
-            mStrokePaint = new Paint();
+            mStrokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
             mStrokePaint.setStyle(Paint.Style.STROKE);
             mStrokePaint.setStrokeWidth(state.mStrokeWidth);
 
