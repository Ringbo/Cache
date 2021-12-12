diff --git a/services/core/java/com/android/server/job/JobSchedulerService.java b/services/core/java/com/android/server/job/JobSchedulerService.java
index 899aada..27b3aa2 100644
--- a/services/core/java/com/android/server/job/JobSchedulerService.java
+++ b/services/core/java/com/android/server/job/JobSchedulerService.java
@@ -662,11 +662,13 @@
     public void onDeviceIdleStateChanged(boolean deviceIdle) {
         synchronized (mLock) {
             if (deviceIdle) {
-                // When becoming idle, make sure no jobs are actively running.
+                // When becoming idle, make sure no jobs are actively running,
+                // except those using the idle exemption flag.
                 for (int i=0; i<mActiveServices.size(); i++) {
                     JobServiceContext jsc = mActiveServices.get(i);
                     final JobStatus executing = jsc.getRunningJob();
-                    if (executing != null) {
+                    if (executing != null
+                            && (executing.getFlags() & JobInfo.FLAG_WILL_BE_FOREGROUND) == 0) {
                         jsc.cancelExecutingJob(JobParameters.REASON_DEVICE_IDLE);
                     }
                 }
