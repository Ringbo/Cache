diff --git a/services/core/java/com/android/server/wm/DragState.java b/services/core/java/com/android/server/wm/DragState.java
index e81d366..112e62f 100644
--- a/services/core/java/com/android/server/wm/DragState.java
+++ b/services/core/java/com/android/server/wm/DragState.java
@@ -645,15 +645,15 @@
             try (final SurfaceControl.Transaction transaction = new SurfaceControl.Transaction()) {
                 transaction.setPosition(
                         mSurfaceControl,
-                        (float) mAnimator.getAnimatedValue(ANIMATED_PROPERTY_X),
-                        (float) mAnimator.getAnimatedValue(ANIMATED_PROPERTY_Y));
+                        (float) animation.getAnimatedValue(ANIMATED_PROPERTY_X),
+                        (float) animation.getAnimatedValue(ANIMATED_PROPERTY_Y));
                 transaction.setAlpha(
                         mSurfaceControl,
-                        (float) mAnimator.getAnimatedValue(ANIMATED_PROPERTY_ALPHA));
+                        (float) animation.getAnimatedValue(ANIMATED_PROPERTY_ALPHA));
                 transaction.setMatrix(
                         mSurfaceControl,
-                        (float) mAnimator.getAnimatedValue(ANIMATED_PROPERTY_SCALE), 0,
-                        0, (float) mAnimator.getAnimatedValue(ANIMATED_PROPERTY_SCALE));
+                        (float) animation.getAnimatedValue(ANIMATED_PROPERTY_SCALE), 0,
+                        0, (float) animation.getAnimatedValue(ANIMATED_PROPERTY_SCALE));
                 transaction.apply();
             }
         }
