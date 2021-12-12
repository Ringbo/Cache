diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 4584de4..96cddb5 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -3970,7 +3970,9 @@
     @Override
     protected void onVisibilityChanged(View changedView, int visibility) {
         super.onVisibilityChanged(changedView, visibility);
-        if (visibility != View.VISIBLE) {
+        // The zoomManager may be null if the webview is created from XML that
+        // specifies the view's visibility param as not visible (see http://b/2794841)
+        if (visibility != View.VISIBLE && mZoomManager != null) {
             mZoomManager.dismissZoomPicker();
         }
     }
