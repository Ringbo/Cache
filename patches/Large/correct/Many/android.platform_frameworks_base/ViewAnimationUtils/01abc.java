diff --git a/core/java/android/view/ViewAnimationUtils.java b/core/java/android/view/ViewAnimationUtils.java
index 7ced088..001cd01 100644
--- a/core/java/android/view/ViewAnimationUtils.java
+++ b/core/java/android/view/ViewAnimationUtils.java
@@ -27,9 +27,13 @@
     private ViewAnimationUtils() {}
     /**
      * Returns an Animator which can animate a clipping circle.
-     *
+     * <p>
      * Any shadow cast by the View will respect the circular clip from this animator.
-     *
+     * <p>
+     * Only a single non-rectangular clip can be applied on a View at any time.
+     * Views clipped by a circular reveal animation take priority over
+     * {@link View#setClipToOutline(boolean) View Outline clipping}.
+     * <p>
      * Note that the animation returned here is a one-shot animation. It cannot
      * be re-used, and once started it cannot be paused or resumed.
      *
@@ -39,7 +43,7 @@
      * @param startRadius The starting radius of the animating circle.
      * @param endRadius The ending radius of the animating circle.
      */
-    public static final Animator createCircularReveal(View view,
+    public static Animator createCircularReveal(View view,
             int centerX,  int centerY, float startRadius, float endRadius) {
         return new RevealAnimator(view, centerX, centerY, startRadius, endRadius);
     }
