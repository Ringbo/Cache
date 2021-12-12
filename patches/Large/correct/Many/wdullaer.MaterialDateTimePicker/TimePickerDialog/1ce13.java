diff --git a/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java b/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
index a6b5f88..7b36bc5 100644
--- a/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
+++ b/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
@@ -598,7 +598,7 @@
 
         // Disable seconds picker
         if (!mEnableSeconds) {
-            mSecondSpaceView.setVisibility(View.GONE);
+            mSecondView.setVisibility(View.GONE);
             view.findViewById(R.id.separator_seconds).setVisibility(View.GONE);
         }
 
