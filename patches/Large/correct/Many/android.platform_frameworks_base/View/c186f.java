diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 30b8b85..ecacaca 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4348,13 +4348,13 @@
      * @return Whether any parent scrolled.
      */
     public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
-        if (mAttachInfo == null) {
+        if (mParent == null) {
             return false;
         }
 
         View child = this;
 
-        RectF position = mAttachInfo.mTmpTransformRect;
+        RectF position = (mAttachInfo != null) ? mAttachInfo.mTmpTransformRect : new RectF();
         position.set(rectangle);
 
         ViewParent parent = mParent;
