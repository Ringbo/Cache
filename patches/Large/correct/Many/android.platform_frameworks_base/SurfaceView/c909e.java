diff --git a/core/java/android/view/SurfaceView.java b/core/java/android/view/SurfaceView.java
index a2a4540..afc804c 100644
--- a/core/java/android/view/SurfaceView.java
+++ b/core/java/android/view/SurfaceView.java
@@ -256,9 +256,8 @@
         updateWindow(false, false);
     }
 
-    /** @hide */
     @Override
-    protected void onDetachedFromWindowInternal() {
+    protected void onDetachedFromWindow() {
         if (mGlobalListenersAdded) {
             ViewTreeObserver observer = getViewTreeObserver();
             observer.removeOnScrollChangedListener(mScrollChangedListener);
@@ -280,7 +279,7 @@
         mSession = null;
         mLayout.token = null;
 
-        super.onDetachedFromWindowInternal();
+        super.onDetachedFromWindow();
     }
 
     @Override
