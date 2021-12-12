diff --git a/core/java/android/widget/DateTimeView.java b/core/java/android/widget/DateTimeView.java
index 6b845b0..6e6e4af 100644
--- a/core/java/android/widget/DateTimeView.java
+++ b/core/java/android/widget/DateTimeView.java
@@ -78,7 +78,7 @@
 
     @Override
     protected void onAttachedToWindow() {
-        super.onDetachedFromWindow();
+        super.onAttachedToWindow();
         registerReceivers();
         mAttachedToWindow = true;
     }
