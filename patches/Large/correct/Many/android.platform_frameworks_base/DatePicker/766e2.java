diff --git a/core/java/android/widget/DatePicker.java b/core/java/android/widget/DatePicker.java
index 5f5943f..87bee44 100644
--- a/core/java/android/widget/DatePicker.java
+++ b/core/java/android/widget/DatePicker.java
@@ -999,8 +999,8 @@
 
         private boolean isNewDate(int year, int month, int dayOfMonth) {
             return (mCurrentDate.get(Calendar.YEAR) != year
-                    || mCurrentDate.get(Calendar.MONTH) != dayOfMonth
-                    || mCurrentDate.get(Calendar.DAY_OF_MONTH) != month);
+                    || mCurrentDate.get(Calendar.MONTH) != month
+                    || mCurrentDate.get(Calendar.DAY_OF_MONTH) != dayOfMonth);
         }
 
         private void setDate(int year, int month, int dayOfMonth) {
