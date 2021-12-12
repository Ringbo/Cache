diff --git a/services/core/java/com/android/server/AlarmManagerService.java b/services/core/java/com/android/server/AlarmManagerService.java
index 47bf188..fc122f5 100644
--- a/services/core/java/com/android/server/AlarmManagerService.java
+++ b/services/core/java/com/android/server/AlarmManagerService.java
@@ -1644,7 +1644,7 @@
         if (mLastAlarmDeliveryTime <= 0) {
             return false;
         }
-        if (mPendingNonWakeupAlarms.size() > 0 && mNextNonWakeupDeliveryTime > nowELAPSED) {
+        if (mPendingNonWakeupAlarms.size() > 0 && mNextNonWakeupDeliveryTime < nowELAPSED) {
             // This is just a little paranoia, if somehow we have pending non-wakeup alarms
             // and the next delivery time is in the past, then just deliver them all.  This
             // avoids bugs where we get stuck in a loop trying to poll for alarms.
