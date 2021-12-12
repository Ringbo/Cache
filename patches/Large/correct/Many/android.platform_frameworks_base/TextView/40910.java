diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index 92cc361..faeee5e 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -669,11 +669,11 @@
         final Resources res = getResources();
         final CompatibilityInfo compat = res.getCompatibilityInfo();
 
-        mTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
+        mTextPaint = new TextPaint();
         mTextPaint.density = res.getDisplayMetrics().density;
         mTextPaint.setCompatibilityScaling(compat.applicationScale);
 
-        mHighlightPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
+        mHighlightPaint = new Paint();
         mHighlightPaint.setCompatibilityScaling(compat.applicationScale);
 
         mMovement = getDefaultMovementMethod();
