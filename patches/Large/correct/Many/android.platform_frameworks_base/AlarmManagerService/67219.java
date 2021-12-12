diff --git a/services/core/java/com/android/server/AlarmManagerService.java b/services/core/java/com/android/server/AlarmManagerService.java
index b1560e6..02223c1 100644
--- a/services/core/java/com/android/server/AlarmManagerService.java
+++ b/services/core/java/com/android/server/AlarmManagerService.java
@@ -2458,9 +2458,9 @@
                         expectedClockTime = lastTimeChangeClockTime
                                 + (nowELAPSED - mLastTimeChangeRealtime);
                     }
-                    if (lastTimeChangeClockTime == 0 || nowRTC < (expectedClockTime-500)
-                            || nowRTC > (expectedClockTime+500)) {
-                        // The change is by at least +/- 500 ms (or this is the first change),
+                    if (lastTimeChangeClockTime == 0 || nowRTC < (expectedClockTime-1000)
+                            || nowRTC > (expectedClockTime+1000)) {
+                        // The change is by at least +/- 1000 ms (or this is the first change),
                         // let's do it!
                         if (DEBUG_BATCH) {
                             Slog.v(TAG, "Time changed notification from kernel; rebatching");
@@ -2477,7 +2477,8 @@
                         }
                         Intent intent = new Intent(Intent.ACTION_TIME_CHANGED);
                         intent.addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING
-                                | Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT);
+                                | Intent.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT
+                                | Intent.FLAG_RECEIVER_INCLUDE_BACKGROUND);
                         getContext().sendBroadcastAsUser(intent, UserHandle.ALL);
 
                         // The world has changed on us, so we need to re-evaluate alarms
