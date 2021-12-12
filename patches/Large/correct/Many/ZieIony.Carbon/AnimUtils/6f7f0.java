diff --git a/carbon/src/main/java/carbon/animation/AnimUtils.java b/carbon/src/main/java/carbon/animation/AnimUtils.java
index ac934c2..f02c6ba 100644
--- a/carbon/src/main/java/carbon/animation/AnimUtils.java
+++ b/carbon/src/main/java/carbon/animation/AnimUtils.java
@@ -99,7 +99,7 @@
                 view.setAlpha(0);
             float start = view.getAlpha();
             animator.setFloatValues(start, 1);
-            animator.setDuration((long) (2000 * (1 - start)));
+            animator.setDuration((long) (200 * (1 - start)));
         });
         animator.addUpdateListener(valueAnimator -> {
             View view = animator.getTarget();
