diff --git a/src/org/thoughtcrime/securesms/components/camera/HidingImageButton.java b/src/org/thoughtcrime/securesms/components/camera/HidingImageButton.java
index e07bac3..0d2281c 100644
--- a/src/org/thoughtcrime/securesms/components/camera/HidingImageButton.java
+++ b/src/org/thoughtcrime/securesms/components/camera/HidingImageButton.java
@@ -26,7 +26,7 @@
   }
 
   public void hide() {
-    if (!isEnabled()) return;
+    if (!isEnabled() || getVisibility() == GONE) return;
     final Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.slide_to_right);
     animation.setAnimationListener(new AnimationListener() {
       @Override public void onAnimationStart(Animation animation) {}
@@ -39,7 +39,7 @@
   }
 
   public void show() {
-    if (!isEnabled()) return;
+    if (!isEnabled() || getVisibility() == VISIBLE) return;
     setVisibility(VISIBLE);
     animateWith(AnimationUtils.loadAnimation(getContext(), R.anim.slide_from_right));
   }
