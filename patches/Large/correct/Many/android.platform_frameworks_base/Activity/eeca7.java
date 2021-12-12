diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index d49adc2..f83f182 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -1764,7 +1764,7 @@
      */
     private void initActionBar() {
         Window window = getWindow();
-        if (!window.hasFeature(Window.FEATURE_ACTION_BAR) || mActionBar != null) {
+        if (isChild() || !window.hasFeature(Window.FEATURE_ACTION_BAR) || mActionBar != null) {
             return;
         }
         
