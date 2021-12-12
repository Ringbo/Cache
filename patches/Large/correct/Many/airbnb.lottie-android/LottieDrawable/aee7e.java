diff --git a/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java b/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
index a526eb0..839d9e0 100644
--- a/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
+++ b/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
@@ -291,7 +291,7 @@
         (int) (composition.getBounds().height() * scale));
   }
 
-  void cancelAnimation() {
+  @SuppressWarnings("WeakerAccess") public void cancelAnimation() {
     playAnimationWhenCompositionAdded = false;
     reverseAnimationWhenCompositionAdded = false;
     animator.cancel();
