diff --git a/services/core/java/com/android/server/job/JobSchedulerService.java b/services/core/java/com/android/server/job/JobSchedulerService.java
index 53bdbea..d79b5fd 100644
--- a/services/core/java/com/android/server/job/JobSchedulerService.java
+++ b/services/core/java/com/android/server/job/JobSchedulerService.java
@@ -358,7 +358,7 @@
                 for (int i=0; i<jobs.size(); i++) {
                     JobStatus job = jobs.valueAt(i);
                     for (int controller=0; controller<mControllers.size(); controller++) {
-                        mControllers.get(i).deviceIdleModeChanged(mDeviceIdleMode);
+                        mControllers.get(controller).deviceIdleModeChanged(mDeviceIdleMode);
                         mControllers.get(controller).maybeStartTrackingJob(job);
                     }
                 }
