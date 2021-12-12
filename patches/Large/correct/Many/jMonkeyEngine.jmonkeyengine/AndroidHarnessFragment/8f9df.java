diff --git a/jme3-android/src/main/java/com/jme3/app/AndroidHarnessFragment.java b/jme3-android/src/main/java/com/jme3/app/AndroidHarnessFragment.java
index 0de657c..1b205d6 100644
--- a/jme3-android/src/main/java/com/jme3/app/AndroidHarnessFragment.java
+++ b/jme3-android/src/main/java/com/jme3/app/AndroidHarnessFragment.java
@@ -362,7 +362,7 @@
     @Override
     public void onDestroyView() {
         logger.fine("onDestroyView");
-        if (splashImageView != null) {
+        if (splashImageView != null && splashImageView.getParent() != null) {
             ((ViewGroup) splashImageView.getParent()).removeView(splashImageView);
         }
         if (view.getParent() != null) {
