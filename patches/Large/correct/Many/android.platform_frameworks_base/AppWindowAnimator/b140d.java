diff --git a/services/core/java/com/android/server/wm/AppWindowAnimator.java b/services/core/java/com/android/server/wm/AppWindowAnimator.java
index ddbbde1..2b3901b 100644
--- a/services/core/java/com/android/server/wm/AppWindowAnimator.java
+++ b/services/core/java/com/android/server/wm/AppWindowAnimator.java
@@ -148,7 +148,7 @@
         }
         // Start out animation gone if window is gone, or visible if window is visible.
         transformation.clear();
-        transformation.setAlpha(mAppToken.hasContentToDisplay() ? 1 : 0);
+        transformation.setAlpha(mAppToken.isVisible() ? 1 : 0);
         hasTransformation = true;
         mStackClip = stackClip;
 
@@ -172,7 +172,7 @@
         animation = sDummyAnimation;
         hasTransformation = true;
         transformation.clear();
-        transformation.setAlpha(mAppToken.hasContentToDisplay() ? 1 : 0);
+        transformation.setAlpha(mAppToken.isVisible() ? 1 : 0);
     }
 
     void setNullAnimation() {
