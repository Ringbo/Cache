diff --git a/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java b/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
index 02e29af..f072649 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
@@ -431,14 +431,14 @@
                 hasButtons = true;
             }
         }
-        if (!bottom || topAndBottom) {
+        if ((!bottom || topAndBottom) && view.getChildCount() > 0) {
             mDrawTopDivider = mTitleBar != null &&
                     mTitleBar.getVisibility() != View.GONE &&
                     //Not scrolled to the top.
                     view.getScrollY() + view.getPaddingTop() > view.getChildAt(0).getTop();
 
         }
-        if (bottom || topAndBottom) {
+        if ((bottom || topAndBottom) && view.getChildCount() > 0) {
             mDrawBottomDivider = hasButtons &&
                     view.getScrollY() + view.getHeight() - view.getPaddingBottom() < view.getChildAt(view.getChildCount() - 1).getBottom();
         }
@@ -461,7 +461,8 @@
             return false;
         /* We scroll if the last item is not visible */
         final boolean lastItemVisible = lastVisible == count - 1;
-        return !lastItemVisible || view.getChildAt(view.getChildCount() - 1).getBottom() > view.getHeight() - view.getPaddingBottom();
+        return !lastItemVisible ||
+                (view.getChildCount() > 0 && view.getChildAt(view.getChildCount() - 1).getBottom() > view.getHeight() - view.getPaddingBottom());
     }
 
     private static boolean canScrollViewScroll(ScrollView sv) {
@@ -484,7 +485,7 @@
         boolean firstItemVisible = lv.getFirstVisiblePosition() == 0;
         boolean lastItemVisible = lv.getLastVisiblePosition() == lv.getCount() - 1;
 
-        if (firstItemVisible && lastItemVisible) {
+        if (firstItemVisible && lastItemVisible && lv.getChildCount() > 0) {
             /* Or the first item's top is above or own top */
             if (lv.getChildAt(0).getTop() < lv.getPaddingTop())
                 return true;
