diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index ef306fe..0b87536 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -5549,7 +5549,7 @@
      * 
      * @see #awakenScrollBars(int)
      */
-    private void onDrawScrollBars(Canvas canvas) {
+    protected final void onDrawScrollBars(Canvas canvas) {
         // scrollbars are drawn only when the animation is running
         final ScrollabilityCache cache = mScrollCache;
         if (cache != null) {
