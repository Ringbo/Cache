diff --git a/core/java/android/widget/StackView.java b/core/java/android/widget/StackView.java
index e2d78c0..aee48c6 100644
--- a/core/java/android/widget/StackView.java
+++ b/core/java/android/widget/StackView.java
@@ -325,7 +325,7 @@
 
     void updateClickFeedback() {
         if (!mClickFeedbackIsValid) {
-            View v = getViewAtRelativeIndex(0);
+            View v = getViewAtRelativeIndex(1);
             if (v != null) {
                 mClickFeedback.setImageBitmap(sHolographicHelper.createOutline(v,
                         HolographicHelper.CLICK_FEEDBACK));
