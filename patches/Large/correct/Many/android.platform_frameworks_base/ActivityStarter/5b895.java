diff --git a/services/core/java/com/android/server/am/ActivityStarter.java b/services/core/java/com/android/server/am/ActivityStarter.java
index ca842d5..85141fc 100644
--- a/services/core/java/com/android/server/am/ActivityStarter.java
+++ b/services/core/java/com/android/server/am/ActivityStarter.java
@@ -953,7 +953,7 @@
             // If we are not able to proceed, disassociate the activity from the task. Leaving an
             // activity in an incomplete state can lead to issues, such as performing operations
             // without a window container.
-            if (result != START_SUCCESS && mStartActivity.getTask() != null) {
+            if (result < START_SUCCESS && mStartActivity.getTask() != null) {
                 mStartActivity.getTask().removeActivity(mStartActivity);
             }
             mService.mWindowManager.continueSurfaceLayout();
