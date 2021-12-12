diff --git a/core/java/android/widget/NumberPicker.java b/core/java/android/widget/NumberPicker.java
index 74ded18..2ac5a12 100644
--- a/core/java/android/widget/NumberPicker.java
+++ b/core/java/android/widget/NumberPicker.java
@@ -1969,8 +1969,10 @@
                  * Ensure the user can't type in a value greater than the max
                  * allowed. We have to allow less than min as the user might
                  * want to delete some numbers and then type a new number.
+                 * And prevent multiple-"0" that exceeds the length of upper
+                 * bound number.
                  */
-                if (val > mMaxValue) {
+                if (val > mMaxValue || result.length() > String.valueOf(mMaxValue).length()) {
                     return "";
                 } else {
                     return filtered;
