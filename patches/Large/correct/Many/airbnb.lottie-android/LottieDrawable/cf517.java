diff --git a/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java b/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
index 0238ecb..a10d24a 100644
--- a/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
+++ b/lottie/src/main/java/com/airbnb/lottie/LottieDrawable.java
@@ -32,7 +32,7 @@
   private boolean reverseAnimationWhenLayerAdded;
   private boolean systemAnimationsAreDisabled;
 
-  LottieDrawable() {
+  @SuppressWarnings("WeakerAccess") public LottieDrawable() {
     super(null);
 
     animator.setRepeatCount(0);
