diff --git a/core/java/android/view/RenderNodeAnimator.java b/core/java/android/view/RenderNodeAnimator.java
index c4a7160..d26a2f6 100644
--- a/core/java/android/view/RenderNodeAnimator.java
+++ b/core/java/android/view/RenderNodeAnimator.java
@@ -158,7 +158,7 @@
     }
 
     private void applyInterpolator() {
-        if (mInterpolator == null) return;
+        if (mInterpolator == null || mNativePtr == null) return;
 
         long ni;
         if (isNativeInterpolator(mInterpolator)) {
