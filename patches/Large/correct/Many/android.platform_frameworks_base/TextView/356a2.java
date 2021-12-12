diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 68c49cd..574f24b 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -669,11 +669,11 @@
         final Resources res = getResources();
         final CompatibilityInfo compat = res.getCompatibilityInfo();
 
-        mTextPaint = new TextPaint();
+        mTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
         mTextPaint.density = res.getDisplayMetrics().density;
         mTextPaint.setCompatibilityScaling(compat.applicationScale);
 
-        mHighlightPaint = new Paint();
+        mHighlightPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         mHighlightPaint.setCompatibilityScaling(compat.applicationScale);
 
         mMovement = getDefaultMovementMethod();
