diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index d9f050b..657ccf7 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -1342,8 +1342,9 @@
     /*
      * returns the height of the titlebarview (if any). Does not care about
      * scrolling
+     * @hide
      */
-    int getTitleHeight() {
+    protected int getTitleHeight() {
         return mTitleBar != null ? mTitleBar.getHeight() : 0;
     }
 
@@ -3710,7 +3711,7 @@
             } else if (mTitleGravity == Gravity.TOP) {
                 newTop = mScrollY;
             }
-            mTitleBar.setBottom(newTop + getTitleHeight());
+            mTitleBar.setBottom(newTop + mTitleBar.getHeight());
             mTitleBar.setTop(newTop);
         }
         return super.drawChild(canvas, child, drawingTime);
@@ -3790,7 +3791,7 @@
             drawOverScrollBackground(canvas);
         }
         if (mTitleBar != null) {
-            canvas.translate(0, (int) mTitleBar.getHeight());
+            canvas.translate(0, getTitleHeight());
         }
         drawContent(canvas);
         canvas.restoreToCount(saveCount);
