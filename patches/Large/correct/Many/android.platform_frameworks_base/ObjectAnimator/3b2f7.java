diff --git a/core/java/android/animation/ObjectAnimator.java b/core/java/android/animation/ObjectAnimator.java
index 9a2aa30..0c21c4f 100644
--- a/core/java/android/animation/ObjectAnimator.java
+++ b/core/java/android/animation/ObjectAnimator.java
@@ -977,8 +977,9 @@
     @Override
     void animateValue(float fraction) {
         final Object target = getTarget();
-        if (target == null) {
-            // We lost the target reference, cancel and clean up.
+        if (mTarget != null && target == null) {
+            // We lost the target reference, cancel and clean up. Note: we allow null target if the
+            /// target has never been set.
             cancel();
             return;
         }
