diff --git a/services/core/java/com/android/server/AlarmManagerService.java b/services/core/java/com/android/server/AlarmManagerService.java
index 6f4ae15..85eeba0 100644
--- a/services/core/java/com/android/server/AlarmManagerService.java
+++ b/services/core/java/com/android/server/AlarmManagerService.java
@@ -3077,10 +3077,10 @@
 
                 if ((alarm.flags&AlarmManager.FLAG_ALLOW_WHILE_IDLE) != 0) {
                     // If this is an ALLOW_WHILE_IDLE alarm, we constrain how frequently the app can
-                    // schedule such alarms.
-                    final long lastTime = mLastAllowWhileIdleDispatch.get(alarm.creatorUid, 0);
+                    // schedule such alarms.  The first such alarm from an app is always delivered.
+                    final long lastTime = mLastAllowWhileIdleDispatch.get(alarm.creatorUid, -1);
                     final long minTime = lastTime + getWhileIdleMinIntervalLocked(alarm.creatorUid);
-                    if (nowELAPSED < minTime) {
+                    if (lastTime >= 0 && nowELAPSED < minTime) {
                         // Whoops, it hasn't been long enough since the last ALLOW_WHILE_IDLE
                         // alarm went off for this app.  Reschedule the alarm to be in the
                         // correct time period.
