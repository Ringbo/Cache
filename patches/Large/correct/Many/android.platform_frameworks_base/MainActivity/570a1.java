diff --git a/tests/JobSchedulerTestApp/src/com/android/demo/jobSchedulerApp/MainActivity.java b/tests/JobSchedulerTestApp/src/com/android/demo/jobSchedulerApp/MainActivity.java
index dfbbd7e..5aa0d4f 100644
--- a/tests/JobSchedulerTestApp/src/com/android/demo/jobSchedulerApp/MainActivity.java
+++ b/tests/JobSchedulerTestApp/src/com/android/demo/jobSchedulerApp/MainActivity.java
@@ -134,11 +134,11 @@
 
         String delay = mDelayEditText.getText().toString();
         if (delay != null && !TextUtils.isEmpty(delay)) {
-            builder.setMinimumLatency(Long.valueOf(delay) * 1000);
+            builder.setMinimumLatency(Long.parseLong(delay) * 1000);
         }
         String deadline = mDeadlineEditText.getText().toString();
         if (deadline != null && !TextUtils.isEmpty(deadline)) {
-            builder.setOverrideDeadline(Long.valueOf(deadline) * 1000);
+            builder.setOverrideDeadline(Long.parseLong(deadline) * 1000);
         }
         boolean requiresUnmetered = mWiFiConnectivityRadioButton.isChecked();
         boolean requiresAnyConnectivity = mAnyConnectivityRadioButton.isChecked();
