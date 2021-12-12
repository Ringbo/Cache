diff --git a/core/java/android/webkit/WebViewClassic.java b/core/java/android/webkit/WebViewClassic.java
index 5a0818b..ba1c7e3 100644
--- a/core/java/android/webkit/WebViewClassic.java
+++ b/core/java/android/webkit/WebViewClassic.java
@@ -3877,7 +3877,7 @@
     private void scrollLayerTo(int x, int y) {
         int dx = mScrollingLayerRect.left - x;
         int dy = mScrollingLayerRect.top - y;
-        if (dx == 0 && y == 0) {
+        if (dx == 0 && dy == 0) {
             return;
         }
         if (mSelectingText) {
