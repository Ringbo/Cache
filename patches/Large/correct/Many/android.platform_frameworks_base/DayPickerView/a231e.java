diff --git a/core/java/android/widget/DayPickerView.java b/core/java/android/widget/DayPickerView.java
index 919c1e2..0f0e6c3 100644
--- a/core/java/android/widget/DayPickerView.java
+++ b/core/java/android/widget/DayPickerView.java
@@ -294,14 +294,15 @@
      * @param animate whether to smooth scroll to the new position
      * @param setSelected whether to set the specified day as selected
      *
-     * @throws IllegalArgumentException as of {@link android.os.Build.VERSION_CODES#N_MR1} if the
-     *         provided timeInMillis is before the range start or after the range end.
+     * @throws IllegalArgumentException if the build version is greater than
+     *         {@link android.os.Build.VERSION_CODES#N_MR1} and the provided timeInMillis is before
+     *         the range start or after the range end.
      */
     private void setDate(long timeInMillis, boolean animate, boolean setSelected) {
         getTempCalendarForTime(timeInMillis);
 
         final int targetSdkVersion = mContext.getApplicationInfo().targetSdkVersion;
-        if (targetSdkVersion >= N_MR1) {
+        if (targetSdkVersion > N_MR1) {
             if (mTempCalendar.before(mMinDate) || mTempCalendar.after(mMaxDate)) {
                 throw new IllegalArgumentException("timeInMillis must be between the values of "
                         + "getMinDate() and getMaxDate()");
