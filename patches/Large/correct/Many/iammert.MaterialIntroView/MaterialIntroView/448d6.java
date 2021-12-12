diff --git a/materialintro/src/main/java/co/mobiwise/materialintro/view/MaterialIntroView.java b/materialintro/src/main/java/co/mobiwise/materialintro/view/MaterialIntroView.java
index e415686..08a5cfc 100644
--- a/materialintro/src/main/java/co/mobiwise/materialintro/view/MaterialIntroView.java
+++ b/materialintro/src/main/java/co/mobiwise/materialintro/view/MaterialIntroView.java
@@ -398,7 +398,7 @@
         AnimationFactory.animateFadeOut(this, fadeAnimationDuration, new AnimationListener.OnAnimationEndListener() {
             @Override
             public void onAnimationEnd() {
-                setVisibility(INVISIBLE);
+                setVisibility(GONE);
 
                 if (materialIntroListener != null)
                     materialIntroListener.onUserClicked(materialIntroViewId);
