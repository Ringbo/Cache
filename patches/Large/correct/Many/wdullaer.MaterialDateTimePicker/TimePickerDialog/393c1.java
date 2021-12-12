diff --git a/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java b/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
index 1238524..6a567ff 100644
--- a/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
+++ b/library/src/main/java/com/wdullaer/materialdatetimepicker/time/TimePickerDialog.java
@@ -294,7 +294,7 @@
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
             Bundle savedInstanceState) {
-        View view = inflater.inflate(R.layout.mdtp_time_picker_dialog, container);
+        View view = inflater.inflate(R.layout.mdtp_time_picker_dialog, container, false);
         KeyboardListener keyboardListener = new KeyboardListener();
         view.findViewById(R.id.time_picker_dialog).setOnKeyListener(keyboardListener);
 
