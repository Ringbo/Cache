diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/ItemSlidingAnimator.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/ItemSlidingAnimator.java
index a18fd57..3cb8588 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/ItemSlidingAnimator.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/swipeable/ItemSlidingAnimator.java
@@ -136,12 +136,12 @@
             final int width = containerView.getWidth();
             final int height = containerView.getHeight();
 
-            if (horizontal && (proportional || width != 0)) {
+            if (horizontal && (!proportional || width != 0)) {
                 final int translationX;
                 translationX = (int) ((proportional ? width * amount : amount) + 0.5f);
                 return animateSlideInternalCompat(
                         holder, horizontal, translationX, 0, duration, interpolator, swipeFinish);
-            } else if (!horizontal && (proportional || height != 0)) {
+            } else if (!horizontal && (!proportional || height != 0)) {
                 final int translationY;
                 translationY = (int) ((proportional ? height * amount : amount) + 0.5f);
                 return animateSlideInternalCompat(
