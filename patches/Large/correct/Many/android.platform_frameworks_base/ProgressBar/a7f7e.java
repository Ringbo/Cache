diff --git a/core/java/android/widget/ProgressBar.java b/core/java/android/widget/ProgressBar.java
index 54269e1..1dcb203 100644
--- a/core/java/android/widget/ProgressBar.java
+++ b/core/java/android/widget/ProgressBar.java
@@ -177,7 +177,8 @@
         Drawable drawable = a.getDrawable(R.styleable.ProgressBar_progressDrawable);
         if (drawable != null) {
             drawable = tileify(drawable, false);
-            // guess mMaxHeight. but allow XML layout to override this.
+            // Calling this method can set mMaxHeight, make sure the corresponding
+            // XML attribute for mMaxHeight is read after calling this method
             setProgressDrawable(drawable);
         }
 
@@ -423,8 +424,8 @@
         if (d != null) {
             d.setCallback(this);
 
-            // without this code, progress bar height will be updated.
-            int drawableHeight = drawable.getMinimumHeight();
+            // Make sure the ProgressBar is always tall enough
+            int drawableHeight = d.getMinimumHeight();
             if (mMaxHeight < drawableHeight) {
                 mMaxHeight = drawableHeight;
                 requestLayout();
