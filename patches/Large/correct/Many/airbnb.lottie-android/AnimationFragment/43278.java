diff --git a/LottieSample/src/main/java/com/airbnb/lottie/samples/AnimationFragment.java b/LottieSample/src/main/java/com/airbnb/lottie/samples/AnimationFragment.java
index 917b564..3646fe3 100644
--- a/LottieSample/src/main/java/com/airbnb/lottie/samples/AnimationFragment.java
+++ b/LottieSample/src/main/java/com/airbnb/lottie/samples/AnimationFragment.java
@@ -187,7 +187,7 @@
   @OnClick(R.id.loop)
   void onLoopChanged() {
     loopButton.setActivated(!loopButton.isActivated());
-    animationView.loop(loopButton.isEnabled());
+    animationView.loop(loopButton.isActivated());
   }
 
   @OnClick(R.id.restart)
