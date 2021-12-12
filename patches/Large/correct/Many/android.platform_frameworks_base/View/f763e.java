diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 7e51096..307e700 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -10278,7 +10278,8 @@
      */
     @Visibility boolean dispatchVisibilityAggregated(boolean isVisible) {
         final boolean thisVisible = getVisibility() == VISIBLE;
-        if (thisVisible) {
+        // If we're not visible but something is telling us we are, ignore it.
+        if (thisVisible || !isVisible) {
             onVisibilityAggregated(isVisible);
         }
         return thisVisible && isVisible;
