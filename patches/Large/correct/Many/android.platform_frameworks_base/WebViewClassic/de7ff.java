diff --git a/core/java/android/webkit/WebViewClassic.java b/core/java/android/webkit/WebViewClassic.java
index ca17d31..2947fa0 100644
--- a/core/java/android/webkit/WebViewClassic.java
+++ b/core/java/android/webkit/WebViewClassic.java
@@ -7890,7 +7890,7 @@
             functor = nativeGetDrawGLFunction(mNativeClass);
         }
 
-        if (functor != 0) {
+        if (functor != 0 && mWebView.getViewRootImpl()) {
             mWebView.getViewRootImpl().attachFunctor(functor);
         } else {
             // invalidate the screen so that the next repaint will show new content
