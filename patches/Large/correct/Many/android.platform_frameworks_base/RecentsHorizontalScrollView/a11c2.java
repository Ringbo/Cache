diff --git a/packages/SystemUI/src/com/android/systemui/recent/RecentsHorizontalScrollView.java b/packages/SystemUI/src/com/android/systemui/recent/RecentsHorizontalScrollView.java
index 12d6cd9..2a5d1dd 100644
--- a/packages/SystemUI/src/com/android/systemui/recent/RecentsHorizontalScrollView.java
+++ b/packages/SystemUI/src/com/android/systemui/recent/RecentsHorizontalScrollView.java
@@ -103,7 +103,7 @@
                 "y", view.getY(), view.getY() + view.getHeight());
         anim.addListener(new AnimatorListenerAdapter() {
             public void onAnimationEnd(Animator animation) {
-                RecentsHorizontalScrollView.super.removeViewInLayout(view);
+                RecentsHorizontalScrollView.super.removeView(view);
             }
         });
         anim.start();
