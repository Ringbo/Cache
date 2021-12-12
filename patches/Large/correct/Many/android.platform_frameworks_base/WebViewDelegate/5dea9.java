diff --git a/core/java/android/webkit/WebViewDelegate.java b/core/java/android/webkit/WebViewDelegate.java
index 23af384..94dc03c 100644
--- a/core/java/android/webkit/WebViewDelegate.java
+++ b/core/java/android/webkit/WebViewDelegate.java
@@ -156,7 +156,7 @@
      * Adds the WebView asset path to {@link android.content.res.AssetManager}.
      */
     public void addWebViewAssetPath(Context context) {
-        context.getAssets().addAssetPath(
+        context.getAssets().addAssetPathAsSharedLibrary(
                 WebViewFactory.getLoadedPackageInfo().applicationInfo.sourceDir);
     }
 }
