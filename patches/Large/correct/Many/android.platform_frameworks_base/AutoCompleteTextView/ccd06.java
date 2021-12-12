diff --git a/core/java/android/widget/AutoCompleteTextView.java b/core/java/android/widget/AutoCompleteTextView.java
index 4566c4c..953dd92 100644
--- a/core/java/android/widget/AutoCompleteTextView.java
+++ b/core/java/android/widget/AutoCompleteTextView.java
@@ -1325,7 +1325,7 @@
         final int maxHeight = mPopup.getMaxAvailableHeight(
                 getDropDownAnchorView(), mDropDownVerticalOffset, ignoreBottomDecorations);
 
-        if (mDropDownAlwaysVisible) {
+        if (mDropDownAlwaysVisible || mDropDownHeight == ViewGroup.LayoutParams.FILL_PARENT) {
             // getMaxAvailableHeight() subtracts the padding, so we put it back,
             // to get the available height for the whole window
             int padding = 0;
