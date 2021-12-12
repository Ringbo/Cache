diff --git a/core/java/android/widget/DatePickerCalendarDelegate.java b/core/java/android/widget/DatePickerCalendarDelegate.java
index 0a23b34..b15d866 100755
--- a/core/java/android/widget/DatePickerCalendarDelegate.java
+++ b/core/java/android/widget/DatePickerCalendarDelegate.java
@@ -432,7 +432,8 @@
     public void setMinDate(long minDate) {
         mTempDate.setTimeInMillis(minDate);
         if (mTempDate.get(Calendar.YEAR) == mMinDate.get(Calendar.YEAR)
-                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMinDate.get(Calendar.DAY_OF_YEAR)) {
+                && mTempDate.get(Calendar.DAY_OF_YEAR) == mMinDate.get(Calendar.DAY_OF_YEAR)) {
+            // Same day, no-op.
             return;
         }
         if (mCurrentDate.before(mTempDate)) {
@@ -453,7 +454,8 @@
     public void setMaxDate(long maxDate) {
         mTempDate.setTimeInMillis(maxDate);
         if (mTempDate.get(Calendar.YEAR) == mMaxDate.get(Calendar.YEAR)
-                && mTempDate.get(Calendar.DAY_OF_YEAR) != mMaxDate.get(Calendar.DAY_OF_YEAR)) {
+                && mTempDate.get(Calendar.DAY_OF_YEAR) == mMaxDate.get(Calendar.DAY_OF_YEAR)) {
+            // Same day, no-op.
             return;
         }
         if (mCurrentDate.after(mTempDate)) {
