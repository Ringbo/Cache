diff --git a/core/java/android/widget/PopupWindow.java b/core/java/android/widget/PopupWindow.java
index 5fa4ad0..f442912 100644
--- a/core/java/android/widget/PopupWindow.java
+++ b/core/java/android/widget/PopupWindow.java
@@ -1253,7 +1253,7 @@
             unregisterForScrollChanged();
 
             try {
-                mWindowManager.removeView(mPopupView);                
+                mWindowManager.removeViewImmediate(mPopupView);
             } finally {
                 if (mPopupView != mContentView && mPopupView instanceof ViewGroup) {
                     ((ViewGroup) mPopupView).removeView(mContentView);
