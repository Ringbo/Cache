diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 142774f..a8d9f1d 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -4297,7 +4297,7 @@
 
     private int computeMaxScrollY() {
         int maxContentH = computeVerticalScrollRange() + getTitleHeight();
-        return Math.max(maxContentH - getHeight(), getTitleHeight());
+        return Math.max(maxContentH - getViewHeightWithTitle(), getTitleHeight());
     }
 
     public void flingScroll(int vx, int vy) {
