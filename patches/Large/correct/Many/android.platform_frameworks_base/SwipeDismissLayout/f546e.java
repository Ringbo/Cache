diff --git a/core/java/com/android/internal/widget/SwipeDismissLayout.java b/core/java/com/android/internal/widget/SwipeDismissLayout.java
index 002573e..97b1634 100644
--- a/core/java/com/android/internal/widget/SwipeDismissLayout.java
+++ b/core/java/com/android/internal/widget/SwipeDismissLayout.java
@@ -45,10 +45,9 @@
         /**
          * Called when the layout has been swiped and the position of the window should change.
          *
-         * @param progress A number in [-1, 1] representing how far to the left
-         * or right the window has been swiped. Negative values are swipes
-         * left, and positives are right.
-         * @param translate A number in [-w, w], where w is the width of the
+         * @param progress A number in [0, 1] representing how far to the
+         * right the window has been swiped
+         * @param translate A number in [0, w], where w is the width of the
          * layout. This is equivalent to progress * layout.getWidth().
          */
         void onSwipeProgressChanged(SwipeDismissLayout layout, float progress, float translate);
@@ -207,7 +206,7 @@
 
     private void setProgress(float deltaX) {
         mTranslationX = deltaX;
-        if (mProgressListener != null) {
+        if (mProgressListener != null && deltaX >= 0)  {
             mProgressListener.onSwipeProgressChanged(this, deltaX / getWidth(), deltaX);
         }
     }
