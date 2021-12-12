diff --git a/graphics/java/android/graphics/drawable/AnimationDrawable.java b/graphics/java/android/graphics/drawable/AnimationDrawable.java
index 9eb0251..74ff1b0 100644
--- a/graphics/java/android/graphics/drawable/AnimationDrawable.java
+++ b/graphics/java/android/graphics/drawable/AnimationDrawable.java
@@ -375,7 +375,7 @@
                 mOneShot = orig.mOneShot;
             } else {
                 mDurations = new int[getCapacity()];
-                mOneShot = true;
+                mOneShot = false;
             }
         }
 
