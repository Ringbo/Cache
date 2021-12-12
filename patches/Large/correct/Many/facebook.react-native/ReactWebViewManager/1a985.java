diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/webview/ReactWebViewManager.java b/ReactAndroid/src/main/java/com/facebook/react/views/webview/ReactWebViewManager.java
index efe7bd7..6e15091 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/webview/ReactWebViewManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/webview/ReactWebViewManager.java
@@ -118,7 +118,8 @@
 
     @Override
     public boolean shouldOverrideUrlLoading(WebView view, String url) {
-        if (url.startsWith("http://") || url.startsWith("https://")) {
+        if (url.startsWith("http://") || url.startsWith("https://") ||
+            url.startsWith("file://")) {
           return false;
         } else {
           Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
