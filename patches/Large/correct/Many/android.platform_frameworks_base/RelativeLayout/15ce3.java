diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index affc5da..339038e 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -522,7 +522,7 @@
         View baselineView = null;
         LayoutParams baselineParams = null;
         for (int i = 0; i < count; i++) {
-            final View child = getChildAt(i);
+            final View child = views[i];
             if (child.getVisibility() != GONE) {
                 final LayoutParams childParams = (LayoutParams) child.getLayoutParams();
                 if (baselineView == null || baselineParams == null
@@ -548,9 +548,9 @@
 
             if (offsetHorizontalAxis) {
                 for (int i = 0; i < count; i++) {
-                    View child = getChildAt(i);
+                    final View child = views[i];
                     if (child.getVisibility() != GONE) {
-                        LayoutParams params = (LayoutParams) child.getLayoutParams();
+                        final LayoutParams params = (LayoutParams) child.getLayoutParams();
                         final int[] rules = params.getRules(layoutDirection);
                         if (rules[CENTER_IN_PARENT] != 0 || rules[CENTER_HORIZONTAL] != 0) {
                             centerHorizontal(child, params, width);
@@ -578,9 +578,9 @@
 
             if (offsetVerticalAxis) {
                 for (int i = 0; i < count; i++) {
-                    View child = getChildAt(i);
+                    final View child = views[i];
                     if (child.getVisibility() != GONE) {
-                        LayoutParams params = (LayoutParams) child.getLayoutParams();
+                        final LayoutParams params = (LayoutParams) child.getLayoutParams();
                         final int[] rules = params.getRules(layoutDirection);
                         if (rules[CENTER_IN_PARENT] != 0 || rules[CENTER_VERTICAL] != 0) {
                             centerVertical(child, params, height);
@@ -607,9 +607,9 @@
             final int verticalOffset = contentBounds.top - top;
             if (horizontalOffset != 0 || verticalOffset != 0) {
                 for (int i = 0; i < count; i++) {
-                    View child = getChildAt(i);
+                    final View child = views[i];
                     if (child.getVisibility() != GONE && child != ignore) {
-                        LayoutParams params = (LayoutParams) child.getLayoutParams();
+                        final LayoutParams params = (LayoutParams) child.getLayoutParams();
                         if (horizontalGravity) {
                             params.mLeft += horizontalOffset;
                             params.mRight += horizontalOffset;
@@ -626,9 +626,9 @@
         if (isLayoutRtl()) {
             final int offsetWidth = myWidth - width;
             for (int i = 0; i < count; i++) {
-                View child = getChildAt(i);
+                final View child = views[i];
                 if (child.getVisibility() != GONE) {
-                    LayoutParams params = (LayoutParams) child.getLayoutParams();
+                    final LayoutParams params = (LayoutParams) child.getLayoutParams();
                     params.mLeft -= offsetWidth;
                     params.mRight -= offsetWidth;
                 }
