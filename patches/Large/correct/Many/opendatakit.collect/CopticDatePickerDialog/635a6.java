diff --git a/collect_app/src/main/java/org/odk/collect/android/fragments/dialogs/CopticDatePickerDialog.java b/collect_app/src/main/java/org/odk/collect/android/fragments/dialogs/CopticDatePickerDialog.java
index 44da5ca..ffe1456 100644
--- a/collect_app/src/main/java/org/odk/collect/android/fragments/dialogs/CopticDatePickerDialog.java
+++ b/collect_app/src/main/java/org/odk/collect/android/fragments/dialogs/CopticDatePickerDialog.java
@@ -62,7 +62,7 @@
                 .toDateTime()
                 .withChronology(CopticChronology.getInstance())
                 .toLocalDateTime();
-        setUpDayPicker(copticDate.getDayOfMonth(), copticDate.monthOfYear().getMaximumValue());
+        setUpDayPicker(copticDate.getDayOfMonth(), copticDate.dayOfMonth().getMaximumValue());
         setUpMonthPicker(copticDate.getMonthOfYear(), monthsArray);
         setUpYearPicker(copticDate.getYear(), MIN_SUPPORTED_YEAR, MAX_SUPPORTED_YEAR);
     }
