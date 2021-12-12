diff --git a/core/java/android/widget/DatePickerSpinnerDelegate.java b/core/java/android/widget/DatePickerSpinnerDelegate.java
index 17af014..1a6d351 100644
--- a/core/java/android/widget/DatePickerSpinnerDelegate.java
+++ b/core/java/android/widget/DatePickerSpinnerDelegate.java
@@ -288,7 +288,8 @@
     public void setMinDate(long minDate) {
         mTempDate.setTimeInMillis(minDate);
         if (mTempDate.get(Calendar.YEAR) == mMinDate.get(Calendar.YEAR)
-                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMinDate.get(Calendar.DAY_OF_YEAR)) {
+                && mTempDate.get(Calendar.DAY_OF_YEAR) == mMinDate.get(Calendar.DAY_OF_YEAR)) {
+            // Same day, no-op.
             return;
         }
         mMinDate.setTimeInMillis(minDate);
@@ -311,7 +312,8 @@
     public void setMaxDate(long maxDate) {
         mTempDate.setTimeInMillis(maxDate);
         if (mTempDate.get(Calendar.YEAR) == mMaxDate.get(Calendar.YEAR)
-                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMaxDate.get(Calendar.DAY_OF_YEAR)) {
+                && mTempDate.get(Calendar.DAY_OF_YEAR) == mMaxDate.get(Calendar.DAY_OF_YEAR)) {
+            // Same day, no-op.
             return;
         }
         mMaxDate.setTimeInMillis(maxDate);
