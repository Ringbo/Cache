diff --git a/library/src/main/java/com/transitionseverywhere/ChangeText.java b/library/src/main/java/com/transitionseverywhere/ChangeText.java
index 207973b..48fec64 100644
--- a/library/src/main/java/com/transitionseverywhere/ChangeText.java
+++ b/library/src/main/java/com/transitionseverywhere/ChangeText.java
@@ -244,7 +244,7 @@
                         public void onAnimationUpdate(ValueAnimator animation) {
                             int currAlpha = (Integer) animation.getAnimatedValue();
                             view.setTextColor(currAlpha << 24 | Color.red(endColor) << 16 |
-                                    Color.green(endColor) << 8 | Color.red(endColor));
+                                    Color.green(endColor) << 8 | Color.blue(endColor));
                         }
                     });
                     inAnim.addListener(new AnimatorListenerAdapter() {
