diff --git a/services/core/java/com/android/server/AlarmManagerService.java b/services/core/java/com/android/server/AlarmManagerService.java
index 65a5c23..a9a756e 100644
--- a/services/core/java/com/android/server/AlarmManagerService.java
+++ b/services/core/java/com/android/server/AlarmManagerService.java
@@ -1230,8 +1230,7 @@
         if (mAlarmBatches.size() > 0) {
             final Batch firstWakeup = findFirstWakeupBatchLocked();
             final Batch firstBatch = mAlarmBatches.get(0);
-            // always update the kernel alarms, as a backstop against missed wakeups
-            if (firstWakeup != null) {
+            if (firstWakeup != null && mNextWakeup != firstWakeup.start) {
                 mNextWakeup = firstWakeup.start;
                 setLocked(ELAPSED_REALTIME_WAKEUP, firstWakeup.start);
             }
@@ -1244,8 +1243,7 @@
                 nextNonWakeup = mNextNonWakeupDeliveryTime;
             }
         }
-        // always update the kernel alarm, as a backstop against missed wakeups
-        if (nextNonWakeup != 0) {
+        if (nextNonWakeup != 0 && mNextNonWakeup != nextNonWakeup) {
             mNextNonWakeup = nextNonWakeup;
             setLocked(ELAPSED_REALTIME, nextNonWakeup);
         }
