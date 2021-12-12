diff --git a/graphics/java/android/graphics/drawable/AnimationDrawable.java b/graphics/java/android/graphics/drawable/AnimationDrawable.java
index 871715e..e1975c9 100644
--- a/graphics/java/android/graphics/drawable/AnimationDrawable.java
+++ b/graphics/java/android/graphics/drawable/AnimationDrawable.java
@@ -151,7 +151,9 @@
         mAnimating = true;
 
         if (!isRunning()) {
-            run();
+            // Start from 0th frame.
+            setFrame(0, false, mAnimationState.getChildCount() > 1
+                    || !mAnimationState.mOneShot);
         }
     }
 
