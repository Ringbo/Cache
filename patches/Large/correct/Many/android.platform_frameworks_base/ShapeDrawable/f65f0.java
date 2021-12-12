diff --git a/graphics/java/android/graphics/drawable/ShapeDrawable.java b/graphics/java/android/graphics/drawable/ShapeDrawable.java
index caa0787..334b3bd 100644
--- a/graphics/java/android/graphics/drawable/ShapeDrawable.java
+++ b/graphics/java/android/graphics/drawable/ShapeDrawable.java
@@ -501,7 +501,7 @@
             if (mShapeState.mPaint != null) {
                 mShapeState.mPaint = new Paint(mShapeState.mPaint);
             } else {
-                mShapeState.mPaint = new Paint();
+                mShapeState.mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
             }
             if (mShapeState.mPadding != null) {
                 mShapeState.mPadding = new Rect(mShapeState.mPadding);
@@ -555,7 +555,7 @@
                 mAlpha = orig.mAlpha;
                 mShaderFactory = orig.mShaderFactory;
             } else {
-                mPaint = new Paint();
+                mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
             }
         }
 
