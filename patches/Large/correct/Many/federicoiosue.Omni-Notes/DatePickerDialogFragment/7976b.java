diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/utils/date/DatePickerDialogFragment.java b/omniNotes/src/main/java/it/feio/android/omninotes/utils/date/DatePickerDialogFragment.java
index 879a8a4..b51f2ad 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/utils/date/DatePickerDialogFragment.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/utils/date/DatePickerDialogFragment.java
@@ -114,7 +114,7 @@
         //
         // Of course, suggestions welcome.
         
-        final DatePickerDialog picker = new DatePickerDialog(getActivity(), 
+        final DatePickerDialog picker = new DatePickerDialog(getActivity(), DatePickerDialog.THEME_HOLO_LIGHT,
                 getConstructorListener(), y, m, d);
         picker.setTitle("");
 
