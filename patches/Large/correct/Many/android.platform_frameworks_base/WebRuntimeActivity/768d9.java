diff --git a/core/java/android/webruntime/WebRuntimeActivity.java b/core/java/android/webruntime/WebRuntimeActivity.java
index 07d9908..ec8c60c 100644
--- a/core/java/android/webruntime/WebRuntimeActivity.java
+++ b/core/java/android/webruntime/WebRuntimeActivity.java
@@ -141,7 +141,7 @@
 
             @Override
             public void onPageFinished(WebView view, String url) {
-                if (mSplashScreen.getVisibility() == View.VISIBLE) {
+                if (mSplashScreen != null && mSplashScreen.getVisibility() == View.VISIBLE) {
                     mSplashScreen.setVisibility(View.GONE);
                     mSplashScreen = null;
                 }
