diff --git a/core/java/android/widget/ZoomButtonsController.java b/core/java/android/widget/ZoomButtonsController.java
index f7e9648..c0c8aec 100644
--- a/core/java/android/widget/ZoomButtonsController.java
+++ b/core/java/android/widget/ZoomButtonsController.java
@@ -403,7 +403,7 @@
             // No longer care about configuration changes
             mContext.unregisterReceiver(mConfigurationChangedReceiver);
 
-            mWindowManager.removeView(mContainer);
+            mWindowManager.removeViewImmediate(mContainer);
             mHandler.removeCallbacks(mPostedVisibleInitializer);
 
             if (mCallback != null) {
