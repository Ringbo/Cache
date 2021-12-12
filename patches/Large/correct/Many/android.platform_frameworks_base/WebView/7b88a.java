diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 66dad0b..6f4c6ff 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -2286,7 +2286,9 @@
     protected int computeHorizontalScrollRange() {
         if (mDrawHistory) {
             return mHistoryWidth;
-        } else if (mHorizontalScrollBarMode == SCROLLBAR_ALWAYSOFF) {
+        } else if (mHorizontalScrollBarMode == SCROLLBAR_ALWAYSOFF
+                && (mActualScale - mMinZoomScale <= MINIMUM_SCALE_INCREMENT)) {
+            // only honor the scrollbar mode when it is at minimum zoom level
             return computeHorizontalScrollExtent();
         } else {
             // to avoid rounding error caused unnecessary scrollbar, use floor
@@ -2298,7 +2300,9 @@
     protected int computeVerticalScrollRange() {
         if (mDrawHistory) {
             return mHistoryHeight;
-        } else if (mVerticalScrollBarMode == SCROLLBAR_ALWAYSOFF) {
+        } else if (mVerticalScrollBarMode == SCROLLBAR_ALWAYSOFF
+                && (mActualScale - mMinZoomScale <= MINIMUM_SCALE_INCREMENT)) {
+            // only honor the scrollbar mode when it is at minimum zoom level
             return computeVerticalScrollExtent();
         } else {
             // to avoid rounding error caused unnecessary scrollbar, use floor
