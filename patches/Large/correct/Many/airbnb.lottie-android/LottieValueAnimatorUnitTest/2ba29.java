diff --git a/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java b/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
index a6d2d7f..800c285 100644
--- a/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
+++ b/lottie/src/test/java/com/airbnb/lottie/LottieValueAnimatorUnitTest.java
@@ -241,7 +241,7 @@
 
   @Test
   public void setMinFrameSmallerThanComposition() {
-    animator.setMaxFrame(-9000);
+    animator.setMinFrame(-9000);
     assertEquals(animator.getMinFrame(), composition.getStartFrame());
   }
 
