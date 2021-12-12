diff --git a/core/java/android/widget/StackView.java b/core/java/android/widget/StackView.java
index 8b2f166..11bdd65 100644
--- a/core/java/android/widget/StackView.java
+++ b/core/java/android/widget/StackView.java
@@ -245,7 +245,7 @@
 
     private void transformViewAtIndex(int index, View view) {
         float maxPerspectiveShiftY = getMeasuredHeight() * PERSPECTIVE_SHIFT_FACTOR_Y;
-        float maxPerspectiveShiftX = getMeasuredHeight() * PERSPECTIVE_SHIFT_FACTOR_X;
+        float maxPerspectiveShiftX = getMeasuredWidth() * PERSPECTIVE_SHIFT_FACTOR_X;
 
         index = mMaxNumActiveViews - index - 1;
         if (index == mMaxNumActiveViews - 1) index--;
