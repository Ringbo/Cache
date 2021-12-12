diff --git a/core/java/android/widget/TabWidget.java b/core/java/android/widget/TabWidget.java
index ea99f03..52a560c 100644
--- a/core/java/android/widget/TabWidget.java
+++ b/core/java/android/widget/TabWidget.java
@@ -221,7 +221,7 @@
      * @param drawable the right strip drawable
      */
     public void setRightStripDrawable(Drawable drawable) {
-        mBottomLeftStrip = drawable;
+        mBottomRightStrip = drawable;
         requestLayout();
         invalidate();    }
 
@@ -232,7 +232,7 @@
      * right strip drawable
      */
     public void setRightStripDrawable(int resId) {
-        mBottomLeftStrip = mContext.getResources().getDrawable(resId);
+        mBottomRightStrip = mContext.getResources().getDrawable(resId);
         requestLayout();
         invalidate();
     }
