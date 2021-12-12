diff --git a/packages/SystemUI/src/com/android/systemui/recent/RecentsVerticalScrollView.java b/packages/SystemUI/src/com/android/systemui/recent/RecentsVerticalScrollView.java
index 9dd170c..47ee4aa 100644
--- a/packages/SystemUI/src/com/android/systemui/recent/RecentsVerticalScrollView.java
+++ b/packages/SystemUI/src/com/android/systemui/recent/RecentsVerticalScrollView.java
@@ -104,7 +104,7 @@
                 "x", view.getX(), view.getX() + view.getWidth());
         anim.addListener(new AnimatorListenerAdapter() {
             public void onAnimationEnd(Animator animation) {
-                RecentsVerticalScrollView.super.removeViewInLayout(view);
+                RecentsVerticalScrollView.super.removeView(view);
             }
         });
         anim.start();
