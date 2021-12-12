diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index bf3d26e..3ed995b 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -5198,7 +5198,7 @@
             mDesiredHeightAtMeasure = desired;
 
             if (heightMode == MeasureSpec.AT_MOST) {
-                height = Math.min(desired, height);
+                height = Math.min(desired, heightSize);
             }
         }
 
