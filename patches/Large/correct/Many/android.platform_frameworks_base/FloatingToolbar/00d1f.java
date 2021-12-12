diff --git a/core/java/com/android/internal/widget/FloatingToolbar.java b/core/java/com/android/internal/widget/FloatingToolbar.java
index fdc3547..b7a53b0 100644
--- a/core/java/com/android/internal/widget/FloatingToolbar.java
+++ b/core/java/com/android/internal/widget/FloatingToolbar.java
@@ -357,7 +357,7 @@
             mShowAnimation = createGrowFadeInFromBottom(mContentContainer);
             mDismissAnimation = createShrinkFadeOutFromBottomAnimation(
                     mContentContainer,
-                    0,
+                    150,  // startDelay
                     new AnimatorListenerAdapter() {
                         @Override
                         public void onAnimationEnd(Animator animation) {
@@ -367,7 +367,7 @@
                     });
             mHideAnimation = createShrinkFadeOutFromBottomAnimation(
                     mContentContainer,
-                    150,
+                    0,  // startDelay
                     new AnimatorListenerAdapter() {
                         @Override
                         public void onAnimationEnd(Animator animation) {
