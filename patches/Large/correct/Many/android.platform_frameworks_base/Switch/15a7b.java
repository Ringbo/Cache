diff --git a/core/java/android/widget/Switch.java b/core/java/android/widget/Switch.java
index 356df31..ff587c2 100644
--- a/core/java/android/widget/Switch.java
+++ b/core/java/android/widget/Switch.java
@@ -214,7 +214,7 @@
     public Switch(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
         super(context, attrs, defStyleAttr, defStyleRes);
 
-        mTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
+        mTextPaint = new TextPaint();
 
         final Resources res = getResources();
         mTextPaint.density = res.getDisplayMetrics().density;
