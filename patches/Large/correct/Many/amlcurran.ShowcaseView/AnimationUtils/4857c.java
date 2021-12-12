diff --git a/library/src/com/github/espiandev/showcaseview/anim/AnimationUtils.java b/library/src/com/github/espiandev/showcaseview/anim/AnimationUtils.java
index b719c1e..dc00a08 100644
--- a/library/src/com/github/espiandev/showcaseview/anim/AnimationUtils.java
+++ b/library/src/com/github/espiandev/showcaseview/anim/AnimationUtils.java
@@ -44,7 +44,7 @@
     }
 
     public static ObjectAnimator createFadeInAnimation(Object target, int duration, final AnimationStartListener listener) {
-        ObjectAnimator oa = ObjectAnimator.ofFloat(target, ALPHA, VISIBLE);
+        ObjectAnimator oa = ObjectAnimator.ofFloat(target, ALPHA, INVISIBLE, VISIBLE);
         oa.setDuration(duration).addListener(new Animator.AnimatorListener() {
             @Override
             public void onAnimationStart(Animator animator) {
