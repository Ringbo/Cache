diff --git a/bottomsheet/src/main/java/com/flipboard/bottomsheet/BottomSheetLayout.java b/bottomsheet/src/main/java/com/flipboard/bottomsheet/BottomSheetLayout.java
index 58db681..55e82e9 100644
--- a/bottomsheet/src/main/java/com/flipboard/bottomsheet/BottomSheetLayout.java
+++ b/bottomsheet/src/main/java/com/flipboard/bottomsheet/BottomSheetLayout.java
@@ -495,7 +495,7 @@
     public void expandSheet() {
         cancelCurrentAnimation();
         setSheetLayerTypeIfEnabled(LAYER_TYPE_NONE);
-        ObjectAnimator anim = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, getHeight());
+        ObjectAnimator anim = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, getMaxSheetTranslation());
         anim.setDuration(ANIMATION_DURATION);
         anim.setInterpolator(animationInterpolator);
         anim.addListener(new CancelDetectionAnimationListener() {
