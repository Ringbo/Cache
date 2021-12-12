diff --git a/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DayPickerGroup.java b/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DayPickerGroup.java
index 33568b5..dfa7d85 100644
--- a/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DayPickerGroup.java
+++ b/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DayPickerGroup.java
@@ -179,7 +179,7 @@
         // updateButtonVisibility only triggers when a scroll is completed. So a user might
         // click the button when the animation is still ongoing potentially pushing the target
         // position outside of the bounds of the dayPickerView
-        if (position >= 0 || position < dayPickerView.getCount()) {
+        if (position >= 0 && position < dayPickerView.getCount()) {
             dayPickerView.smoothScrollToPosition(position);
             updateButtonVisibility(position);
         }
