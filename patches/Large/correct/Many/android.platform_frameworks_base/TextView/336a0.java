diff --git a/core/java/android/widget/TextView.java b/core/java/android/widget/TextView.java
index aed2d5a..88730aac 100644
--- a/core/java/android/widget/TextView.java
+++ b/core/java/android/widget/TextView.java
@@ -5171,7 +5171,7 @@
             mDesiredHeightAtMeasure = desired;
 
             if (heightMode == MeasureSpec.AT_MOST) {
-                height = Math.min(desired, height);
+                height = Math.min(desired, heightSize);
             }
         }
 
