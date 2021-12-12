diff --git a/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DatePickerDialog.java b/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DatePickerDialog.java
index b3ac239..58b3b62 100644
--- a/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DatePickerDialog.java
+++ b/library/src/main/java/com/wdullaer/materialdatetimepicker/date/DatePickerDialog.java
@@ -232,7 +232,7 @@
             Bundle savedInstanceState) {
         Log.d(TAG, "onCreateView: ");
 
-        View view = inflater.inflate(R.layout.mdtp_date_picker_dialog, container);
+        View view = inflater.inflate(R.layout.mdtp_date_picker_dialog, container, false);
 
         mDayOfWeekView = (TextView) view.findViewById(R.id.date_picker_header);
         mMonthAndDayView = (LinearLayout) view.findViewById(R.id.date_picker_month_and_day);
